package com.cibertec.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.hospital.model.Total;

public interface TotalRepo extends JpaRepository<Total, Integer>{
	
	  @Query(value="SELECT P.PATIENT_ID, P.PATIENTFNAME, P.PATIENTLNAME, "
	  + "SUM(PR.PRESCRIPTION_COST) AS prescription_cost " +
	  "FROM PATIENT P INNER JOIN PRESCRIPTION PR " +
	  "ON P.PATIENT_ID = PR.PATIENT_ID " + "GROUP BY P.PATIENT_ID", nativeQuery = true)
	
	public List<Total> getTotal();	
	  //dsds
	
}
