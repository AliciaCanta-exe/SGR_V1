package com.cato.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo_estado")
	private String codigoEstado;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion_breve")
	private String descripcionBreve;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;

	public Estado() {
	}

//	public Estado(String codigoEstado) {
//		this.codigoEstado = codigoEstado;
//	}
//
//	public Estado(String codigoEstado, String nombre, String descripcionBreve, Date fechaRegistro) {
//		this.codigoEstado = codigoEstado;
//		this.nombre = nombre;
//		this.descripcionBreve = descripcionBreve;
//		this.fechaRegistro = fechaRegistro;
//	}


	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionBreve() {
		return descripcionBreve;
	}

	public void setDescripcionBreve(String descripcionBreve) {
		this.descripcionBreve = descripcionBreve;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
//
//	@Override
//	public int hashCode() {
//		int hash = 0;
//		hash += (codigoEstado != null ? codigoEstado.hashCode() : 0);
//		return hash;
//	}
//
//	@Override
//	public boolean equals(Object object) {
//		// TODO: Warning - this method won't work in the case the id fields are
//		// not set
//		if (!(object instanceof Estado)) {
//			return false;
//		}
//		Estado other = (Estado) object;
//		if ((this.codigoEstado == null && other.codigoEstado != null)
//				|| (this.codigoEstado != null && !this.codigoEstado.equals(other.codigoEstado))) {
//			return false;
//		}
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "com.cato.entities.Estado[ codigoEstado=" + codigoEstado + " ]";
//	}

}
