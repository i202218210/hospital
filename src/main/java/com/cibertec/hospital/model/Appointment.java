package com.cibertec.hospital.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "appointment")
public class Appointment {

	private LocalDate date;
	private LocalTime time;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	@Id
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	@Id
	private Doctor doctor;
}
