package com.scolere.eso.service.iface;

import java.io.IOException;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;


public interface ESOUserServiceIface {
	
	public ESOUserVO getUser(EsoUserForm form);
	
	public ESOUserVO getCRMUser(EsoUserForm form);
	 	
	public boolean updateESOUserProfile(EsoUserForm form) throws IOException,
			ServerException, ParseException;

	boolean updateUserLoginFlag(ESOUserVO vo) throws IOException,
			ServerException, ParseException;
}
