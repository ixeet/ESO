package com.scolere.eso.persistance.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.scolere.eso.application.web.form.NewsLetterSignUpForm;
import com.scolere.eso.persistance.dao.iface.NewsLetterSignUpDao;
import com.scolere.eso.persistance.factory.Config;

public class NewsLetterSignUpDaoImpl extends Config implements NewsLetterSignUpDao{

	@Override
	public HashMap<String,String> saveNewsLetterInfo(NewsLetterSignUpForm form) { 
		
	       SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			HashMap<String,String> rowValsMap = new HashMap<String,String>();
	        rowValsMap.put("Name",form.getName());
	        rowValsMap.put("Email",form.getEmail());
	        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));
	        
	        return rowValsMap;
	    }

	
	}




