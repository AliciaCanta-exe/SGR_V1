package com.cato.entities;

/**
 *
 * @author Alicia C
 */
import java.io.Serializable;

public class Recurso implements Serializable {
      
   private String tipo_recurso;
   private String tema;
   private String fuente;
   private String descripcion;
   private String detalle_descripcion;
   private String contentUrl;  
   private String url; 
   private String license;  
   private String referencia1;

    public Recurso() {}
    
    public Recurso(String tipo_recurso, String tema, String fuente, 
            String descripcion, String detalle_descripcion, String contentUrl,
            String url, String license, String referencia1) {
        this.tipo_recurso   = tipo_recurso;
        this.tema           = tema;
        this.fuente         = fuente;
        this.descripcion    = descripcion;
        this.detalle_descripcion = detalle_descripcion;
        this.contentUrl          = contentUrl;
        this.url                 = url;
        this.license             = license;
        this.referencia1         = referencia1;
    }

    /**
     * @return the tipo_recurso
     */
    public String getTipo_recurso() {
        return tipo_recurso;
    }

    /**
     * @param tipo_recurso the tipo_recurso to set
     */
    public void setTipo_recurso(String tipo_recurso) {
        this.tipo_recurso = tipo_recurso;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the fuente
     */
    public String getFuente() {
        return fuente;
    }

    /**
     * @param fuente the fuente to set
     */
    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the detalle_descripcion
     */
    public String getDetalle_descripcion() {
        return detalle_descripcion;
    }

    /**
     * @param detalle_descripcion the detalle_descripcion to set
     */
    public void setDetalle_descripcion(String detalle_descripcion) {
        this.detalle_descripcion = detalle_descripcion;
    }

    /**
     * @return the contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * @param contentUrl the contentUrl to set
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the referencia1
     */
    public String getReferencia1() {
        return referencia1;
    }

    /**
     * @param referencia1 the referencia1 to set
     */
    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }    
}