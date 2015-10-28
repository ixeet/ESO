package com.scolere.eso.service.iface;

import java.util.List;

import com.scolere.eso.domain.vo.BreakingNewsVO;
import com.scolere.eso.domain.vo.InterestVO;

public interface BreakingNewsServiceIface {

	public BreakingNewsVO getBreakingNews();
	
	public List<BreakingNewsVO> getPopularBreakingNewsList();

	public List<BreakingNewsVO> getRecentBreakingNewsList();


}
