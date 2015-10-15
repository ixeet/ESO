package com.scolere.eso.persistance.dao.iface;

import java.util.HashMap;

import com.scolere.eso.application.web.form.ContactUsForm;

public interface ContactUsDao {
	
	public HashMap<String, String> saveContactUs(ContactUsForm form);


}
