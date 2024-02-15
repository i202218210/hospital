package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.Pharmacy;

public interface PharmacyService {

	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy p);
	public Pharmacy update(Pharmacy p);
	public void delete(int id);
}
