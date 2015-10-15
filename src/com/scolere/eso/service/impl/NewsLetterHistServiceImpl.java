package com.scolere.eso.service.impl;

import java.io.IOException;
import java.util.Map;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ReportClient;

import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.NewsLetterSignUpForm;
import com.scolere.eso.persistance.dao.impl.NewsLetterSignUpDaoImpl;
import com.scolere.eso.persistance.factory.Config;
import com.scolere.eso.service.iface.NewsLetterHistServiceIface;

public class NewsLetterHistServiceImpl implements NewsLetterHistServiceIface{
	
    private ReportClient rc = Config.getReportClient();
    NewsLetterSignUpDaoImpl newsLetterSignUpDaoImpl=new NewsLetterSignUpDaoImpl();
    
    
	@Override
	public boolean addNewsletterHistory(NewsLetterSignUpForm form)
			throws IOException, ServerException, ParseException {
		
        String uri = rc.getURI(Config.LOGINEMAILID,Config.DATABASENAME,"NEWS_LETTER_HIST");
        Map result = rc.addRow(uri,newsLetterSignUpDaoImpl.saveNewsLetterInfo(form),null);
        //Map result = rc.addRow(uri,getRowValues(),null);
        
        System.out.println("Successfully added the row to " + uri);
        System.out.println(" The response is " + result);		
        
        return true;
	}

}
