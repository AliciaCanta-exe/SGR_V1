package com.cato.utils;

/**
 * @author Alicia C
 **/
import com.cato.entities.Recurso;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataListView implements Serializable {
     
    private List<Recurso> recurso1;     
    private List<Recurso> recurso2;     
    private List<Recurso> recurso3;    
    private List<Recurso> recurso4;    
    
    private Recurso selectedRecurso;
     
    @ManagedProperty("#{carService}")
    private CarService service;
     
    @PostConstruct
    public void init() {
     //   cars1 = service.createCars(10);
       // cars2 = service.createCars(5);
        //cars3 = service.createCars(50);
    }

    /**
     * @return the recurso1
     */
    public List<Recurso> getRecurso1() {
        return recurso1;
    }

    /**
     * @param recurso1 the recurso1 to set
     */
    public void setRecurso1(List<Recurso> recurso1) {
        this.recurso1 = recurso1;
    }

    /**
     * @return the recurso2
     */
    public List<Recurso> getRecurso2() {
        return recurso2;
    }

    /**
     * @param recurso2 the recurso2 to set
     */
    public void setRecurso2(List<Recurso> recurso2) {
        this.recurso2 = recurso2;
    }

    /**
     * @return the recurso3
     */
    public List<Recurso> getRecurso3() {
        return recurso3;
    }

    /**
     * @param recurso3 the recurso3 to set
     */
    public void setRecurso3(List<Recurso> recurso3) {
        this.recurso3 = recurso3;
    }

    /**
     * @return the recurso4
     */
    public List<Recurso> getRecurso4() {
        return recurso4;
    }

    /**
     * @param recurso4 the recurso4 to set
     */
    public void setRecurso4(List<Recurso> recurso4) {
        this.recurso4 = recurso4;
    }

    /**
     * @return the selectedRecurso
     */
    public Recurso getSelectedRecurso() {
        return selectedRecurso;
    }

    /**
     * @param selectedRecurso the selectedRecurso to set
     */
    public void setSelectedRecurso(Recurso selectedRecurso) {
        this.selectedRecurso = selectedRecurso;
    }

}