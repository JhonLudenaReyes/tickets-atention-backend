package com.webservices.tickets.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.tickets.persistence.model.Historial;

public interface HistorialDaoRepository extends JpaRepository<Historial, Integer>{

}
