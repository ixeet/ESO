package com.scolere.eso.persistance.dao.impl;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;
import com.scolere.eso.persistance.dao.iface.ESOUserDao;
import com.scolere.eso.persistance.factory.ESODaoZohoAbstract;


public class ESOUserDaoImpl extends ESODaoZohoAbstract implements ESOUserDao{

	Connection conn = null;
	//PreparedStatement stmt = null;
    Statement stmt = null;
	ResultSet rs = null;
	ESOUserVO eSOUserVO = new ESOUserVO();
	
	@Override
	public ESOUserVO getUser(EsoUserForm form) {

		ESOUserVO eSOUserVO = null;
        try {
			conn = getCRMConnection();
			String sql ="SELECT * FROM eso_users where EMAIL = '"+form.getEmailId()+"' and PASSWORD = '"+form.getUserPassword()+"' and LOGIN_FLAG > 0";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);

        if(rs.next()){
        	eSOUserVO = new ESOUserVO();
        	eSOUserVO.setUserName(rs.getString("USER_NM"));
        	eSOUserVO.setEmailId(rs.getString("EMAIL"));
        	eSOUserVO.setUserPassword(rs.getString("PASSWORD"));
        	eSOUserVO.setLoginFlag(rs.getInt("LOGIN_FLAG"));
        	System.out.println("user exist ");
        	}
		} catch (Exception e) {
			System.out.println("getUser encounter exception"+e);
			e.printStackTrace();
		}
		
		return eSOUserVO;
	}
	

	@Override
	public ESOUserVO getCRMUser(EsoUserForm form) {
		
		ESOUserVO eSOUserVO = null;
        try {
			conn = getCRMConnection();
			String sql ="SELECT * FROM eso_users where EMAIL = '"+form.getEmailId()+"' and PASSWORD = '"+form.getUserPassword()+"' and LOGIN_FLAG = 0";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);

        if(rs.next()){
        	eSOUserVO = new ESOUserVO();
        	eSOUserVO.setUserName(rs.getString("USER_NM"));
        	eSOUserVO.setEmailId(rs.getString("EMAIL"));
        	eSOUserVO.setUserPassword(rs.getString("PASSWORD"));
        	eSOUserVO.setLoginFlag(rs.getInt("LOGIN_FLAG"));
        	System.out.println("CRM user exist");
        	}
		} catch (Exception e) {
			System.out.println("getCRMUser encounter exception"+e);
			e.printStackTrace();
		}
		
		return eSOUserVO;
	}
	
	@Override
	public ESOUserVO getUserDetail(String userId) {
		
		  try {
				conn = getCRMConnection();

				String sql ="SELECT * FROM eso_users where USER_ID = ?";
	   
				stmt = conn.prepareStatement(sql);
				//stmt.setString(1, userId);
								
				System.out.println("Query  --> "+sql);

	        rs = stmt.executeQuery(sql);
	        while(rs.next()){
	        	eSOUserVO.setUserName(rs.getString("USER_NM"));
	        	eSOUserVO.setEmailId(rs.getString("EMAIL_ID"));
	        	eSOUserVO.setCompanyName(rs.getString("COMPANY_NAME"));
	        	eSOUserVO.setDateOfBirth(rs.getString("DATE_OF_BIRTH"));
	        	eSOUserVO.setContactNo(rs.getString("CONTACT_NO"));
	        	eSOUserVO.setUserPassword(rs.getString("PASSWORD"));
	        	eSOUserVO.setProfilePic(rs.getString("PROFILE_PIC"));
	        	eSOUserVO.setUserTypeId(rs.getInt("USER_TYPE_ID"));
	        	eSOUserVO.setUserParentId(rs.getInt("USER_PARENT_ID"));
	        }
			} catch (Exception e) {
				System.out.println("getUser encounter exception"+e);
				e.printStackTrace();
			}
			
			return eSOUserVO;
	}


	@Override
	public HashMap<String, String> profileUpdate(EsoUserForm form) {
		
	    SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		HashMap rowValsMap = new HashMap();
        rowValsMap.put("FIRST_NM", form.getFname());
        rowValsMap.put("LAST_NM", form.getLname());
        rowValsMap.put("CONTACT_NO", form.getContactNo());
        rowValsMap.put("Password", form.getUserPassword());
        rowValsMap.put("ADDRESS1", form.getAddress());
        rowValsMap.put("ADDRESS2", form.getAddress2());
        rowValsMap.put("CITY", form.getCity());
        rowValsMap.put("STATE", form.getState());
        rowValsMap.put("COUNTRY", form.getCountry());
        rowValsMap.put("ZIP", form.getZip());
        rowValsMap.put("CONFIRM_PASSWORD", form.getConfirmPassword());
        rowValsMap.put("LOGIN_FLAG", '1'); 
        rowValsMap.put("PROFILE_PIC", form.getUserImageFileName());
        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));
        
        System.out.println("The Saved values are : "+rowValsMap);

		return rowValsMap;
	}



	@Override
	public HashMap saveESOUservO(EsoUserForm form) {
		
		HashMap rowValsMap = new HashMap();
        rowValsMap.put("Name", form.getUserName());
        rowValsMap.put("Email", form.getEmailId());
        rowValsMap.put("Password", form.getUserPassword());

        return rowValsMap;
	}



	@Override
	public HashMap<String, String> loginFlagUpdate(ESOUserVO vo) {
		
	    SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		HashMap rowValsMap = new HashMap();	
        rowValsMap.put("LOGIN_FLAG", vo.getLoginFlag()+1);
        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));

		return rowValsMap;
	}







}
