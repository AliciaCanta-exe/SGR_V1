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
@Table(name = "cursos_x_malla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CursosXMalla.findAll", query = "SELECT c FROM CursosXMalla c")
    , @NamedQuery(name = "CursosXMalla.findByCxmId", query = "SELECT c FROM CursosXMalla c WHERE c.cxmId = :cxmId")
    , @NamedQuery(name = "CursosXMalla.findByDescripcion", query = "SELECT c FROM CursosXMalla c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CursosXMalla.findByObjetivo", query = "SELECT c FROM CursosXMalla c WHERE c.objetivo = :objetivo")
    , @NamedQuery(name = "CursosXMalla.findByFechaRegistro", query = "SELECT c FROM CursosXMalla c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "CursosXMalla.findByFechaActualizacion", query = "SELECT c FROM CursosXMalla c WHERE c.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "CursosXMalla.findByReferencia1", query = "SELECT c FROM CursosXMalla c WHERE c.referencia1 = :referencia1")
    , @NamedQuery(name = "CursosXMalla.findByMallaId", query = "SELECT c FROM CursosXMalla c WHERE c.mallaId = ?1")
    , @NamedQuery(name = "CursosXMalla.findByReferencia2", query = "SELECT c FROM CursosXMalla c WHERE c.referencia2 = :referencia2")})
public class CursosXMalla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cxm_id")
    private Integer cxmId;
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
    @Size(max = 12)
    @Column(name = "referencia2")
    private String referencia2;
    @JoinColumn(name = "curso_id", referencedColumnName = "curso_id")
    @ManyToOne
    private Cursos cursoId;
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
    private Estado codigoEstado;
    @JoinColumn(name = "malla_id", referencedColumnName = "malla_id")
    @ManyToOne
    private Mallas mallaId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;

    public CursosXMalla() {
    }

    public CursosXMalla(Integer cxmId) {
        this.cxmId = cxmId;
    }

    public CursosXMalla(Integer cxmId, String descripcion, String objetivo, Date fechaRegistro) {
        this.cxmId = cxmId;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getCxmId() {
        return cxmId;
    }

    public void setCxmId(Integer cxmId) {
        this.cxmId = cxmId;
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

    public String getReferencia2() {
        return referencia2;
    }

    public void setReferencia2(String referencia2) {
        this.referencia2 = referencia2;
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

    public Mallas getMallaId() {
        return mallaId;
    }

    public void setMallaId(Mallas mallaId) {
        this.mallaId = mallaId;
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
        hash += (cxmId != null ? cxmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursosXMalla)) {
            return false;
        }
        CursosXMalla other = (CursosXMalla) object;
        if ((this.cxmId == null && other.cxmId != null) || (this.cxmId != null && !this.cxmId.equals(other.cxmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.CursosXMalla[ cxmId=" + cxmId + " ]";
    }
    
}
