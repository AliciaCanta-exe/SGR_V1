package com.cato.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class UnidadAprendizaje implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unidad_aprendizaje_id")
	private Integer unidadAprendizajeId;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "objetivo")
	private String objetivo;

	@Column(name = "cant_temas")
	private Integer cantTemas;

	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "fecha_actualizacion")
	private Date fechaActualizacion;

	@Column(name = "referencia1")
	private String referencia1;

	@JoinColumn(name = "curso_id", referencedColumnName = "curso_id")
    @ManyToOne
	private Cursos cursoId;

	@JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
	private Estado codigoEstado;

	@JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
	private Usuarios usuarioId;

	@OneToMany(mappedBy = "unidadAprendizajeId")
	private List<Temas> temasList;

    public UnidadAprendizaje() {
    }

    public UnidadAprendizaje(Integer unidadAprendizajeId) {
        this.unidadAprendizajeId = unidadAprendizajeId;
    }

    public UnidadAprendizaje(Integer unidadAprendizajeId, String codigo, String nombre, String descripcion, String objetivo, Date fechaRegistro) {
        this.unidadAprendizajeId = unidadAprendizajeId;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.fechaRegistro = fechaRegistro;
    }
	
	public Integer getUnidadAprendizajeId() {
		return unidadAprendizajeId;
	}

	public void setUnidadAprendizajeId(Integer unidadAprendizajeId) {
		this.unidadAprendizajeId = unidadAprendizajeId;
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

	public Integer getCantTemas() {
		return cantTemas;
	}

	public void setCantTemas(Integer cantTemas) {
		this.cantTemas = cantTemas;
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

	public Cursos getCursoId() {
		return cursoId;
	}

	public void setCursoId(Cursos cursoId) {
		this.cursoId = cursoId;
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

	public List<Temas> getTemasList() {
        return temasList;
    }

    public void setTemasList(List<Temas> temasList) {
        this.temasList = temasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unidadAprendizajeId != null ? unidadAprendizajeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadAprendizaje)) {
            return false;
        }
        UnidadAprendizaje other = (UnidadAprendizaje) object;
        if ((this.unidadAprendizajeId == null && other.unidadAprendizajeId != null) || (this.unidadAprendizajeId != null && !this.unidadAprendizajeId.equals(other.unidadAprendizajeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.UnidadAprendizaje[ unidadAprendizajeId=" + unidadAprendizajeId + " ]";
    }
    
}
