package com.scolere.eso.application.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.scolere.eso.domain.vo.BreakingNewsVO;
import com.scolere.eso.service.impl.BreakingNewsServiceImpl;

/**
*
* @author akj
*/
public class BreakingNewsAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*	this is for Breaking News page.......
	* 
	* 
	*/
	BreakingNewsServiceImpl breakingNewsServiceImpl = new BreakingNewsServiceImpl();
	BreakingNewsVO breakingNewsVO;
	HttpServletRequest request = ServletActionContext.getRequest();
	String temp;
	
	public String execute(){
		
		try{
			BreakingNewsVO vo = new BreakingNewsVO();
			List<BreakingNewsVO> popularlist = breakingNewsServiceImpl.getPopularBreakingNewsList();
			List<BreakingNewsVO> recentlist = breakingNewsServiceImpl.getRecentBreakingNewsList();
			
			String temp1 = null;
			
			for(int i=0;i<= popularlist.size();i++){
				if(vo.getVideofileName() != null)
				{
					temp1 = vo.getVideofileName();
				}
			}
			String temp2 = null;
			
			for(int i=0;i<= popularlist.size();i++){
				if(vo.getFileName() != null)
				{
					temp2 = vo.getFileName();
				}
			}

			HttpServletRequest request= ServletActionContext.getRequest();
			request.getSession().setAttribute("videoExist", temp1);
			request.getSession().setAttribute("imageExist", temp2);
			request.getSession().setAttribute("popularlist", popularlist);
			request.getSession().setAttribute("recentlist", recentlist);
			request.getSession().setAttribute("selectedTab","breakingNewsTab");

		}catch(Exception e){
			e.printStackTrace();
			System.out.println("In execute method Exeception...." +e);
		}
		return SUCCESS;
	}
	
	public String getBreakingNews(){
		try{
			
			BreakingNewsVO newsVO = breakingNewsServiceImpl.getBreakingNews();
			HttpServletRequest request= ServletActionContext.getRequest();
			request.getSession().setAttribute("breakingNews", newsVO);

		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	
	public String getNewsList(){
		try{
			
			List<BreakingNewsVO> popularlist = breakingNewsServiceImpl.getPopularBreakingNewsList();
			List<BreakingNewsVO> recentlist = breakingNewsServiceImpl.getRecentBreakingNewsList();

			HttpServletRequest request= ServletActionContext.getRequest();
			request.getSession().setAttribute("popularlist", popularlist);
			request.getSession().setAttribute("recentlist", recentlist);

		}catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	

	


}
