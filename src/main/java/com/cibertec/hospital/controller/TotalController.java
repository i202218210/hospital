package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.hospital.model.Total;
import com.cibertec.hospital.service.TotalService;

@RestController
@RequestMapping("/total")
public class TotalController {

	@Autowired
	TotalService totalService;
	
	@GetMapping
	public ResponseEntity<List<Total>> list() {
		return new ResponseEntity<>(totalService.getTotal(), HttpStatus.OK);
	}
}
