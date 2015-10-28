package com.scolere.eso.persistance.dao.impl;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;
import com.scolere.eso.domain.constants.ESOConstants;
import com.scolere.eso.domain.to.InterestTO;
import com.scolere.eso.persistance.dao.iface.ESOUserDao;
import com.scolere.eso.persistance.factory.ESODaoZohoAbstract;


public class ESOUserDaoImpl extends ESODaoZohoAbstract implements ESOUserDao{

	Connection conn = null;
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
        	eSOUserVO.setUserId(rs.getInt("USER_ID"));
        	eSOUserVO.setUserName(rs.getString("USER_NM"));
        	eSOUserVO.setEmailId(rs.getString("EMAIL"));
        	eSOUserVO.setUserPassword(rs.getString("PASSWORD"));
        	eSOUserVO.setFirstName(rs.getString("FIRST_NM"));
        	eSOUserVO.setLastName(rs.getString("LAST_NM"));
        	eSOUserVO.setCompanyName(rs.getString("COMPANY_NAME"));
        	eSOUserVO.setContactNo(rs.getString("CONTACT_NO"));
        	eSOUserVO.setProfilePic(ESOConstants.IMAGES_USER_PROFILE_URL+rs.getString("PROFILE_PIC"));
        	eSOUserVO.setUserParentId(rs.getInt("USER_PARENT_ID"));
        	eSOUserVO.setLoginFlag(rs.getInt("LOGIN_FLAG"));
        	eSOUserVO.setAddress1(rs.getString("ADDRESS1"));
        	eSOUserVO.setAddress2(rs.getString("ADDRESS2"));
        	eSOUserVO.setCity(rs.getString("CITY"));
        	eSOUserVO.setZip(rs.getString("ZIP"));
        	eSOUserVO.setState(rs.getString("STATE"));
        	eSOUserVO.setCountry(rs.getString("COUNTRY"));
        	eSOUserVO.setLastUpdtTm(rs.getString("LAST_UPDT_TM"));
        	eSOUserVO.setHomeContact(rs.getString("HOME_CONTACT_NO"));
        	eSOUserVO.setWebsite(rs.getString("WEBSITE"));
        	System.out.println("user exist ");
        	}
		} catch (Exception e) {
			System.out.println("getUser encounter exception"+e);
			e.printStackTrace();
		} finally{
            closeResources(conn, stmt, rs);
		}
		
		return eSOUserVO;
	}
	

	@Override
	public ESOUserVO getCRMUser(EsoUserForm form) {
		
		ESOUserVO eSOUserVO = null;
        try {
			conn = getCRMConnection();
			String sql ="SELECT * FROM eso_users where EMAIL = '"+form.getEmailId()+"' and LOGIN_FLAG = 0";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);

        if(rs.next()){
        	eSOUserVO = new ESOUserVO();
        	eSOUserVO.setUserId(rs.getInt("USER_ID"));
        	eSOUserVO.setUserName(rs.getString("USER_NM"));
        	eSOUserVO.setEmailId(rs.getString("EMAIL"));
        	eSOUserVO.setUserPassword(rs.getString("PASSWORD"));
        	eSOUserVO.setLoginFlag(rs.getInt("LOGIN_FLAG"));
        	System.out.println("CRM user exist = "+eSOUserVO);
        	}
		} catch (Exception e) {
			System.out.println("getCRMUser encounter exception"+e);
			e.printStackTrace();
		}finally{
            closeResources(conn, stmt, rs);
		}
		
		return eSOUserVO;
	}
	
	@Override
	public ESOUserVO getParentUser(ESOUserVO vo) {

		ESOUserVO eSOUserVO = null;
        try {
			conn = getCRMConnection();
			String sql ="SELECT * FROM eso_users where USER_PARENT_ID = "+vo.getUserId();
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);

        if(rs.next()){
        	eSOUserVO = new ESOUserVO();
        	eSOUserVO.setAddedUsername(rs.getString("USER_NM"));
        	eSOUserVO.setAddedEmailId(rs.getString("EMAIL"));
        	eSOUserVO.setUserParentId(rs.getInt("USER_PARENT_ID"));
        	System.out.println("user exist ");
        	}
		} catch (Exception e) {
			System.out.println("getUser encounter exception"+e);
			e.printStackTrace();
		}finally{
            closeResources(conn, stmt, rs);
		}
		
		return eSOUserVO;
	}
	
	@Override
	public List<InterestTO> getUserInterest() {
		List<InterestTO> interestTOList = null;
		InterestTO interestTO2 = null;
		try{
			conn = getCRMConnection();
			String sql ="SELECT * FROM USER_INTERESTS";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);
	          interestTOList = new ArrayList<InterestTO>();
	          while(rs.next()){
	        	interestTO2 = new InterestTO(rs.getInt("INTEREST_ID"),rs.getString("INTEREST_NM"));
/*	        	interestTO2 = new InterestTO();
	        	interestTO2.setInterestId(rs.getInt("INTEREST_ID"));
	        	interestTO2.setInterestName(rs.getString("INTEREST_NM"));*/
	        	interestTOList.add(interestTO2);
	        	
/*	        	int id = rs.getint("interest_id");
	        	string iname = rs.getstring("interest_nm");
	        	interesttolist.add(id, iname);*/
	          }
		}catch(Exception e){
			System.out.println("getUserInterest encounter exception"+e);
			e.printStackTrace();
		}finally{
            closeResources(conn, stmt, rs);
		}
		return interestTOList;
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
			}finally{
	            closeResources(conn, stmt, rs);
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
	public HashMap<String, String> saveUserInterest(int userId,int interestId) {
		
	    SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    
		HashMap rowValsMap = new HashMap();
        rowValsMap.put("USER_ID", userId );
        rowValsMap.put("INTEREST_ID", interestId);
        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));

        return rowValsMap;
	}


	@Override
	public HashMap<String, String> saveUserOtherInterest(EsoUserForm form) {
		
		HashMap rowValsMap = new HashMap();
        rowValsMap.put("INTEREST_NM", form.getOtherInterestName());
        
		return rowValsMap;

	}
	@Override
	public HashMap saveESOUservO(EsoUserForm form) {
		
		HashMap rowValsMap = new HashMap();
        rowValsMap.put("USER_NM", form.getAddedUsername());
        rowValsMap.put("EMAIL", form.getAddedEmailId());
        rowValsMap.put("PASSWORD", form.getAddedPassword());
        rowValsMap.put("LOGIN_FLAG", '0');
        rowValsMap.put("USER_PARENT_ID", form.getUserId());

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


	@Override
	public HashMap<String, String> profilePicUpdate(EsoUserForm form) {
		
	    SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		HashMap rowValsMap = new HashMap();
        rowValsMap.put("PROFILE_PIC", form.getUserImageFileName());
        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));
        
        System.out.println("The Saved Profile pic are : "+rowValsMap);

		return rowValsMap;
	}

	@Override
	public HashMap<String, String> profileInfoUpdate(EsoUserForm form) {
		
	    SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		HashMap rowValsMap = new HashMap();
        rowValsMap.put("FIRST_NM", form.getFname());
        rowValsMap.put("LAST_NM", form.getLname());
        rowValsMap.put("CONTACT_NO", form.getContactNo());
        rowValsMap.put("ADDRESS1", form.getAddress());
        rowValsMap.put("CITY", form.getCity());
        rowValsMap.put("STATE", form.getState());
        rowValsMap.put("COUNTRY", form.getCountry());
        rowValsMap.put("ZIP", form.getZip());
        rowValsMap.put("COMPANY_NAME", form.getCompanyName());
        rowValsMap.put("HOME_CONTACT_NO", form.getHomeContactNo());
        rowValsMap.put("WEBSITE", form.getWebsite());
        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));
        
        System.out.println("The Saved values are : "+rowValsMap);

		return rowValsMap;
	}

	@Override
	public HashMap<String, String> resetPassword(EsoUserForm form) {
		
	    SimpleDateFormat dtFmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		HashMap rowValsMap = new HashMap();

        rowValsMap.put("Password", form.getUserPassword());
        rowValsMap.put("CONFIRM_PASSWORD", form.getConfirmPassword());
        rowValsMap.put("LAST_UPDT_TM",dtFmt.format(new Date()));
        
        System.out.println("The Saved passwords are : "+rowValsMap);

		return rowValsMap;
	}






}
