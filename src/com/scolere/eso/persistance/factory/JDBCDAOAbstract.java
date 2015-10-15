package com.scolere.eso.persistance.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author akj
 */
public class JDBCDAOAbstract {

    private Connection conn=null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/esodb";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";


    public Connection getConnection() throws Exception{
        try{
        // Get DataSource from JNDI (defined in context.xml file)
        Context ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/esodb");
        conn=ds.getConnection();
        System.out.println("New Connection created.."+conn);
        }catch(Exception e){
            System.out.println("Exception while getting JDBC Connection : "+e.getMessage());
        }
        
        //for local testing
        if(conn==null)
        {
            conn=getLocalDbConnection();
        }
        return conn;
    }

    public Connection getConnection(String dataSource) throws Exception{
       
        if(dataSource!=null)
        {
        try{
        // Get DataSource from JNDI (defined in context.xml file)
        Context ctx = new InitialContext();
        DataSource ds = (DataSource)ctx.lookup("java:comp/env/"+dataSource);
        conn=ds.getConnection();
        System.out.println("New Connection created.."+conn);
        }catch(Exception e){
            System.out.println("Exception while getting JDBC Connection : "+e.getMessage());
        }
        }
        
        //for local testing
        if(conn==null)
        {
            conn=getLocalDbConnection();
        }

        return conn;
    }

    
    public Connection getLocalDbConnection() throws Exception{

        String driver="com.mysql.jdbc.Driver";
        String driver_url="jdbc:mysql://localhost:3306/esodb";
        String user="root";
        String pwd="root";
        
        try{
        Class.forName(driver);
        conn=DriverManager.getConnection(driver_url, user, pwd);

        //conn=DriverManager.getConnection(JDBC_DRIVER, USER, PASS);
        System.out.println("New Connection created.."+conn);
        }catch(Exception e){
            System.out.println("Exception while getting local JDBC Connection : "+e.getMessage());
        }

        return conn;
    }
    
    
}