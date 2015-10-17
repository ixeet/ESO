package com.scolere.eso.persistance.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.scolere.eso.domain.to.BreakingNewsTO;
import com.scolere.eso.domain.vo.BreakingNewsVO;
import com.scolere.eso.persistance.dao.iface.BreakingNewsDao;
import com.scolere.eso.persistance.factory.ESODaoZohoAbstract;

public class BreakingNewsDaoImpl extends ESODaoZohoAbstract implements BreakingNewsDao{
	
	Connection conn = null;
    Statement stmt = null;
	ResultSet rs = null;
	
	
	@Override
	public List<BreakingNewsTO> getRecentBreakingNewsList() {
		List<BreakingNewsTO> breakingNewsTO = null;
		BreakingNewsTO newsTO = null;
		try{
			conn = getCRMConnection();
			String sql ="SELECT * FROM BREAKING_NEWS order by LAST_UPDT_TM desc";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);
	          
	          breakingNewsTO = new ArrayList<BreakingNewsTO>();
	          
	          while(rs.next()){
	        	newsTO = new BreakingNewsTO();
	        	newsTO.setNewsId(rs.getInt("NEWS_ID"));
	        	newsTO.setNewsTitle(rs.getString("NEWS_TITLE"));
	        	newsTO.setDescTxt(rs.getString("DESC_TXT"));
	        	newsTO.setFileName(rs.getString("FILE_NAME"));
	        	newsTO.setAuthorName(rs.getString("AUTHOR_NAME"));
	        	newsTO.setAuthorImg(rs.getString("AUTHOR_IMG"));
	        	newsTO.setAuthorDetails(rs.getString("AUTHOR_DETAILS"));
	        	newsTO.setIsPopular(rs.getString("IS_POPULAR"));
	        	newsTO.setDisplayOrder(rs.getInt("DISPLAY_ORDER"));
	        	newsTO.setEnableFl(rs.getString("ENABLE_FL"));
	        	newsTO.setLastUpdtBy(rs.getInt("LAST_UPDT_BY"));
	        	newsTO.setLastUpdtTm(rs.getString("LAST_UPDT_TM"));
	        	
	        	breakingNewsTO.add(newsTO);
	        	
	        	System.out.println("breaking news List");
	        	
	          }
	          }catch(Exception e){
	        	  System.out.println("");
	          }
		return breakingNewsTO;

	}
	
	
	@Override
	public List<BreakingNewsTO> getPopularBreakingNewsList() {
		List<BreakingNewsTO> breakingNewslist = null;
		BreakingNewsTO newsTO = null;
		try{
			conn = getCRMConnection();
			String sql ="SELECT * FROM BREAKING_NEWS order by IS_POPULAR desc";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);
	          
	          breakingNewslist = new ArrayList<BreakingNewsTO>();
	          
	          while(rs.next()){
	        	newsTO = new BreakingNewsTO();
	        	newsTO.setNewsId(rs.getInt("NEWS_ID"));
	        	newsTO.setNewsTitle(rs.getString("NEWS_TITLE"));
	        	newsTO.setDescTxt(rs.getString("DESC_TXT"));
	        	newsTO.setFileName(rs.getString("FILE_NAME"));
	        	newsTO.setAuthorName(rs.getString("AUTHOR_NAME"));
	        	newsTO.setAuthorImg(rs.getString("AUTHOR_IMG"));
	        	newsTO.setAuthorDetails(rs.getString("AUTHOR_DETAILS"));
	        	newsTO.setIsPopular(rs.getString("IS_POPULAR"));
	        	newsTO.setDisplayOrder(rs.getInt("DISPLAY_ORDER"));
	        	newsTO.setEnableFl(rs.getString("ENABLE_FL"));
	        	newsTO.setLastUpdtBy(rs.getInt("LAST_UPDT_BY"));
	        	newsTO.setLastUpdtTm(rs.getString("LAST_UPDT_TM"));
	        	
	        	breakingNewslist.add(newsTO);
	        	
	        	System.out.println("breaking news List");
	        	
	          }
	          }catch(Exception e){
	        	  System.out.println("");
	          }
		return breakingNewslist;
	}
	

	@Override
	public BreakingNewsVO getBreakingNews() {
		
		BreakingNewsVO breakingNewsVO = null;
        try {
			conn = getCRMConnection();
			String sql ="SELECT * FROM BREAKING_NEWS where NEWS_ID = ''";
			System.out.println("Query  --> "+sql);
	          stmt = conn.createStatement();
	          rs = stmt.executeQuery(sql);
	          System.out.println("resultSet "+rs);

        if(rs.next()){
        	breakingNewsVO = new BreakingNewsVO();
        	breakingNewsVO.setNewsId(rs.getInt("NEWS_ID"));
        	breakingNewsVO.setNewsTitle(rs.getString("NEWS_TITLE"));
        	breakingNewsVO.setDescTxt(rs.getString("DESC_TXT"));
        	breakingNewsVO.setFileName(rs.getString("FILE_NAME"));
        	breakingNewsVO.setAuthorName(rs.getString("AUTHOR_NAME"));
        	breakingNewsVO.setAuthorImg(rs.getString("AUTHOR_IMG"));
        	breakingNewsVO.setAuthorDetails(rs.getString("AUTHOR_DETAILS"));
        	breakingNewsVO.setIsPopular(rs.getString("IS_POPULAR"));
        	breakingNewsVO.setDisplayOrder(rs.getInt("DISPLAY_ORDER"));
        	breakingNewsVO.setEnableFl(rs.getString("ENABLE_FL"));
        	breakingNewsVO.setLastUpdtBy(rs.getInt("LAST_UPDT_BY"));
        	breakingNewsVO.setLastUpdtTm(rs.getString("LAST_UPDT_TM"));
        	System.out.println("breaking news ");
        	}
		} catch (Exception e) {
			System.out.println("getUser encounter exception"+e);
			e.printStackTrace();
		}
		
		return breakingNewsVO;

	}



}
