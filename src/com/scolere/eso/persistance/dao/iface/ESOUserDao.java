package com.scolere.eso.persistance.dao.iface;

import java.util.HashMap;
import java.util.List;

import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;
import com.scolere.eso.domain.to.InterestTO;

public interface ESOUserDao {
	
	public ESOUserVO getUser(EsoUserForm form);
	
	public ESOUserVO getCRMUser(EsoUserForm form);
	
	public List<InterestTO> getUserInterest();

	public HashMap<String, String> profileUpdate(EsoUserForm form);
	
	public HashMap<String, String> saveUserInterest(int userId,int interestId);
	
	public HashMap<String, String> saveUserOtherInterest(EsoUserForm form);
	
	//public ESOUserVO getUserDetail(EsoUserForm form);

	public HashMap saveESOUservO(EsoUserForm form);

	public ESOUserVO getUserDetail(String userId);

	HashMap<String, String> loginFlagUpdate(ESOUserVO vo);

}
