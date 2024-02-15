package com.cibertec.hospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class Total {

	/*
	 * private int pacienteId; private String name; private String lastname; private
	 * Double totalPrescriptionCost;
	 */
	
	@Id
	@Column(name="patient_id")
	private int pacienteId;
	
	@Column(name="patientFName")
	private String name;
	
	@Column(name="patientLName")
	private String lastname;
	
	@Column(name="prescription_cost")
	private Double totalPrescriptionCost;
	
}
