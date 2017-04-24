package com.cato.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuario_id")
    private Integer usuarioId;
 
    @Column(name = "email")
    private String email;

    @Column(name = "clave")
    private String clave;    
    
    @Column(name = "dni")
    private String dni;    
    
    @Column(name = "rol")
    private String rol;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    
    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;
    
    @JoinColumn(name = "codigo_estado", referencedColumnName = "codigo_estado")
    @ManyToOne
    private Estado codigoEstado; 

    public Usuarios() {
    }

//    public Usuarios(Integer usuarioId) {
//        this.usuarioId = usuarioId;
//    }
//
//    public Usuarios(Integer usuarioId, String email, String clave, Date fechaRegistro) {
//        this.usuarioId 	= usuarioId;
//        this.email 			= email;
//        this.clave 			= clave;
//        this.fechaRegistro 	= fechaRegistro;
//    }    
    

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
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
	
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (usuarioId != null ? usuarioId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Usuarios)) {
//            return false;
//        }
//        Usuarios other = (Usuarios) object;
//        if ((this.usuarioId == null && other.usuarioId != null) || (this.usuarioId != null && !this.usuarioId.equals(other.usuarioId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.cato.entities.Usuarios[ usuarioId=" + usuarioId + " ]";
//    }	

}
