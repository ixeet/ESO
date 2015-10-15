package com.scolere.eso.service.iface;

import java.io.IOException;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.ContactUsForm;


public interface ContactFormHistServiceIface {
	
	public boolean saveContactFormHistory(ContactUsForm form)throws IOException,
	ServerException, ParseException;

}
