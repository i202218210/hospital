package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cibertec.hospital.model.Prescription;
import com.cibertec.hospital.repo.PrescriptionRepo;
import com.cibertec.hospital.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
	
	@Autowired
	PrescriptionRepo prescriptionRepo;
	
	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}
	
	@Override
	public Prescription add(@RequestBody Prescription p) {
		return prescriptionRepo.save(p);
	}
	
	@Override
	public Prescription update(@RequestBody Prescription p) {
		return prescriptionRepo.save(p);
	}
	
	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);
	}
}
