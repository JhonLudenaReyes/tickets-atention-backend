package com.webservices.tickets.domain.repository;

import java.util.List;

import com.webservices.tickets.persistence.model.HistorialAtencion;

public interface HistorialTicketRepository {
	
	List<HistorialAtencion> getAllHistorial();

}
