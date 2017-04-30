/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.sessions;

import com.cato.entities.Temas;
import com.cato.entities.UnidadAprendizaje;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alicia C
 */
@Stateless
public class TemasFacade extends AbstractFacade<Temas> {

    @PersistenceContext(unitName = "com.cato_SistemaGestionRecursosV2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TemasFacade() {
        super(Temas.class);
    }
    
    public List<Temas> findByUnidadAprendizajeId(UnidadAprendizaje unidadAprendizaje) {
        
        try {
           return (List<Temas>) em.createNamedQuery("Temas.findByUnidadAprendizajeId")
                   .setParameter(1, unidadAprendizaje)
                   .getResultList();
        }catch(Exception ex) {
            return null;
        }
    }    
    
}
