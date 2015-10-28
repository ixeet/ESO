package com.scolere.eso.application.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.scolere.eso.application.web.form.NewsLetterSignUpForm;
import com.scolere.eso.service.iface.NewsLetterHistServiceIface;
import com.scolere.eso.service.impl.NewsLetterHistServiceImpl;

/**
*
* @author akj
*/
public class NewsLetterSignUpAction extends ActionSupport implements ModelDriven<NewsLetterSignUpForm>{


	private static final long serialVersionUID = 1L;

	NewsLetterHistServiceIface newsLetterHistServiceIface = new NewsLetterHistServiceImpl();
	
	NewsLetterSignUpForm form;
	
	@Override
	public NewsLetterSignUpForm getModel() {
		form = new NewsLetterSignUpForm();
		return form;
	}

	
	// add the newLetter Signed up person data
	public String execute(){
		try{

			System.out.println("email--"+form.getEmail());
			System.out.println("name--"+form.getName());
			newsLetterHistServiceIface.addNewsletterHistory(form);

			 //addActionMessage("Thanks for NEWS LETTER SIGN UP.");

			HttpServletRequest request= ServletActionContext.getRequest();
			
			String msg = "Thanks for NEWS LETTER SIGN UP.";
			request.getSession().setAttribute("NewsLetter", form);		
			request.setAttribute("NewsLetterMsg", msg);		

		}catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}
	
	//send mail to the Signed Up person
	
	
	public String sendMail(){
		try{
		/*
			newsLetterHistVO = newsLetterHistServiceIface.saveNewsletterHistory(form);
			
				 HttpServletRequest request= ServletActionContext.getRequest();
				 request.getSession().setAttribute("BreakingNews", form);		
			*/
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}


}
