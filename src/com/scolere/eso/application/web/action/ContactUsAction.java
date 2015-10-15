package com.scolere.eso.application.web.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.scolere.eso.application.web.form.ContactUsForm;
import com.scolere.eso.service.impl.ContactFormHistServiceImpl;
import com.scolere.eso.service.iface.ContactFormHistServiceIface;
/**
*
* @author akj
*/
public class ContactUsAction extends ActionSupport implements ModelDriven<ContactUsForm>{
	
	private static final long serialVersionUID = 1L;
	
	ContactFormHistServiceIface contactFormHistServiceIface = new ContactFormHistServiceImpl();
	
	ContactUsForm form;
	@Override
	public ContactUsForm getModel() {
		form = new ContactUsForm();
		return form;
	}
	//method for contact Us form
	public String execute(){
		try{
			System.out.println("email--"+form.getEmail());
			System.out.println("name--"+form.getName());
			System.out.println("name--"+form.getInquiry());

			contactFormHistServiceIface.saveContactFormHistory(form);


			HttpServletRequest request= ServletActionContext.getRequest();
			request.getSession().setAttribute("ContactUsHist", form);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
