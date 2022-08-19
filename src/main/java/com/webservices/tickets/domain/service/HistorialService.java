package com.webservices.tickets.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.tickets.domain.repository.HistorialRepository;
import com.webservices.tickets.persistence.model.Historial;

@Service
public class HistorialService {
	
	@Autowired
	private HistorialRepository historialRepository;
	
	public Historial save(Historial historial) {
		return historialRepository.save(historial);
	}

}
