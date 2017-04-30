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
    
    @Getter private List<RecursosXTema> lstVideos;
    @Getter private List<RecursosXTema> lstFotos;
    @Getter private List<RecursosXTema> lstEnlaces;
    
    @Inject private TemasFacade temasFacade;
    @Inject private MallasFacade mallasFacadeLocal; 
    @Inject private CursosXMallaFacade cursosXMallaFacade;
    @Inject private UnidadAprendizajeFacade unidadAprendizajeFacade;
    @Inject private RecursosXTemaFacade recursosXTemaFacade;      
    /** **/

    
    private String[] selectedConsoles;
    private String temaBuscar; 
    /*
    private List<Recurso> recurso1;     
    private List<Recurso> recurso2;     
    private List<Recurso> recurso3;    
    private List<Recurso> recurso4; */
    private ArrayList<Recurso> arrayrecurso1 = new ArrayList<Recurso>();
    private ArrayList<Recurso> arrayrecurso2 = new ArrayList<Recurso>();
    private ArrayList<Recurso> arrayrecurso3 = new ArrayList<Recurso>();
    private ArrayList<Recurso> arrayrecurso4 = new ArrayList<Recurso>();

    public RecursosXTemaController() {
    }
    
    @PostConstruct
    public void initRegistroMaterialPropuesto() {
        tipoBusquedaMalla       = "";
        valorTipoBusquedaMalla  = "";
        curso = new Cursos();
        unidadAprendizaje = new UnidadAprendizaje();        
        tema = new Temas();
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
        lstVideos   = recursosXTemaFacade.findByTemaId(tema, 2);
        lstFotos    = recursosXTemaFacade.findByTemaId(tema, 1);
        lstEnlaces  = recursosXTemaFacade.findByTemaId(tema, 3);
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
    
    public void BuscarRecursosSugeridos() {
        
        Search search         = new Search();
        JSONObject JsonResult = new JSONObject();
        Recurso rec = new Recurso();
        Recurso rec1 = new Recurso();
        Recurso rec2 = new Recurso();
        try {
            if (selectedConsoles.length>0) {
                JsonResult = search.BuscarRecursosOnline(getTemaBuscar());               
                // Parseando los recursos (resultados de la Web)
                JSONArray elements = (JSONArray) JsonResult.get("itemListElement");

                for (Object element : elements) {
                  
                  System.out.println("--------------------------------");
                  System.out.println(JsonPath.read(element, "$.result.name").toString());
                  System.out.println(JsonPath.read(element, "$.result.detailedDescription.url").toString());
                  System.out.println("--------------------------------");
                   
                  rec.setTema(JsonPath.read(element, "$.result.name").toString());
                  rec.setUrl(JsonPath.read(element, "$.result.detailedDescription.url").toString());
                  arrayrecurso1.add(rec);
                  
                  rec.setTema(JsonPath.read(element, "$.result.name").toString());
                  rec.setUrl(JsonPath.read(element, "$.result.detailedDescription.url").toString());
                  arrayrecurso3.add(rec1);
                  
                  rec.setTema(JsonPath.read(element, "$.result.name").toString());
                  rec.setUrl(JsonPath.read(element, "$.result.detailedDescription.url").toString());
                  arrayrecurso3.add(rec2);
       
        
                 /* recurso1.add(new Recurso("AAA","url"));
                  recurso2.add(new Recurso("BBB","url_"));
                  recurso3.add(new Recurso("CCC","URL_CCC"));*/
                  /*
                  recurso1.add(new 
                        Recurso(JsonPath.read(element, "$.result.name").toString(),
                                JsonPath.read(element, "$.result.detailedDescription.url").toString()));
                  recurso2.add(new 
                        Recurso(JsonPath.read(element, "$.result.name").toString(),
                                JsonPath.read(element, "$.result.detailedDescription.url").toString()));
                  recurso3.add(new 
                        Recurso(JsonPath.read(element, "$.result.name").toString(),
                                JsonPath.read(element, "$.result.detailedDescription.url").toString()));*/
                }                 
                        
            }else{
                persist(null, ResourceBundle.getBundle("resources/Bundle").getString("SELECCIONE_RECURSO"));               
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
  
    public List<Recurso> createRecurso(String name, String URL, int size) {
        List<Recurso> list = new ArrayList<Recurso>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Recurso(name, URL));   
        }
        return list;
    }    

    /**
     * @return the selectedConsoles
     */
    public String[] getSelectedConsoles() {
        return selectedConsoles;
    }

    /**
     * @param selectedConsoles the selectedConsoles to set
     */
    public void setSelectedConsoles(String[] selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }

    /**
     * @return the temaBuscar
     */
    public String getTemaBuscar() {
        return temaBuscar;
    }

    /**
     * @param temaBuscar the temaBuscar to set
     */
    public void setTemaBuscar(String temaBuscar) {
        this.temaBuscar = temaBuscar;
    }

    /**
     * @return the arrayrecurso1
     */
    public ArrayList<Recurso> getArrayrecurso1() {
        return arrayrecurso1;
    }

    /**
     * @param arrayrecurso1 the arrayrecurso1 to set
     */
    public void setArrayrecurso1(ArrayList<Recurso> arrayrecurso1) {
        this.arrayrecurso1 = arrayrecurso1;
    }

    /**
     * @return the arrayrecurso2
     */
    public ArrayList<Recurso> getArrayrecurso2() {
        return arrayrecurso2;
    }

    /**
     * @param arrayrecurso2 the arrayrecurso2 to set
     */
    public void setArrayrecurso2(ArrayList<Recurso> arrayrecurso2) {
        this.arrayrecurso2 = arrayrecurso2;
    }

    /**
     * @return the arrayrecurso3
     */
    public ArrayList<Recurso> getArrayrecurso3() {
        return arrayrecurso3;
    }

    /**
     * @param arrayrecurso3 the arrayrecurso3 to set
     */
    public void setArrayrecurso3(ArrayList<Recurso> arrayrecurso3) {
        this.arrayrecurso3 = arrayrecurso3;
    }

    /**
     * @return the arrayrecurso4
     */
    public ArrayList<Recurso> getArrayrecurso4() {
        return arrayrecurso4;
    }

    /**
     * @param arrayrecurso4 the arrayrecurso4 to set
     */
    public void setArrayrecurso4(ArrayList<Recurso> arrayrecurso4) {
        this.arrayrecurso4 = arrayrecurso4;
    }



}
