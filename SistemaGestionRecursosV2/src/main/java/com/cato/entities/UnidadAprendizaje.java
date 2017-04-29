/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alicia C
 */
@Entity
@Table(name = "unidad_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadAprendizaje.findAll", query = "SELECT u FROM UnidadAprendizaje u")
    , @NamedQuery(name = "UnidadAprendizaje.findByUnidadAprendizajeId", query = "SELECT u FROM UnidadAprendizaje u WHERE u.unidadAprendizajeId = :unidadAprendizajeId")
    , @NamedQuery(name = "UnidadAprendizaje.findByCodigo", query = "SELECT u FROM UnidadAprendizaje u WHERE u.codigo = :codigo")
    , @NamedQuery(name = "UnidadAprendizaje.findByNombre", query = "SELECT u FROM UnidadAprendizaje u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "UnidadAprendizaje.findByDescripcion", query = "SELECT u FROM UnidadAprendizaje u WHERE u.descripcion = :descripcion")
    , @NamedQuery(name = "UnidadAprendizaje.findByObjetivo", query = "SELECT u FROM UnidadAprendizaje u WHERE u.objetivo = :objetivo")
    , @NamedQuery(name = "UnidadAprendizaje.findByCantTemas", query = "SELECT u FROM UnidadAprendizaje u WHERE u.cantTemas = :cantTemas")
    , @NamedQuery(name = "UnidadAprendizaje.findByFechaRegistro", query = "SELECT u FROM UnidadAprendizaje u WHERE u.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "UnidadAprendizaje.findByFechaActualizacion", query = "SELECT u FROM UnidadAprendizaje u WHERE u.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "UnidadAprendizaje.findByReferencia1", query = "SELECT u FROM UnidadAprendizaje u WHERE u.referencia1 = :referencia1")})
public class UnidadAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "unidad_aprendizaje_id")
    private Integer unidadAprendizajeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2500)
    @Column(name = "objetivo")
    private String objetivo;
    @Column(name = "cant_temas")
    private Integer cantTemas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @Size(max = 12)
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

    @XmlTransient
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
