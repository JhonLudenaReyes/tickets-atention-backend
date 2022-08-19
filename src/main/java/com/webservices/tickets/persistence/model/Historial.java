package com.webservices.tickets.persistence.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "historial_atencion")
public class Historial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historial")
	private Integer idHistorial;
	
	@Column(name= "id_ticket")
	private Integer idTicket;
	
	@Column(name = "usuario_soporte")
	private String usuarioSoporte;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column(name = "fecha_atencion")
	private Date fechaAtencion;
	
	@Column(name = "trabajo_realizado")
	private String trabajoRealizado;
	
	private String estado = "A";

	public Integer getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(Integer idHistorial) {
		this.idHistorial = idHistorial;
	}

	public Integer getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(Integer idTicket) {
		this.idTicket = idTicket;
	}

	public String getUsuarioSoporte() {
		return usuarioSoporte;
	}

	public void setUsuarioSoporte(String usuarioSoporte) {
		this.usuarioSoporte = usuarioSoporte;
	}

	public Date getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public String getTrabajoRealizado() {
		return trabajoRealizado;
	}

	public void setTrabajoRealizado(String trabajoRealizado) {
		this.trabajoRealizado = trabajoRealizado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
