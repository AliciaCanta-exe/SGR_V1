package com.cato.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Temas implements Serializable{

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tema_id")
    private Integer temaId;

    @Column(name = "codigo")
    private String codigo;
    
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
    
    @JoinColumn(name = "unidad_aprendizaje_id", referencedColumnName = "unidad_aprendizaje_id")
    @ManyToOne
    private UnidadAprendizaje unidadAprendizajeId;
    
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;

    public Temas() {
    }

    public Temas(Integer temaId) {
        this.temaId = temaId;
    }

    public Temas(Integer temaId, String codigo, String nombre, String descripcion, String objetivo, Date fechaRegistro) {
        this.temaId = temaId;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.fechaRegistro = fechaRegistro;
    }    
    
	public Integer getTemaId() {
		return temaId;
	}

	public void setTemaId(Integer temaId) {
		this.temaId = temaId;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public UnidadAprendizaje getUnidadAprendizajeId() {
		return unidadAprendizajeId;
	}

	public void setUnidadAprendizajeId(UnidadAprendizaje unidadAprendizajeId) {
		this.unidadAprendizajeId = unidadAprendizajeId;
	}

	public Usuarios getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Usuarios usuarioId) {
		this.usuarioId = usuarioId;
	}
	
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (temaId != null ? temaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temas)) {
            return false;
        }
        Temas other = (Temas) object;
        if ((this.temaId == null && other.temaId != null) || (this.temaId != null && !this.temaId.equals(other.temaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.Temas[ temaId=" + temaId + " ]";
    }    
    
}
