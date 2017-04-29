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
import javax.persistence.Id;
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
@Table(name = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e")
    , @NamedQuery(name = "Estado.findByCodigoEstado", query = "SELECT e FROM Estado e WHERE e.codigoEstado = :codigoEstado")
    , @NamedQuery(name = "Estado.findByNombre", query = "SELECT e FROM Estado e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Estado.findByDescripcionBreve", query = "SELECT e FROM Estado e WHERE e.descripcionBreve = :descripcionBreve")
    , @NamedQuery(name = "Estado.findByFechaRegistro", query = "SELECT e FROM Estado e WHERE e.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Estado.findByFechaActualizacion", query = "SELECT e FROM Estado e WHERE e.fechaActualizacion = :fechaActualizacion")})
public class Estado implements Serializable {

    @OneToMany(mappedBy = "codigoEstado")
    private List<RecursosXTema> recursosXTemaList;
    @OneToMany(mappedBy = "codigoEstado")
    private List<TipoRecurso> tipoRecursoList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "codigo_estado")
    private String codigoEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "descripcion_breve")
    private String descripcionBreve;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActualizacion;
    @OneToMany(mappedBy = "codigoEstado")
    private List<Cursos> cursosList;
    @OneToMany(mappedBy = "codigoEstado")
    private List<CursosXMalla> cursosXMallaList;
    @OneToMany(mappedBy = "codigoEstado")
    private List<UnidadAprendizaje> unidadAprendizajeList;
    @OneToMany(mappedBy = "codigoEstado")
    private List<Temas> temasList;
    @OneToMany(mappedBy = "codigoEstado")
    private List<Usuarios> usuariosList;
    @OneToMany(mappedBy = "codigoEstado")
    private List<Mallas> mallasList;

    public Estado() {
    }

    public Estado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public Estado(String codigoEstado, String nombre, String descripcionBreve, Date fechaRegistro) {
        this.codigoEstado = codigoEstado;
        this.nombre = nombre;
        this.descripcionBreve = descripcionBreve;
        this.fechaRegistro = fechaRegistro;
    }

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

    @XmlTransient
    public List<Cursos> getCursosList() {
        return cursosList;
    }

    public void setCursosList(List<Cursos> cursosList) {
        this.cursosList = cursosList;
    }

    @XmlTransient
    public List<CursosXMalla> getCursosXMallaList() {
        return cursosXMallaList;
    }

    public void setCursosXMallaList(List<CursosXMalla> cursosXMallaList) {
        this.cursosXMallaList = cursosXMallaList;
    }

    @XmlTransient
    public List<UnidadAprendizaje> getUnidadAprendizajeList() {
        return unidadAprendizajeList;
    }

    public void setUnidadAprendizajeList(List<UnidadAprendizaje> unidadAprendizajeList) {
        this.unidadAprendizajeList = unidadAprendizajeList;
    }

    @XmlTransient
    public List<Temas> getTemasList() {
        return temasList;
    }

    public void setTemasList(List<Temas> temasList) {
        this.temasList = temasList;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @XmlTransient
    public List<Mallas> getMallasList() {
        return mallasList;
    }

    public void setMallasList(List<Mallas> mallasList) {
        this.mallasList = mallasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEstado != null ? codigoEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.codigoEstado == null && other.codigoEstado != null) || (this.codigoEstado != null && !this.codigoEstado.equals(other.codigoEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.Estado[ codigoEstado=" + codigoEstado + " ]";
    }

    @XmlTransient
    public List<RecursosXTema> getRecursosXTemaList() {
        return recursosXTemaList;
    }

    public void setRecursosXTemaList(List<RecursosXTema> recursosXTemaList) {
        this.recursosXTemaList = recursosXTemaList;
    }

    @XmlTransient
    public List<TipoRecurso> getTipoRecursoList() {
        return tipoRecursoList;
    }

    public void setTipoRecursoList(List<TipoRecurso> tipoRecursoList) {
        this.tipoRecursoList = tipoRecursoList;
    }
    
}
