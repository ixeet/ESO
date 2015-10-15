package com.scolere.eso.service.iface;

import com.scolere.eso.domain.vo.BreakingNewsVO;

public interface BreakingNewsServiceIface {

	
	public String getBreakingNews(BreakingNewsVO breakingNewsVO);
	
	public String searchBreakingNews(BreakingNewsVO breakingNewsVO);
}
