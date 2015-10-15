package com.scolere.eso.service.impl;

import java.io.IOException;
import java.util.Map;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ReportClient;
import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.ContactUsForm;
import com.scolere.eso.persistance.dao.impl.ContactUsDaoImpl;
import com.scolere.eso.persistance.factory.Config;
import com.scolere.eso.service.iface.ContactFormHistServiceIface;

public class ContactFormHistServiceImpl implements ContactFormHistServiceIface{
	
	 private ReportClient rc = Config.getReportClient();
	 ContactUsDaoImpl contactUsDaoImpl = new ContactUsDaoImpl();
	 
	@Override
	public boolean saveContactFormHistory(ContactUsForm form)
			throws IOException, ServerException, ParseException {
		
		
        String uri = rc.getURI(Config.LOGINEMAILID,Config.DATABASENAME,"CONTACT_FORM_HIST");
        Map result = rc.addRow(uri,contactUsDaoImpl.saveContactUs(form),null);
        //Map result = rc.addRow(uri,getRowValues(),null);
        
        System.out.println("Successfully added the row to " + uri);
        System.out.println(" The response is " + result);		
        
		return true;
	}

}
