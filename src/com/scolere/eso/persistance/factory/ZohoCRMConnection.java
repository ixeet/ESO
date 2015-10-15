package com.scolere.eso.persistance.factory;

import java.sql.*;
import java.util.*;
import java.net.URLEncoder;


public class ZohoCRMConnection {

	  private static final String USER = "pamela@esecondopinion.com";//<your user email id>
	  private static final String PASSWORD = "MelaZoho1!";//<your password
	  
	  private static final String DB_NAME= "eSO";//<your db name>
	  
	   Connection conn;

    public Connection getCRMConnection() throws Exception{

        
        try{
            Class.forName("com.zoho.cloudsql.jdbc.ZohoReportsDriver");
            Properties conProps = new Properties();
            conProps.put("user",USER);
            conProps.put("password",PASSWORD);
            
            System.out.println("Properties "+conProps);

            conn = DriverManager.getConnection("https://reportsapi.zoho.com/api"                     // No I18N
                    + "/" + URLEncoder.encode(USER,"UTF-8")
                    + "/" + URLEncoder.encode(DB_NAME,"UTF-8"),
                    conProps);
            
            System.out.println("Connection URL "+conn);
        }catch(Exception e){
            System.out.println("Exception while getting Zoho CRM Connection : "+e.getMessage());
        }

        return conn;
    }
}
