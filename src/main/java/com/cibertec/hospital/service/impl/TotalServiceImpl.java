package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.model.Total;
import com.cibertec.hospital.repo.TotalRepo;
import com.cibertec.hospital.service.TotalService;

@Service
public class TotalServiceImpl implements TotalService {

	@Autowired
	public TotalRepo totalRepo;
	
	@Override
	public List<Total> getTotal() {
		return totalRepo.getTotal();
	}

}
