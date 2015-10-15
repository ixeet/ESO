package com.scolere.eso.application.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.scolere.eso.persistance.dao.iface.ESOUserDao;
import com.scolere.eso.persistance.factory.EsoDaoFactory;

/**
*
* @author akj
*/
public class HealthTopicAction extends ActionSupport{
	
	/*	this is for Home page.......
	* 
	* 
	*/
	
	public String execute(){

		return "SUCCESS";
	}

	
/*	public ActionForward executeTopic(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)  {
		try{
							
		System.out.println("Inside health topic database..........");
		
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
	
		public ActionForward executeList(ActionMapping mapping,ActionForm form,
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
		return mapping.findForward("list_of_Breaking_New");
		
		}
*/
}
