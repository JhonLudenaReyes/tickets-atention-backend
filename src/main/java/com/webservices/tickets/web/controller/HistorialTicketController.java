package com.webservices.tickets.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.tickets.domain.service.HistorialTicketService;
import com.webservices.tickets.persistence.model.HistorialAtencion;

@RestController
@RequestMapping("/historial-atencion")
public class HistorialTicketController {
	
	@Autowired
	private HistorialTicketService historialTicketService;
	
	@GetMapping("/list-historial-atencion")
	public ResponseEntity<List<HistorialAtencion>> getAllHistorial(){
		return new ResponseEntity<>(historialTicketService.getAllHistorial(), HttpStatus.OK);
	}

}
