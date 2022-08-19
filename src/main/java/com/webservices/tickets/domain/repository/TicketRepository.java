package com.webservices.tickets.domain.repository;

import java.util.List;
import java.util.Optional;

import com.webservices.tickets.persistence.model.Ticket;

public interface TicketRepository {
	
	Optional<Ticket> getTicket(int idTicket);
	Optional<List<Ticket>> getActiveTickets();
	Optional<List<Ticket>> getTicketsAtention();
	Ticket save(Ticket ticket);

}
