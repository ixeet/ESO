package com.scolere.eso.service.iface;

import com.scolere.eso.domain.vo.TreatmentVO;

public interface TreatmentServiceIface {
	
	public String getTreatment(TreatmentVO treatmentVO);
	
	public String searchTreatment(TreatmentVO treatmentVO);
}
