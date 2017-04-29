/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alicia C
 */
@Entity
@Table(name = "recursos_x_tema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RecursosXTema.findAll", query = "SELECT r FROM RecursosXTema r")
    , @NamedQuery(name = "RecursosXTema.findByRxtId", query = "SELECT r FROM RecursosXTema r WHERE r.rxtId = :rxtId")
    , @NamedQuery(name = "RecursosXTema.findByFuente", query = "SELECT r FROM RecursosXTema r WHERE r.fuente = :fuente")
    , @NamedQuery(name = "RecursosXTema.findByDescripcion", query = "SELECT r FROM RecursosXTema r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "RecursosXTema.findByDetalleDescripcion", query = "SELECT r FROM RecursosXTema r WHERE r.detalleDescripcion = :detalleDescripcion")
    , @NamedQuery(name = "RecursosXTema.findByContenturl", query = "SELECT r FROM RecursosXTema r WHERE r.contenturl = :contenturl")
    , @NamedQuery(name = "RecursosXTema.findByUrl", query = "SELECT r FROM RecursosXTema r WHERE r.url = :url")
    , @NamedQuery(name = "RecursosXTema.findByLicense", query = "SELECT r FROM RecursosXTema r WHERE r.license = :license")
    , @NamedQuery(name = "RecursosXTema.findByReferencia1", query = "SELECT r FROM RecursosXTema r WHERE r.referencia1 = :referencia1")
    , @NamedQuery(name = "RecursosXTema.findByReferencia2", query = "SELECT r FROM RecursosXTema r WHERE r.referencia2 = :referencia2")
    , @NamedQuery(name = "RecursosXTema.findByFechaRegistro", query = "SELECT r FROM RecursosXTema r WHERE r.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "RecursosXTema.findByFechaActualizacion", query = "SELECT r FROM RecursosXTema r WHERE r.fechaActualizacion = :fechaActualizacion")})
public class RecursosXTema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rxt_id")
    private Integer rxtId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2500)
    @Column(name = "fuente")
    private String fuente;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2147483647)
    @Column(name = "detalle_descripcion")
    private String detalleDescripcion;
    @Size(max = 2147483647)
    @Column(name = "contenturl")
    private String contenturl;
    @Size(max = 2147483647)
    @Column(name = "url")
    private String url;
    @Size(max = 2147483647)
    @Column(name = "license")
    private String license;
    @Size(max = 2147483647)
    @Column(name = "referencia1")
    private String referencia1;
    @Size(max = 2147483647)
    @Column(name = "referencia2")
    private String referencia2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
    private Estado codigoEstado;
    @JoinColumn(name = "tema_id", referencedColumnName = "tema_id")
    @ManyToOne
    private Temas temaId;
    @JoinColumn(name = "tipo_recurso_id", referencedColumnName = "tipo_recurso_id")
    @ManyToOne
    private TipoRecurso tipoRecursoId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;

    public RecursosXTema() {
    }

    public RecursosXTema(Integer rxtId) {
        this.rxtId = rxtId;
    }

    public RecursosXTema(Integer rxtId, String fuente, Date fechaRegistro) {
        this.rxtId = rxtId;
        this.fuente = fuente;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getRxtId() {
        return rxtId;
    }

    public void setRxtId(Integer rxtId) {
        this.rxtId = rxtId;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalleDescripcion() {
        return detalleDescripcion;
    }

    public void setDetalleDescripcion(String detalleDescripcion) {
        this.detalleDescripcion = detalleDescripcion;
    }

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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

    public Estado getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Estado codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public Temas getTemaId() {
        return temaId;
    }

    public void setTemaId(Temas temaId) {
        this.temaId = temaId;
    }

    public TipoRecurso getTipoRecursoId() {
        return tipoRecursoId;
    }

    public void setTipoRecursoId(TipoRecurso tipoRecursoId) {
        this.tipoRecursoId = tipoRecursoId;
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
        hash += (rxtId != null ? rxtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecursosXTema)) {
            return false;
        }
        RecursosXTema other = (RecursosXTema) object;
        if ((this.rxtId == null && other.rxtId != null) || (this.rxtId != null && !this.rxtId.equals(other.rxtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.RecursosXTema[ rxtId=" + rxtId + " ]";
    }
    
}
