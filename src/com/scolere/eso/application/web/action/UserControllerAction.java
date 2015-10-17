package com.scolere.eso.application.web.action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.scolere.eso.application.web.form.EsoUserForm;
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
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("userVO", form);
				 eSOUserServiceIface.updateUserLoginFlag(eSOUserVOLogin);
				 
			}
			else//check if user doesn't exist
			{
				 HttpServletRequest request= ServletActionContext.getRequest();
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
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("crmUser", null);
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
		 request.getSession().setAttribute("userVO", null);
		 //request.getSession().invalidate();

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
			
            String filePath = "C:/ESO/useProfilePics/";			//profile pic saved in the folder.
           // String filePath = request.getSession().getServletContext().getRealPath("/ESO/userProfilePics/");
            System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, form.getUserImageFileName());
            System.out.println("File Path : "+filePath+form.getUserImageFileName());
            
            FileUtils.copyFile(form.getUserImage(), fileToCreate);//copy file to the folder filepath ;
            
            //For User Profile Update
			 eSOUserServiceIface.updateESOUserProfile(form);
			 
			 //For user Interest Update
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
			 
			 //To add user other interests
			 if(form.getOtherInterestName() != null){				 
				 	eSOUserServiceIface.addESOUserOtherInterest(form);
			 }
			 
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
            String filePath = "C:/ESO/useProfilePics/";   	//profile pic saved in the folder
            System.out.println("Server path:" + filePath);
            File fileToCreate = new File(filePath, form.getUserImageFileName());
            System.out.println("File Path : "+filePath+form.getUserImageFileName());
            
            FileUtils.copyFile(form.getUserImage(), fileToCreate);//copy file to the folder filepath ;
                      
			 eSOUserServiceIface.updateESOUserProfilePic(form);
			 
			 HttpServletRequest request= ServletActionContext.getRequest();
			 request.getSession().setAttribute("profPic", form);
			 
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("In profileUpdate method Exeception...." +e);
		}
		return SUCCESS;
		
	}
	
	//reset the password in profile pic page.
	public String resetPassword(){
		try{
			eSOUserServiceIface.restPassword(form);
			 
			 HttpServletRequest request= ServletActionContext.getRequest();
			 request.getSession().setAttribute("resetPass", form);
			
		}catch(Exception ex){
			
		}
		return SUCCESS;
	}
	
	
	//admin can save the new user data
	public String addNewUser(){
		try{
				// eSOUserServiceIface.addNewUser(form);
				 
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("newUser", form);
			
			
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
			
		   // mailto(from, to, subject, message);
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

}
