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
@Table(name = "cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c")
    , @NamedQuery(name = "Cursos.findByCursoId", query = "SELECT c FROM Cursos c WHERE c.cursoId = :cursoId")
    , @NamedQuery(name = "Cursos.findByCodigo", query = "SELECT c FROM Cursos c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Cursos.findByNombre", query = "SELECT c FROM Cursos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cursos.findByDescripcionBreve", query = "SELECT c FROM Cursos c WHERE c.descripcionBreve = :descripcionBreve")
    , @NamedQuery(name = "Cursos.findByObjetivo", query = "SELECT c FROM Cursos c WHERE c.objetivo = :objetivo")
    , @NamedQuery(name = "Cursos.findByCantUnidAprendizaje", query = "SELECT c FROM Cursos c WHERE c.cantUnidAprendizaje = :cantUnidAprendizaje")
    , @NamedQuery(name = "Cursos.findByFechaRegistro", query = "SELECT c FROM Cursos c WHERE c.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Cursos.findByFechaActualizacion", query = "SELECT c FROM Cursos c WHERE c.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "Cursos.findByReferencia1", query = "SELECT c FROM Cursos c WHERE c.referencia1 = :referencia1")})
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "curso_id")
    private Integer cursoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion_breve")
    private String descripcionBreve;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "objetivo")
    private String objetivo;
    @Column(name = "cant_unid_aprendizaje")
    private Integer cantUnidAprendizaje;
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
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuarios usuarioId;
    @OneToMany(mappedBy = "cursoId")
    private List<CursosXMalla> cursosXMallaList;
    @OneToMany(mappedBy = "cursoId")
    private List<UnidadAprendizaje> unidadAprendizajeList;

    public Cursos() {
    }

    public Cursos(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public Cursos(Integer cursoId, String codigo, String nombre, String descripcionBreve, String objetivo, Date fechaRegistro) {
        this.cursoId = cursoId;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcionBreve = descripcionBreve;
        this.objetivo = objetivo;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
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

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getCantUnidAprendizaje() {
        return cantUnidAprendizaje;
    }

    public void setCantUnidAprendizaje(Integer cantUnidAprendizaje) {
        this.cantUnidAprendizaje = cantUnidAprendizaje;
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

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoId != null ? cursoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.cursoId == null && other.cursoId != null) || (this.cursoId != null && !this.cursoId.equals(other.cursoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cato.entities.Cursos[ cursoId=" + cursoId + " ]";
    }
    
}
