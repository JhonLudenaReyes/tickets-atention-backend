package com.webservices.tickets.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webservices.tickets.domain.repository.HistorialRepository;
import com.webservices.tickets.persistence.dao.HistorialDaoRepository;
import com.webservices.tickets.persistence.model.Historial;

@Repository
public class HistorialRepositoryImpl implements HistorialRepository{
	
	@Autowired
	private HistorialDaoRepository historialDaoRepository;

	@Override
	public Historial save(Historial historial) {
		// TODO Auto-generated method stub
		return historialDaoRepository.save(historial);
	}

}
