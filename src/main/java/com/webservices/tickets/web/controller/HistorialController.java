package com.webservices.tickets.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.tickets.domain.service.HistorialService;
import com.webservices.tickets.persistence.model.Historial;

@RestController
@RequestMapping("/historial")
public class HistorialController {
	
	@Autowired
	private HistorialService historialService;
	
	@PostMapping("/save-historial")
	public ResponseEntity<Historial> saveHistorial(@RequestBody Historial historial){
		return new ResponseEntity<>(historialService.save(historial), HttpStatus.CREATED);
	}

}
