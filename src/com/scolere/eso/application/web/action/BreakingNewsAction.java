package com.scolere.eso.application.web.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
*
* @author akj
*/
public class BreakingNewsAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*	this is for Home page.......
	* 
	* 
	*/
	String temp;
	
	public String getBreakingNews(){
		try{
			/*if (eSOUserServiceIface.getUser(form).equals(null) )
			{
				temp = "ERROR";
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("NoBreakingNews", form);
			}
			else
			{
				eSOUserVO = eSOUserServiceIface.getUser(form);
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("BreakingNews", form);
				 temp =  "SUCCESS";
			}
			*/
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	
	public String addBreakingNews(){
		try{
			/*if (eSOUserServiceIface.getUser(form).equals(null) )
			{
				temp = "ERROR";
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("NoBreakingNews", form);
			}
			else
			{
				eSOUserVO = eSOUserServiceIface.getUser(form);
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("BreakingNews", form);
				 temp =  "SUCCESS";
			}*/
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String updateBreakingNews(){
		try{
			/*if (eSOUserServiceIface.getUser(form).equals(null) )
			{
				temp = "ERROR";
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("NoBreakingNews", form);
			}
			else
			{
				eSOUserVO = eSOUserServiceIface.getUser(form);
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("BreakingNews", form);
				 temp =  "SUCCESS";
			}*/
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String deleteBreakingNews(){
		try{
			/*if (eSOUserServiceIface.getUser(form).equals(null) )
			{
				temp = "ERROR";
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("NoBreakingNews", form);
			}
			else
			{
				eSOUserVO = eSOUserServiceIface.getUser(form);
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("BreakingNews", form);
				 temp =  "SUCCESS";
			}*/
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
/*	public ActionForward executeHome(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)  {
		try{
							
		System.out.println("Inside Breaking News database..........");
		
		ArrayList<> al=null;
		al=(ArrayList<>) classMasterDaoImpl.getClassMasterList();
		request.setAttribute("classMasterList", al);
		System.out.print("class entered");
		
		return mapping.findForward("list_of_breaking_news");

		}catch(Exception e)
		{
			System.out.println("Some Exception"+e);
		}
		return null;
		
		}
		this is for List method.......
	* 
	* 
	
		public ActionForward searchBreakingNews(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)  {
		try{
							
		System.out.println("Breaking New data listed  in database..........");

		ArrayList<ClassMasterVO> al=null;
		al=(ArrayList<ClassMasterVO>) classMasterDaoImpl.getClassMasterList();
		request.setAttribute("classMasterList", al);
		System.out.print("class entered");
				
		}catch(Exception e)
		{
			System.out.println("Some Exception"+e);
		}
		return mapping.findForward("searchList_of_Breaking_News");
		
		}*/

}
