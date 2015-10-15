package com.scolere.eso.persistance.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.scolere.eso.application.web.form.ContactUsForm;
import com.scolere.eso.persistance.dao.iface.ContactUsDao;
import com.scolere.eso.persistance.factory.Config;

public class ContactUsDaoImpl extends Config implements ContactUsDao{

	@Override
	public HashMap<String, String> saveContactUs(ContactUsForm form) {
		
	       SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");       
			HashMap<String,String> rowValsMap = new HashMap<String,String>();
	        rowValsMap.put("NAME",form.getName());
	        rowValsMap.put("EMAIL",form.getEmail());
	        rowValsMap.put("INQUIRY",form.getInquiry());
	        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));

	        return rowValsMap;
	}

}
