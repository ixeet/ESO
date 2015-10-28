package com.scolere.eso.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.scolere.eso.domain.constants.ESOConstants;
import com.scolere.eso.domain.to.BreakingNewsTO;
import com.scolere.eso.domain.vo.BreakingNewsVO;
import com.scolere.eso.persistance.dao.iface.BreakingNewsDao;
import com.scolere.eso.persistance.dao.impl.BreakingNewsDaoImpl;
import com.scolere.eso.persistance.factory.ESODaoAbstract;
import com.scolere.eso.persistance.factory.EsoDaoFactory;
import com.scolere.eso.service.iface.BreakingNewsServiceIface;

public class BreakingNewsServiceImpl extends ESODaoAbstract implements BreakingNewsServiceIface{
	
   // private ReportClient rc = Config.getReportClient();
    BreakingNewsDao breakingNewsDao = new BreakingNewsDaoImpl();

	@Override
	public BreakingNewsVO getBreakingNews() {
		BreakingNewsVO breakingNewsVO = new BreakingNewsVO();
		
		try{
		BreakingNewsDao dao = (BreakingNewsDao) EsoDaoFactory.getDAO(BreakingNewsDao.class);
		breakingNewsVO = dao.getBreakingNews();

       } catch (Exception ex) {
           System.out.println("getBreakingNews #  = "+ex);
       }
	return breakingNewsVO;
	}

	@Override
	public List<BreakingNewsVO> getPopularBreakingNewsList() {
		
		List<BreakingNewsVO> bList = null;
		try{
			BreakingNewsDao dao = (BreakingNewsDao) EsoDaoFactory.getDAO(BreakingNewsDao.class);
			List<BreakingNewsTO> breakingNewsFromDb = dao.getPopularBreakingNewsList();
			bList = new ArrayList<BreakingNewsVO>(breakingNewsFromDb.size());
			BreakingNewsVO newsVO = null;
			
			//copy the list of breaking news from db to the list
			for(BreakingNewsTO to:breakingNewsFromDb)
			{
				newsVO = new BreakingNewsVO();
				newsVO.setNewsId(to.getNewsId());
				newsVO.setNewsTitle(to.getNewsTitle());
				newsVO.setDescTxt(to.getDescTxt());
				newsVO.setFileName(ESOConstants.IMAGES_BREAKING_NEWS_URL+to.getFileName());
				newsVO.setVideofileName(to.getVideofileName());
				newsVO.setAuthorName(to.getAuthorName());
				newsVO.setAuthorImg(ESOConstants.IMAGES_BREAKING_NEWS_URL+to.getAuthorImg());
				newsVO.setAuthorDetails(to.getAuthorDetails());
				newsVO.setIsPopular(to.getIsPopular());
				newsVO.setDisplayOrder(to.getDisplayOrder());
				newsVO.setEnableFl(to.getEnableFl());
				newsVO.setLastUpdtBy(to.getLastUpdtBy());
				//newsVO.setLastUpdtTm(to.getLastUpdtTm());
				newsVO.setLastUpdtDay(to.getLastUpdtDay());
				newsVO.setLastUpdtMonth(to.getLastUpdtMonth());
				newsVO.setLastUpdtYear(to.getLastUpdtYear());
				
				//add in the list
				bList.add(newsVO);
				
			}
			
		}catch (Exception e){
			System.out.println("getBreakingNewsList = "+e);
		}
		return bList;
	}

	@Override
	public List<BreakingNewsVO> getRecentBreakingNewsList() {
		
		List<BreakingNewsVO> bList = null;
		try{
			BreakingNewsDao dao = (BreakingNewsDao) EsoDaoFactory.getDAO(BreakingNewsDao.class);
			List<BreakingNewsTO> breakingNewsFromDb = dao.getRecentBreakingNewsList();
			bList = new ArrayList<BreakingNewsVO>(breakingNewsFromDb.size());
			BreakingNewsVO newsVO = null;
			
			//copy the list of breaking news from db to the list
			for(BreakingNewsTO to:breakingNewsFromDb)
			{
				newsVO = new BreakingNewsVO();
				newsVO.setNewsId(to.getNewsId());
				newsVO.setNewsTitle(to.getNewsTitle());
				newsVO.setDescTxt(to.getDescTxt());
				newsVO.setFileName(ESOConstants.IMAGES_BREAKING_NEWS_URL+to.getFileName());
				newsVO.setVideofileName(to.getVideofileName());
				newsVO.setAuthorName(to.getAuthorName());
				newsVO.setAuthorImg(ESOConstants.IMAGES_BREAKING_NEWS_URL+to.getAuthorImg());
				newsVO.setAuthorDetails(to.getAuthorDetails());
				newsVO.setIsPopular(to.getIsPopular());
				newsVO.setDisplayOrder(to.getDisplayOrder());
				newsVO.setEnableFl(to.getEnableFl());
				newsVO.setLastUpdtBy(to.getLastUpdtBy());
				//newsVO.setLastUpdtTm(to.getLastUpdtTm());
				newsVO.setLastUpdtDay(to.getLastUpdtDay());
				newsVO.setLastUpdtMonth(to.getLastUpdtMonth());
				newsVO.setLastUpdtYear(to.getLastUpdtYear());
				
				//add in the list
				bList.add(newsVO);
				
			}
			
		}catch (Exception e){
			System.out.println("getBreakingNewsList = "+e);
		}
		return bList;
	}


}
