package com.webservices.tickets.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.tickets.domain.repository.HistorialTicketRepository;
import com.webservices.tickets.persistence.model.HistorialAtencion;

@Service
public class HistorialTicketService {
	
	@Autowired
	private HistorialTicketRepository historialTicketRepository;
	
	public List<HistorialAtencion> getAllHistorial(){
		return historialTicketRepository.getAllHistorial();
	}

}
