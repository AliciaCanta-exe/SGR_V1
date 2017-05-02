package com.cato.jsf.controllers;

import com.cato.entities.Cursos;
import com.cato.entities.CursosXMalla;
import com.cato.entities.Mallas;
import com.cato.entities.Recurso;
import com.cato.entities.RecursosXTema;
import com.cato.entities.Temas;
import com.cato.entities.UnidadAprendizaje;
import com.cato.jsf.controllers.util.JsfUtil;
import com.cato.jsf.controllers.util.JsfUtil.PersistAction;
import com.cato.sessions.CursosXMallaFacade;
import com.cato.sessions.MallasFacade;
import com.cato.sessions.RecursosXTemaFacade;
import com.cato.sessions.TemasFacade;
import com.cato.sessions.UnidadAprendizajeFacade;
import com.cato.utils.CarService;
import com.cato.utils.Search;
import com.jayway.jsonpath.JsonPath;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;

@Named("recursosXTemaController")
@SessionScoped
public class RecursosXTemaController implements Serializable {

    @EJB
    private com.cato.sessions.RecursosXTemaFacade ejbFacade;
    private List<RecursosXTema> items = null;
    private RecursosXTema selected;

    /*** TRAER LOS ***/
    @Getter @Setter private String tipoBusquedaMalla;
    @Getter @Setter private String valorTipoBusquedaMalla;   
    @Getter @Setter private UnidadAprendizaje unidadAprendizaje;
    @Getter @Setter private Cursos curso;
    @Getter @Setter private Temas tema;
    
    @Getter private List<CursosXMalla> lstCursos;
    @Getter private List<UnidadAprendizaje> lstUnidadAprendizaje;
    @Getter private List<Temas> lstTemas;
    
    @Getter private List<RecursosXTema> lstVideos = null;
    @Getter private List<RecursosXTema> lstFotos = null;
    @Getter private List<RecursosXTema> lstEnlaces = null;
    
    @Inject private TemasFacade temasFacade;
    @Inject private MallasFacade mallasFacadeLocal; 
    @Inject private CursosXMallaFacade cursosXMallaFacade;
    @Inject private UnidadAprendizajeFacade unidadAprendizajeFacade;
    @Inject private RecursosXTemaFacade recursosXTemaFacade;      
    /** **/
    
    @Getter @Setter private List<Recurso> recurso1;     
    @Getter @Setter private List<Recurso> recurso2;     
    @Getter @Setter private List<Recurso> recurso3;    
    @Getter @Setter private List<Recurso> recurso4;
    
    @Getter @Setter private String[] selectedConsoles;
    @Getter @Setter private String temaBuscar; 
    /*
     */

    public RecursosXTemaController() {
    }
    
    @PostConstruct
    public void initRegistroMaterialPropuesto() {
        tipoBusquedaMalla       = "";
        valorTipoBusquedaMalla  = "";
        curso = new Cursos();
        unidadAprendizaje = new UnidadAprendizaje();        
        tema = new Temas();
        temaBuscar = "";
        
    }    
    
    public void buscarPorMallaLstCursos() {
        
        Mallas malla = null;
        
        if(tipoBusquedaMalla.equals("codigo")) {
            malla = mallasFacadeLocal.findByCodigo(valorTipoBusquedaMalla);
        } else {
            malla = mallasFacadeLocal.findByAnio(valorTipoBusquedaMalla);
        }        
        lstCursos = cursosXMallaFacade.findByMallaId(malla);        
    }    
    
    public void buscarPorCursoUnidadAprendizaje() {        
        lstUnidadAprendizaje = unidadAprendizajeFacade.findByCursoId(curso);   
    }

    public void buscarPorUnidadAprendizajeTemas() {    
        lstTemas = temasFacade.findByUnidadAprendizajeId(unidadAprendizaje);        
    }  
    
    public void buscarPorTemaVideosFotosYEnlaces() {   
        
        if (recursosXTemaFacade.findByTemaId(tema, 2)!=null){
         lstVideos   = recursosXTemaFacade.findByTemaId(tema, 2);
        }
        if (recursosXTemaFacade.findByTemaId(tema, 2)!=null){
         lstFotos    = recursosXTemaFacade.findByTemaId(tema, 1);
        }
        if (recursosXTemaFacade.findByTemaId(tema, 2)!=null){
         lstEnlaces  = recursosXTemaFacade.findByTemaId(tema, 3);
        }        
        
        
    }
        
    
    public RecursosXTema getSelected() {
        return selected;
    }

    public void setSelected(RecursosXTema selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private RecursosXTemaFacade getFacade() {
        return ejbFacade;
    }

    public RecursosXTema prepareCreate() {
        selected = new RecursosXTema();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("resources/Bundle").getString("RecursosXTemaCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("resources/Bundle").getString("RecursosXTemaUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("resources/Bundle").getString("RecursosXTemaDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<RecursosXTema> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("resources/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("resources/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public RecursosXTema getRecursosXTema(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<RecursosXTema> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<RecursosXTema> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = RecursosXTema.class)
    public static class RecursosXTemaControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            RecursosXTemaController controller = (RecursosXTemaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "recursosXTemaController");
            return controller.getRecursosXTema(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof RecursosXTema) {
                RecursosXTema o = (RecursosXTema) object;
                return getStringKey(o.getRxtId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), RecursosXTema.class.getName()});
                return null;
            }
        }
    }
    
    @ManagedProperty("#{carService}")
    private CarService service;    
    
    public void BuscarRecursosSugeridos() {
        
        Search search         = new Search();
        JSONObject JsonResult = new JSONObject();
        try {
            if (selectedConsoles.length>0) {
                JsonResult = search.BuscarRecursosOnline(getTemaBuscar());               
                // Parseando los recursos (resultados de la Web)
                JSONArray elements = (JSONArray) JsonResult.get("itemListElement");

                    for(int x=0;x<selectedConsoles.length; x++){  
                       
                        System.out.println("Check "+x + " Valor: "+selectedConsoles[x]);
                        
                        if(selectedConsoles[x].equals("IMG")){
                            recurso1 =llenarLista(elements);                            
                        }else if (selectedConsoles[x].equals("VIDEO")){
                            recurso2 =llenarLista(elements);
                        }else if (selectedConsoles[x].equals("LINK")){
                            recurso3 =llenarLista(elements);
                        }   
                       //setSelected(null);
                    } 

            }else{
                persist(null, ResourceBundle.getBundle("resources/Bundle").getString("SELECCIONE_RECURSO"));               
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
  
    public List<Recurso> llenarLista(JSONArray elements) {
        List<Recurso> list = new ArrayList<Recurso>();
        for (int i=0; i<5; i++) {
        //for (int i=0; i<elements.size(); i++) {            
            list.add(new Recurso(
                    JsonPath.read(elements.get(i), "$.result.name").toString(), 
                    JsonPath.read(elements.get(i), "$.result.detailedDescription.url").toString()));   
        }
        return list;
    }    



}
