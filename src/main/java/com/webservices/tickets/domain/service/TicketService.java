package com.webservices.tickets.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.tickets.domain.repository.TicketRepository;
import com.webservices.tickets.persistence.model.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public Optional<List<Ticket>> getTickets() {
		return ticketRepository.getActiveTickets();
	}
	
	public Ticket save(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	
	public Optional<Ticket> getTicket(int idTicket) {
		return ticketRepository.getTicket(idTicket);
	}
	
	public Optional<List<Ticket>> getTicketsAtention(){
		return ticketRepository.getTicketsAtention();
	}

}
