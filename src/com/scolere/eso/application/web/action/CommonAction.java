package com.scolere.eso.application.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.scolere.eso.domain.vo.ESOUserVO;

/**
*
* @author akj
*/
public class CommonAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	HttpServletRequest servletRequest;
	ESOUserVO eSOUserVO;
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String  aboutUsDetail() {
		try{
			
			request.getSession().setAttribute("selectedTab", "aboutUsTab");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	
	
	public String  breakingNewsDetails() {
		try{
			request.getSession().setAttribute("selectedTab","breakingNewsTab");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	
	
	public String  contactUsDetail() {
		try{
			request.getSession().setAttribute("selectedTab","contactUsTab");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}



	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}



	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	
	

}
