package com.scolere.eso.service.iface;

import com.scolere.eso.domain.vo.HealthTopicVO;

public interface HealthTopicServiceIface {

	public String getHealthTopic(HealthTopicVO healthTopicVO);
	
	public String searchHealthTopic(String healthTopicTitle);

}
