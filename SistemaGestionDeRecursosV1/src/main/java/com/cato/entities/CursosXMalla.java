package com.cato.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos_x_malla")
public class CursosXMalla implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cxm_id")
	private Integer cxmId;

	@JoinColumn(name = "malla_id", referencedColumnName = "malla_id")
    @ManyToOne
	private Mallas mallaId;

//	@JoinColumn(name = "curso_id", referencedColumnName = "curso_id")
//    @ManyToOne
//	private Cursos cursoId;
	
	
	@Column(name = "curso_id")
	private Integer cursoId;

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

	@Column(name = "referencia2")
	private String referencia2;

	@JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
	private Estado codigoEstado;

	@JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
	private Usuarios usuarioId;

	public Integer getCxmId() {
		return cxmId;
	}

	public void setCxmId(Integer cxmId) {
		this.cxmId = cxmId;
	}

	public Mallas getMallaId() {
		return mallaId;
	}

	public void setMallaId(Mallas mallaId) {
		this.mallaId = mallaId;
	}

//	public Cursos getCursoId() {
//		return cursoId;
//	}
//
//	public void setCursoId(Cursos cursoId) {
//		this.cursoId = cursoId;
//	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getCursoId() {
		return cursoId;
	}

	public void setCursoId(Integer cursoId) {
		this.cursoId = cursoId;
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

	public String getReferencia2() {
		return referencia2;
	}

	public void setReferencia2(String referencia2) {
		this.referencia2 = referencia2;
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

}
