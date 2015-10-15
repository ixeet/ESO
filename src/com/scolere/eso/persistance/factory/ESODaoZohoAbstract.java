package com.scolere.eso.persistance.factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.scolere.eso.domain.constants.ESOConstants;

public class ESODaoZohoAbstract extends ZohoCRMConnection{
	 public static String dataSource = ESOConstants.APP_DATASOURCE;
	 
	 /**
	  * This method use to close JDBC resources.
	  * @param Connection
	  * @param Statement
	  * @param ResultSet 
	  */    
	 public void closeResources(Connection conn,Statement stmt,ResultSet res)
	  {
	 	try{
	 	if(res!=null) {
	                 res.close();
	             }
	 	if(stmt!=null) {
	                 stmt.close();
	             }
	 	if(conn!=null) {
	                 conn.close();
	             }
	 	}catch(Exception e){
	             System.out.println(e.getMessage());
	         }

	  }
	 
	 public void closeResources(Connection conn)
	  {
	 	try{
	             
	 	if(conn!=null) {
	                 conn.close();
	             }
	 	}catch(Exception e){
	             System.out.println(e.getMessage());
	         }

	  }  

}
