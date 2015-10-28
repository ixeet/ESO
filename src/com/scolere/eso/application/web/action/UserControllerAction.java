package com.scolere.eso.application.web.action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.constants.ESOConstants;
import com.scolere.eso.domain.vo.ESOUserVO;
import com.scolere.eso.domain.vo.InterestVO;
import com.scolere.eso.service.iface.ESOUserServiceIface;
import com.scolere.eso.service.impl.ESOUserServiceImpl;

/**
*
* @author akj
*/
public class UserControllerAction extends ActionSupport implements ModelDriven<EsoUserForm>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*	this is for Home page.......
	* 
	* 
	*/
	ESOUserVO eSOUserVO;
	HttpServletRequest request = ServletActionContext.getRequest();
	EsoUserForm form;
	File file;
	
	@Override
	public EsoUserForm getModel() {
		form = new EsoUserForm();
		return form;
	}
		
	ESOUserServiceIface eSOUserServiceIface = new ESOUserServiceImpl();
	
	public String execute(){
		
		try{
			System.out.println("In execute method....");
			request.getSession().setAttribute("selectedTab", "homeTab");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("In execute method Exeception...." +e);
		}
		return "SUCCESS";
	}
	
	
	//For User login.....
	public String executeLogin(){
		if(request.getSession().getAttribute("userVO") == null)
		try{
			ESOUserVO eSOUserVOLogin=eSOUserServiceIface.getUser(form);
			System.out.println("In executeLogin method....");

			if ( eSOUserVOLogin != null)//check if user exist
			{
				 eSOUserServiceIface.updateUserLoginFlag(eSOUserVOLogin);			 

				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("userVO", eSOUserVOLogin);
				 request.getSession().setAttribute("userVO1", form);

			}
			else
			{				
				System.out.println("no user exist");
				 String msg ="Either Email Id or Password is incorrect.";
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.setAttribute("userMsg", msg);
				 request.getSession().setAttribute("userVO", null);
			}
	
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In executeLogin method Exeception...." +e);
		}
		return SUCCESS;
	}
	
	
	//For CRM User login.....
	public String crmLogin(){
		String navig="success";
		if(request.getSession().getAttribute("crmUser") == null)
		try{
			ESOUserVO eSOUserVOLogin=eSOUserServiceIface.getCRMUser(form);
			System.out.println("In executeLogin method....");

			if ( eSOUserVOLogin != null)//check if crm user exist
			{
				List<InterestVO> interestVOList = eSOUserServiceIface.getUserInterest();
				int listSize = interestVOList.size();
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("crmUserInterest", interestVOList);
				 request.getSession().setAttribute("intrstSize", listSize);
				 request.getSession().setAttribute("usId", eSOUserVOLogin.getUserId());

				 navig="success";
			}
			else//check if crm user doesn't exist
			{
				 String msg ="You have entered wrong Email Id, or you are not first time user.";

				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("crmUser", null);
				 request.getSession().setAttribute("crmUserMsg", msg);

				 navig="failure";
			}				
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In crmLogin method Exeception...." +e);
		}
		return navig;
	}
	
	public String logout(){
		 HttpServletRequest request= ServletActionContext.getRequest();
		 request.getSession().removeAttribute("userVO");
		 return SUCCESS;		
	}

		//User full details......
	public String getUserDetail(){
		
		
		try{
			System.out.println("In getUserDetail method....");

			//eSOUserVO = eSOUserServiceIface.getUserDetails(id);
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("userExist", form);
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In getUserDetail method Exeception...." +e);

		}
		return SUCCESS;
	}
	
	//User can update the profile for first time login
	public String profileUpdate(){
		
		if(request.getSession().getAttribute("userVO") == null)

		try{
            //String filePath = ESOConstants.IMAGES_USER_PROFILE_URL;   	//profile pic saved in the folder
            String filePath = "C:/ESO/useProfilePics/";			//profile pic saved in the folder.
            System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, form.getUserImageFileName());
            System.out.println("File Path : "+filePath+form.getUserImageFileName());
            
            FileUtils.copyFile(form.getUserImage(), fileToCreate);//copy file to the folder filepath ;
            
            //For User Profile Update
			 eSOUserServiceIface.updateESOUserProfile(form);
			 
			 //For user Interest Update
			 if(form.getInterestId() != null && form.getInterestId().length == 0){				 

			 int[] interestIdNo = form.getInterestId();
			 int userId=form.getUserId();
			 System.out.println("User Id = "+userId);
			 int size=form.getInterestId().length;
			 for( int i=0;i<size;i++)
			 {
				 System.out.println("Interest Id = "+interestIdNo[i]);
				 int idNo = interestIdNo[i];
				 eSOUserServiceIface.updateESOUserInterest(userId,idNo);
			 }
			 }
			 //To add user other interests
			 if(form.getOtherInterestName() != null && !form.getOtherInterestName().equalsIgnoreCase("")){				 
				 	eSOUserServiceIface.addESOUserOtherInterest(form);
			 }
			 addActionMessage("Your profile has been updated.");

			 HttpServletRequest request= ServletActionContext.getRequest();
			 request.getSession().setAttribute("userVO", form);
			 
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In profileUpdate method Exeception...." +e);
		}
		return SUCCESS;
	}
	
	
	//for updating the profile picture
	public String myProfilePhotoUpdate(){
		
		if(request.getSession().getAttribute("profPic") == null)

		try{			
			ESOUserVO vo = (ESOUserVO)request.getSession().getAttribute("userVO");

            String filePath = ESOConstants.IMAGES_USER_PROFILE_URL;   	//profile pic saved in the folder
            //String filePath = "C:/ESO/useProfilePics/";   	//profile pic saved in the folder
            System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, form.getUserImageFileName());
            System.out.println("File Path : "+filePath+form.getUserImageFileName());
            
            FileUtils.copyFile(form.getUserImage(), fileToCreate);//copy file to the folder filepath ;
                      
			 eSOUserServiceIface.updateESOUserProfilePic(form);
			 addActionMessage("Your profile pic has been updated.");

			 HttpServletRequest request= ServletActionContext.getRequest();
			 request.getSession().setAttribute("profPic", form);
			request.getSession().setAttribute("userVO_2", vo);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In profileUpdate method Exeception...." +e);
		}
		return SUCCESS;
		
	}
	
	//reset the password in profile pic page.
	public String resetPassword(){
		try{
			ESOUserVO vo = (ESOUserVO)request.getSession().getAttribute("userVO");

			eSOUserServiceIface.restPassword(form);
			 addActionMessage("Your password has been updated.");

			 HttpServletRequest request= ServletActionContext.getRequest();
			 request.getSession().setAttribute("resetPass", form);
			 request.getSession().setAttribute("userVO_2", vo);
		}catch(Exception ex){
			
		}
		return SUCCESS;
	}
	
	//redirect to profile page
	public String toProfilepage(){
		if(request.getSession().getAttribute("userVO") != null)
		try{
			System.out.println("To profile  method....");
			ESOUserVO vo = (ESOUserVO)request.getSession().getAttribute("userVO");
			
			ESOUserVO eSOUserVOLogin=eSOUserServiceIface.getParentUser(vo);
			System.out.println("In executeLogin method....");

			if ( eSOUserVOLogin== null)//check if parent exist
			{
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("parentUser", eSOUserVOLogin);
			}	
			else
			{
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("parentUser", eSOUserVOLogin);
			}		
			request.getSession().setAttribute("userVO_2", vo);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("In execute method Exeception...." +e);
		}
		return SUCCESS;

	}
	

	//User can update the profile for first time login
	public String profileInfoUpdate(){
		if(request.getSession().getAttribute("userVO") != null)
			
		try{
			ESOUserVO vo = (ESOUserVO)request.getSession().getAttribute("userVO");

			 eSOUserServiceIface.updateProfileInfo(form);
			 addActionMessage("Your profile has been updated.");
			 request.getSession().setAttribute("userVO", form); 
			 request.getSession().setAttribute("userVO_2", vo);

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In profileUpdate method Exeception...." +e);
		}
		return SUCCESS;
	}
	

	
	//admin can save the new user data
	public String addNewUser(){
		try{
			//ESOUserVO eSOUserVOLogin=eSOUserServiceIface.getParentUser(form);
			System.out.println("In addNewUser method....");

				eSOUserServiceIface.addAlternativeUser(form);
				 addActionMessage("A new user added.");

				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("parentUser", form);

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In addNewUser method Exeception...." +e);
		}
		return SUCCESS;
	}

	//mail to the user.
	public String forgotPassword(){
		try{
			String from ="";
			String to = "";
			String subject = "";
			String message = "";
			
		  //  mailto(from, to, subject, message);
			 HttpServletRequest request= ServletActionContext.getRequest();
			 request.getSession().setAttribute("forgotPwd", form);
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In forgotPassword method Exeception...." +e);
		}
		return SUCCESS;
	}

	public String searchHealthTopic(String SearchTxt){
		try{
/*			if (eSOUserServiceIface.getUser(form).equals(null) )
			{
				temp = "ERROR";
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("Wrongpass", form);
			}
			else
			{
				eSOUserVO = eSOUserServiceIface.getUser(form);
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("ChangePassword", form);
				 temp =  "SUCCESS";
			}*/
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In searchHealthTopic method Exeception...." +e);
		}
		return SUCCESS;
	}


	public ESOUserVO geteSOUserVO() {
		return eSOUserVO;
	}


	public void seteSOUserVO(ESOUserVO eSOUserVO) {
		this.eSOUserVO = eSOUserVO;
	}


	public HttpServletRequest getRequest() {
		return request;
	}


	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

}
