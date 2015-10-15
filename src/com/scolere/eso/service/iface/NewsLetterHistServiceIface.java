package com.scolere.eso.service.iface;

import java.io.IOException;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.NewsLetterSignUpForm;

public interface NewsLetterHistServiceIface {
	
	boolean addNewsletterHistory(NewsLetterSignUpForm form) throws IOException,
			ServerException, ParseException;
}
