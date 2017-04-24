package com.cato.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mallas")
public class Mallas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "malla_id")
	private Integer mallaId;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "anio")
	private String anio;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "objetivo")
	private String objetivo;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;

	@Column(name = "referencia1")
	private String referencia1;

	@JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
	private Estado codigoEstado;

	@JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
	private Usuarios usuarioId;

	@OneToMany(mappedBy = "mallaId")
	private List<CursosXMalla> cursosXMallaList;

	public Integer getMallaId() {
		return mallaId;
	}

	public void setMallaId(Integer mallaId) {
		this.mallaId = mallaId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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

	public String getReferencia1() {
		return referencia1;
	}

	public void setReferencia1(String referencia1) {
		this.referencia1 = referencia1;
	}

	public Estado getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(Estado codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public Usuarios getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Usuarios usuarioId) {
		this.usuarioId = usuarioId;
	}

	public List<CursosXMalla> getCursosXMallaList() {
		return cursosXMallaList;
	}

	public void setCursosXMallaList(List<CursosXMalla> cursosXMallaList) {
		this.cursosXMallaList = cursosXMallaList;
	}

}
