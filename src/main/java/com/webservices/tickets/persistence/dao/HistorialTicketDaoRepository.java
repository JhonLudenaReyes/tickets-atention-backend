package com.webservices.tickets.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.tickets.persistence.model.HistorialAtencion;

public interface HistorialTicketDaoRepository extends JpaRepository<HistorialAtencion, Integer>{

}
