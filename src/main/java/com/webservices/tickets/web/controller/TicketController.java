package com.webservices.tickets.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.tickets.domain.service.TicketService;
import com.webservices.tickets.persistence.model.Ticket;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/find-ticket/{idTicket}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("idTicket") int idTicket){
		return ticketService.getTicket(idTicket).map(ticket -> new ResponseEntity<>(ticket, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	
	@GetMapping("/list-tickets")
	public ResponseEntity<List<Ticket>> getTickets(){
		return ticketService.getTickets().map(ticket -> new ResponseEntity<>(ticket, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/list-tickets-atention")
	public ResponseEntity<List<Ticket>> getTicketsAtention(){
		return ticketService.getTicketsAtention()
				.map(ticket -> new ResponseEntity<>(ticket, HttpStatus.OK))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/save-ticket")
	public ResponseEntity<Ticket> save(@RequestBody Ticket ticket){
		return new ResponseEntity<>(ticketService.save(ticket), HttpStatus.CREATED);
	}
	
	@PutMapping("/update-ticket")
	public ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket){
		Optional<Ticket> optionalTicket = ticketService.getTicket(ticket.getIdTicket());
		if(optionalTicket.isPresent()) {
			return new ResponseEntity<>(ticketService.save(ticket), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/update-atencion/{idTicket}")
	public ResponseEntity<Ticket> updateAtencion(@PathVariable("idTicket") int idTicket){
		Optional<Ticket> optionalTicket = ticketService.getTicket(idTicket);
		if(optionalTicket.isPresent()) {
			Ticket updateTicket = optionalTicket.get();
			updateTicket.setAtencion("ATENDIDO");
			return new ResponseEntity<>(ticketService.save(updateTicket), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/delete-ticket/{idTicket}")
	public ResponseEntity<Ticket> deleteTicket(@PathVariable("idTicket") int idTicket){
		Optional<Ticket> optionalTicket = ticketService.getTicket(idTicket);
		if(optionalTicket.isPresent()) {
			Ticket updateTicket = optionalTicket.get();
			updateTicket.setEstado("I");
			return new ResponseEntity<>(ticketService.save(updateTicket), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
