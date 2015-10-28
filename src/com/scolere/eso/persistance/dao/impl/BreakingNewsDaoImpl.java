package com.scolere.eso.persistance.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.scolere.eso.domain.to.BreakingNewsTO;
import com.scolere.eso.domain.vo.BreakingNewsVO;
import com.scolere.eso.persistance.dao.iface.BreakingNewsDao;
import com.scolere.eso.persistance.factory.ESODaoZohoAbstract;

public class BreakingNewsDaoImpl extends ESODaoZohoAbstract implements BreakingNewsDao{
	
	Connection conn = null;
    Statement stmt = null;
	ResultSet rs = null;
	
	String fmt = "MM/dd/yyyy HH:mm:ss a";
	/*DateFormat df = new SimpleDateFormat(fmt);
	
	DateFormat dfmt  = new SimpleDateFormat("MM/dd/yyyy");*/
    SimpleDateFormat monthDisplay = new SimpleDateFormat("MMM");
    SimpleDateFormat monthParse = new SimpleDateFormat("MM");

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
	        	newsTO.setVideofileName(rs.getString("VIDEO_FILENAME"));
	        	newsTO.setAuthorName(rs.getString("AUTHOR_NAME"));
	        	newsTO.setAuthorImg(rs.getString("AUTHOR_IMG"));
	        	newsTO.setAuthorDetails(rs.getString("AUTHOR_DETAILS"));
	        	newsTO.setIsPopular(rs.getString("IS_POPULAR"));
	        	newsTO.setDisplayOrder(rs.getInt("DISPLAY_ORDER"));
	        	newsTO.setEnableFl(rs.getString("ENABLE_FL"));
	        	newsTO.setLastUpdtBy(rs.getString("LAST_UPDT_BY"));
	        	
	        	String str =rs.getString("LAST_UPDT_TM");//split the date and timestamp	        	
	        	Date date = new Date();
	        	System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date) +"date is"+str);
	        	
	        	String temp[] =new SimpleDateFormat("MM-dd-yyyy").format(date).split("-");
	        	String day = temp[1];
	        	String month = temp[0];
	        	String year = temp[2];
	        	
	        	newsTO.setLastUpdtDay(day);
	        	newsTO.setLastUpdtMonth(monthDisplay.format(monthParse.parse(month)));//month in month name...
	        	newsTO.setLastUpdtYear(year);
	        	
	        	breakingNewsTO.add(newsTO);// add in the list

	        	System.out.println("breaking news List");
	        	
	          }
	          }catch(Exception e){
	        	  System.out.println("");
	          }finally{
	              closeResources(conn, stmt, rs);
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
	        	newsTO.setVideofileName(rs.getString("VIDEO_FILENAME"));
	        	newsTO.setAuthorName(rs.getString("AUTHOR_NAME"));
	        	newsTO.setAuthorImg(rs.getString("AUTHOR_IMG"));
	        	newsTO.setAuthorDetails(rs.getString("AUTHOR_DETAILS"));
	        	newsTO.setIsPopular(rs.getString("IS_POPULAR"));
	        	newsTO.setDisplayOrder(rs.getInt("DISPLAY_ORDER"));
	        	newsTO.setEnableFl(rs.getString("ENABLE_FL"));
	        	newsTO.setLastUpdtBy(rs.getString("LAST_UPDT_BY"));
	        	
	        	String str =rs.getString("LAST_UPDT_TM");  //split the date and timestamp	
	        	
	        	Date date = new Date();
	        	System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date) +"date is"+str);
	        	
	        	String temp[] =new SimpleDateFormat("MM-dd-yyyy").format(date).split("-");
	        	String day = temp[1];
	        	String month = temp[0];
	        	String year = temp[2];
	        	        	
	        	newsTO.setLastUpdtDay(day);
	        	newsTO.setLastUpdtMonth(monthDisplay.format(monthParse.parse(month)));//date in month text...
	        	newsTO.setLastUpdtYear(year);
	        		        	
	        	breakingNewslist.add(newsTO);//add into the list...
	        	
	        	System.out.println("breaking news List");
	        	
	          }
	          }catch(Exception e){
	        	  System.out.println("");
	          }finally{
	              closeResources(conn, stmt, rs);
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
        	breakingNewsVO.setVideofileName(rs.getString("VIDEO_FILENAME"));
        	breakingNewsVO.setAuthorName(rs.getString("AUTHOR_NAME"));
        	breakingNewsVO.setAuthorImg(rs.getString("AUTHOR_IMG"));
        	breakingNewsVO.setAuthorDetails(rs.getString("AUTHOR_DETAILS"));
        	breakingNewsVO.setIsPopular(rs.getString("IS_POPULAR"));
        	breakingNewsVO.setDisplayOrder(rs.getInt("DISPLAY_ORDER"));
        	breakingNewsVO.setEnableFl(rs.getString("ENABLE_FL"));
        	breakingNewsVO.setLastUpdtBy(rs.getString("LAST_UPDT_BY"));
        	
        	String str =rs.getString("LAST_UPDT_TM");//split the date and timestamp        	
        	
        	System.out.println("breaking news ");
        	}
		} catch (Exception e) {
			System.out.println("getUser encounter exception"+e);
			e.printStackTrace();
		}finally{
            closeResources(conn, stmt, rs);
		}
		
		return breakingNewsVO;

	}



}
