package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.Prescription;

public interface PrescriptionService {

	public List<Prescription> list();
	public Prescription add(Prescription p);
	public Prescription update(Prescription p);
	public void delete(int id);
	
}
