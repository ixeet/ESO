package com.scolere.eso.service.impl;


import java.io.IOException;
import java.util.Map;

import com.adventnet.zoho.client.report.ParseException;
import com.adventnet.zoho.client.report.ReportClient;
import com.adventnet.zoho.client.report.ServerException;
import com.scolere.eso.application.web.form.EsoUserForm;
import com.scolere.eso.domain.vo.ESOUserVO;
import com.scolere.eso.persistance.dao.iface.ESOUserDao;
import com.scolere.eso.persistance.dao.impl.ESOUserDaoImpl;
import com.scolere.eso.persistance.factory.Config;
import com.scolere.eso.persistance.factory.ESODaoAbstract;
import com.scolere.eso.persistance.factory.EsoDaoFactory;
import com.scolere.eso.service.iface.ESOUserServiceIface;

public class ESOUserServiceImpl extends ESODaoAbstract implements ESOUserServiceIface{
	
	
    private ReportClient rc = Config.getReportClient();
    ESOUserDaoImpl eSOUserDaoImpl = new ESOUserDaoImpl();
    
	
	@Override
	public ESOUserVO getUser(EsoUserForm form) {
		ESOUserVO eSOUserVO = new ESOUserVO() ;
		 try {
			 
			 ESOUserDao dao = (ESOUserDao) EsoDaoFactory.getDAO(ESOUserDao.class);
			 eSOUserVO = dao.getUser(form);

	        } catch (Exception ex) {
	            System.out.println("ESOServiceException #  = "+ex);
	        }
		return eSOUserVO;
	}
	
	@Override
	public ESOUserVO getCRMUser(EsoUserForm form) {
		ESOUserVO eSOUserVO = new ESOUserVO() ;
		 try {
			 
			 ESOUserDao dao = (ESOUserDao) EsoDaoFactory.getDAO(ESOUserDao.class);
			 eSOUserVO = dao.getCRMUser(form);

	        } catch (Exception ex) {
	            System.out.println("ESOServiceException #  = "+ex);
	        }
		return eSOUserVO;
	}

	
	@Override
	public boolean updateESOUserProfile(EsoUserForm form) throws IOException, ServerException, ParseException{
		
		String uri = rc.getURI(Config.LOGINEMAILID,Config.DATABASENAME,"ESO_USERS");
        rc.updateData(uri,eSOUserDaoImpl.profileUpdate(form),getCriteria(form),null);
        
       // System.out.println("Data matching the criteria " + getCriteria(EsoUserForm form) + " successfully updated.");
        System.out.println("Successfully added the row to " + uri);
        //System.out.println(" The response is " + result);	
		return true;
	}


	@Override
	public boolean updateUserLoginFlag(ESOUserVO vo) throws IOException,
			ServerException, ParseException {
		
		String uri = rc.getURI(Config.LOGINEMAILID,Config.DATABASENAME,"ESO_USERS");
        rc.updateData(uri,eSOUserDaoImpl.loginFlagUpdate(vo),getCriteria(vo),null);
        
        System.out.println("Successfully added the row to " + uri);

        
        return true;
	}
	
    public String getCriteria(ESOUserVO vo)
    {
        return "(\"Email\" = '"+vo.getEmailId()+"')";
    }
    
    public String getCriteria(EsoUserForm form)
    {
        return "(\"Email\" = '"+form.getEmailId()+"')";
    }





}
