package com.webservices.tickets.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webservices.tickets.domain.repository.HistorialTicketRepository;
import com.webservices.tickets.persistence.dao.HistorialTicketDaoRepository;
import com.webservices.tickets.persistence.model.HistorialAtencion;

@Repository
public class HistorialTicketRepositoryImpl implements HistorialTicketRepository{
	
	@Autowired
	private HistorialTicketDaoRepository historialTicketDaoRepository;

	@Override
	public List<HistorialAtencion> getAllHistorial() {
		// TODO Auto-generated method stub
		return historialTicketDaoRepository.findAll();
	}





}
