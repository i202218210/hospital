package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cibertec.hospital.model.Pharmacy;
import com.cibertec.hospital.repo.PharmacyRepo;
import com.cibertec.hospital.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService{
	
	@Autowired
	PharmacyRepo pharmacyRepo;
	
	@Override
	public List<Pharmacy> list() {
		return pharmacyRepo.findAll();
	}
	
	@Override
	public Pharmacy add(@RequestBody Pharmacy p) {
		return pharmacyRepo.save(p);
	}
	
	@Override
	public Pharmacy update(@RequestBody Pharmacy p) {
		return pharmacyRepo.save(p);
	}
	
	@Override
	public void delete(int id) {
		pharmacyRepo.deleteById(id);
	}
	
	

}
