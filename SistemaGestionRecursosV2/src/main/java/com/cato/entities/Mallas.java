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
@Table(name = "mallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mallas.findAll", query = "SELECT m FROM Mallas m")
    , @NamedQuery(name = "Mallas.findByMallaId", query = "SELECT m FROM Mallas m WHERE m.mallaId = :mallaId")
    , @NamedQuery(name = "Mallas.findByCodigo", query = "SELECT m FROM Mallas m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "Mallas.findByAnio", query = "SELECT m FROM Mallas m WHERE m.anio = :anio")
    , @NamedQuery(name = "Mallas.findByNombre", query = "SELECT m FROM Mallas m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Mallas.findByDescripcion", query = "SELECT m FROM Mallas m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Mallas.findByObjetivo", query = "SELECT m FROM Mallas m WHERE m.objetivo = :objetivo")
    , @NamedQuery(name = "Mallas.findByFechaRegistro", query = "SELECT m FROM Mallas m WHERE m.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Mallas.findByFechaActualizacion", query = "SELECT m FROM Mallas m WHERE m.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "Mallas.findByReferencia1", query = "SELECT m FROM Mallas m WHERE m.referencia1 = :referencia1")})
public class Mallas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "malla_id")
    private Integer mallaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "anio")
    private String anio;
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
    @OneToMany(mappedBy = "mallaId")
    private List<CursosXMalla> cursosXMallaList;
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
    private Estado codigoEstado;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;

    public Mallas() {
    }

    public Mallas(Integer mallaId) {
        this.mallaId = mallaId;
    }

    public Mallas(Integer mallaId, String codigo, String anio, String nombre, String descripcion, String objetivo, Date fechaRegistro) {
        this.mallaId = mallaId;
        this.codigo = codigo;
        this.anio = anio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.fechaRegistro = fechaRegistro;
    }

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

    @XmlTransient
    public List<CursosXMalla> getCursosXMallaList() {
        return cursosXMallaList;
    }

    public void setCursosXMallaList(List<CursosXMalla> cursosXMallaList) {
        this.cursosXMallaList = cursosXMallaList;
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
        hash += (mallaId != null ? mallaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mallas)) {
            return false;
        }
        Mallas other = (Mallas) object;
        if ((this.mallaId == null && other.mallaId != null) || (this.mallaId != null && !this.mallaId.equals(other.mallaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.Mallas[ mallaId=" + mallaId + " ]";
    }
    
}
