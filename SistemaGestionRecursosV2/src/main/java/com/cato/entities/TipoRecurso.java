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
@Table(name = "tipo_recurso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoRecurso.findAll", query = "SELECT t FROM TipoRecurso t")
    , @NamedQuery(name = "TipoRecurso.findByTipoRecursoId", query = "SELECT t FROM TipoRecurso t WHERE t.tipoRecursoId = :tipoRecursoId")
    , @NamedQuery(name = "TipoRecurso.findByCodigo", query = "SELECT t FROM TipoRecurso t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "TipoRecurso.findByNombre", query = "SELECT t FROM TipoRecurso t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoRecurso.findByDescripcion", query = "SELECT t FROM TipoRecurso t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoRecurso.findByFechaRegistro", query = "SELECT t FROM TipoRecurso t WHERE t.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "TipoRecurso.findByFechaActualizacion", query = "SELECT t FROM TipoRecurso t WHERE t.fechaActualizacion = :fechaActualizacion")})
public class TipoRecurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipo_recurso_id")
    private Integer tipoRecursoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @OneToMany(mappedBy = "tipoRecursoId")
    private List<RecursosXTema> recursosXTemaList;
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
    private Estado codigoEstado;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;

    public TipoRecurso() {
    }

    public TipoRecurso(Integer tipoRecursoId) {
        this.tipoRecursoId = tipoRecursoId;
    }

    public TipoRecurso(Integer tipoRecursoId, String codigo, String nombre, String descripcion, Date fechaRegistro) {
        this.tipoRecursoId = tipoRecursoId;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getTipoRecursoId() {
        return tipoRecursoId;
    }

    public void setTipoRecursoId(Integer tipoRecursoId) {
        this.tipoRecursoId = tipoRecursoId;
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

    @XmlTransient
    public List<RecursosXTema> getRecursosXTemaList() {
        return recursosXTemaList;
    }

    public void setRecursosXTemaList(List<RecursosXTema> recursosXTemaList) {
        this.recursosXTemaList = recursosXTemaList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoRecursoId != null ? tipoRecursoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRecurso)) {
            return false;
        }
        TipoRecurso other = (TipoRecurso) object;
        if ((this.tipoRecursoId == null && other.tipoRecursoId != null) || (this.tipoRecursoId != null && !this.tipoRecursoId.equals(other.tipoRecursoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.TipoRecurso[ tipoRecursoId=" + tipoRecursoId + " ]";
    }
    
}
