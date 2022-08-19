package com.webservices.tickets.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webservices.tickets.domain.repository.TicketRepository;
import com.webservices.tickets.persistence.dao.TicketDaoRepository;
import com.webservices.tickets.persistence.model.Ticket;

@Repository
public class TicketRepositoryImpl implements TicketRepository{
	
	@Autowired 
	private TicketDaoRepository ticketDaoRepository;

	@Override
	public Optional<List<Ticket>> getActiveTickets() {
		// TODO Auto-generated method stub
		Optional<List<Ticket>> tickets = ticketDaoRepository.findByEstado("A");
		return tickets;
	}

	@Override
	public Ticket save(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDaoRepository.save(ticket);
	}

	@Override
	public Optional<Ticket> getTicket(int idTicket) {
		// TODO Auto-generated method stub
		return ticketDaoRepository.findById(idTicket);
	}

	@Override
	public Optional<List<Ticket>> getTicketsAtention() {
		// TODO Auto-generated method stub
		return ticketDaoRepository.findByAtencionAndEstado("PENDIENTE", "A");
	}

	

}
