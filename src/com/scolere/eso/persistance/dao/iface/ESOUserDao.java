package com.scolere.eso.persistance.dao.iface;

import java.util.HashMap;

import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;

public interface ESOUserDao {
	
	public ESOUserVO getUser(EsoUserForm form);
	
	public ESOUserVO getCRMUser(EsoUserForm form);
	
	public HashMap<String, String> profileUpdate(EsoUserForm form);
	
	//public ESOUserVO getUserDetail(EsoUserForm form);

	public HashMap saveESOUservO(EsoUserForm form);

	public ESOUserVO getUserDetail(String userId);

	HashMap<String, String> loginFlagUpdate(ESOUserVO vo);

}
