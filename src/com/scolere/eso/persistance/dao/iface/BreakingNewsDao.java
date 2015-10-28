package com.scolere.eso.persistance.dao.iface;

import java.util.List;

import com.scolere.eso.domain.to.BreakingNewsTO;
import com.scolere.eso.domain.vo.BreakingNewsVO;

public interface BreakingNewsDao {
	
	public List<BreakingNewsTO> getRecentBreakingNewsList();
	
	public List<BreakingNewsTO> getPopularBreakingNewsList();
	
	public BreakingNewsVO getBreakingNews();



}
