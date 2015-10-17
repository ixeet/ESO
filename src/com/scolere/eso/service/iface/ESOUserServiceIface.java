package com.scolere.eso.service.iface;

import java.io.IOException;
import java.util.List;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;
import com.scolere.eso.domain.vo.InterestVO;


public interface ESOUserServiceIface {
	
	public ESOUserVO getUser(EsoUserForm form);
	
	public ESOUserVO getCRMUser(EsoUserForm form);
	
	public List<InterestVO> getUserInterest();
	 	
	public boolean updateESOUserProfile(EsoUserForm form) throws IOException,
			ServerException, ParseException;
	
	public boolean updateESOUserInterest(int userId,int interestId) throws IOException,
	ServerException, ParseException;

	public boolean addESOUserOtherInterest(EsoUserForm form) throws IOException,
	ServerException, ParseException;
	
	boolean updateUserLoginFlag(ESOUserVO vo) throws IOException,
			ServerException, ParseException;
}
