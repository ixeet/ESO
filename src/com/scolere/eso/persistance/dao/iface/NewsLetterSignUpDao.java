package com.scolere.eso.persistance.dao.iface;

import java.util.HashMap;

import com.scolere.eso.application.web.form.NewsLetterSignUpForm;

public interface NewsLetterSignUpDao {
	
	public HashMap<String, String> saveNewsLetterInfo(NewsLetterSignUpForm form);


}
