package com.webservices.tickets.persistence.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.tickets.persistence.model.Ticket;

public interface TicketDaoRepository extends JpaRepository<Ticket, Integer>{

	Optional<List<Ticket>> findByEstado(String estado);
	Optional<List<Ticket>> findByAtencionAndEstado(String atencion, String estado);
	
}
