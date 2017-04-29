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
@Table(name = "temas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Temas.findAll", query = "SELECT t FROM Temas t")
    , @NamedQuery(name = "Temas.findByTemaId", query = "SELECT t FROM Temas t WHERE t.temaId = :temaId")
    , @NamedQuery(name = "Temas.findByCodigo", query = "SELECT t FROM Temas t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Temas.findByNombre", query = "SELECT t FROM Temas t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Temas.findByDescripcion", query = "SELECT t FROM Temas t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "Temas.findByObjetivo", query = "SELECT t FROM Temas t WHERE t.objetivo = :objetivo")
    , @NamedQuery(name = "Temas.findByFechaRegistro", query = "SELECT t FROM Temas t WHERE t.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Temas.findByFechaActualizacion", query = "SELECT t FROM Temas t WHERE t.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "Temas.findByReferencia1", query = "SELECT t FROM Temas t WHERE t.referencia1 = :referencia1")})
public class Temas implements Serializable {

    @OneToMany(mappedBy = "temaId")
    private List<RecursosXTema> recursosXTemaList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tema_id")
    private Integer temaId;
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

    @XmlTransient
    public List<RecursosXTema> getRecursosXTemaList() {
        return recursosXTemaList;
    }

    public void setRecursosXTemaList(List<RecursosXTema> recursosXTemaList) {
        this.recursosXTemaList = recursosXTemaList;
    }
    
}
