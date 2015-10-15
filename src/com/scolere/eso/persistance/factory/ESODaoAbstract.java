package com.scolere.eso.persistance.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.scolere.eso.domain.constants.ESOConstants;
import com.scolere.eso.domain.exception.EsoDaoException;
import com.scolere.eso.persistance.factory.JDBCDAOAbstract;

/**
 *
 * @author dell
 */
public abstract class ESODaoAbstract extends JDBCDAOAbstract{
    
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

 
 public boolean deleteOrUpdateByQuery(String query) throws EsoDaoException {
     System.out.println("Inside deleteOrUpdateByQuery>>>>");

     boolean status=false;
     
    Connection conn = null;
    PreparedStatement cstmt = null;
    ResultSet resultSet = null;

    try {
/*        System.out.println("Query : " + query);
        //conn = this.getConnection(dataSource);
        
        cstmt = conn.prepareStatement(query);
        int t=cstmt.executeUpdate();
        System.out.println("No of affected row = "+t);
        status = true;*/
    } catch (Exception e) {
        System.out.println("Error deleteOrUpdateByQuery - "+e.getMessage());
    } finally {
        closeResources(conn, cstmt, resultSet);
    }

    return status;  
}

 
 public List<String> getStrList(String query) throws EsoDaoException {

     List<String> list=new ArrayList<String>();

      Connection conn = null;
      PreparedStatement cstmt = null;
      ResultSet resultSet = null;

      try {
/*          //SELECT DEALER_CD  FROM ACT.MQT_DATA_DLRSHIP_EMP_CUR where DISTRICT_CD='SEZ2D07'
          System.out.println("Query : " + query);

          conn = this.getConnection(dataSource);
          cstmt = conn.prepareStatement(query);
          resultSet = cstmt.executeQuery();
          
          while(resultSet.next())
          {
              list.add(resultSet.getString(1));
          }

          System.out.println("No of Object returned : "+list.size());*/

      } catch (Exception e) {
          list = new ArrayList<String>();
          System.out.println("Error > getStrList - "+e.getMessage());
      } finally {
          closeResources(conn, cstmt, resultSet);
      }

      return list;        
  }


     
     public String getLastUpdatedOn(String tableName) throws EsoDaoException {
     
         String lastUpdatedOn = null;

         Connection conn = null;
         PreparedStatement cstmt = null;
         ResultSet resultSet = null;

         try {
  /*           String query="SELECT MAX(DATE(LAST_UPDT_TM)) FROM ACT."+tableName;
             System.out.println("Query : " + query);

             conn = this.getConnection(dataSource);
             cstmt = conn.prepareStatement(query);
             resultSet = cstmt.executeQuery();
             if(resultSet.next())
             {
             lastUpdatedOn=resultSet.getString(1);
             }
             */

         } catch (Exception e) {
             System.out.println("Error > getLastUpdatedOn - "+e.getMessage());
         } finally {
             closeResources(conn, cstmt, resultSet);
         }

         return lastUpdatedOn;        
     }

     
     public String getQueryConcatedResult(String query) throws EsoDaoException {
     
         String result = "";

         Connection conn = null;
         PreparedStatement cstmt = null;
         ResultSet resultSet = null;

         try {
/*            // String query="SELECT MAX(DATE(LAST_UPDT_TM)) FROM ACT."+tableName;
             System.out.println("Query : " + query);

             conn = this.getConnection(dataSource);
             cstmt = conn.prepareStatement(query);
             resultSet = cstmt.executeQuery();
             if(resultSet.next())
             {
            	 result=resultSet.getString(1);
             }
             
*/
         } catch (Exception e) {
             System.out.println("Error > getQueryConcatedResult - "+e.getMessage());
         } finally {
             closeResources(conn, cstmt, resultSet);
         }

         return result;        
     }
     

/*
     public <T> T getById(String query,Class outputClass) throws EsoDaoException {
     
         T vo = null;

         Connection conn = null;
         PreparedStatement cstmt = null;
         ResultSet resultSet = null;

         try {
             System.out.println("Query : " + query);

             conn = this.getConnection(dataSource);
             cstmt = conn.prepareStatement(query);
             resultSet = cstmt.executeQuery();

             //Map result set to object
             vo = new ResultSetMapper<T>().mapRersultSetToObject(resultSet, outputClass);
             System.out.println("Object returned : "+vo);

         } catch (Exception e) {
             System.out.println("Error getById - "+e.getMessage());
         } finally {
             closeResources(conn, cstmt, resultSet);
         }

         return vo;        
     }
*/
/*    
     public <T> List<T> getAll(String query,Class outputClass) throws EsoDaoException {

        List<T> list=null;

         Connection conn = null;
         PreparedStatement cstmt = null;
         ResultSet resultSet = null;

         try {
              System.out.println("Query : " + query);

             conn = this.getConnection(dataSource);
             cstmt = conn.prepareStatement(query);
             resultSet = cstmt.executeQuery();

             //Map result set to list
             list = new ResultSetMapper<T>().mapRersultSetToObjectList(resultSet, outputClass);

             System.out.println("No of Object returned : "+list.size());

         } catch (Exception e) {
             list = new ArrayList<T>();
             //throw new LmsDaoException("Error calling getById > " + e.getMessage());
            // System.out.println("Error getAll - "+e.getMessage());
         } finally {
             closeResources(conn, cstmt, resultSet);
         }

         return list;        
     
     }
*/

 }
