/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.sessions;

import com.cato.entities.Cursos;
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
public class UnidadAprendizajeFacade extends AbstractFacade<UnidadAprendizaje> {

    @PersistenceContext(unitName = "com.cato_SistemaGestionRecursosV2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadAprendizajeFacade() {
        super(UnidadAprendizaje.class);
    }
        public List<UnidadAprendizaje> findByCursoId(Cursos curso) {
        
        try {
           return (List<UnidadAprendizaje>) em.createNamedQuery("UnidadAprendizaje.findByCursoId")
                   .setParameter(1, curso)
                   .getResultList();
        }catch(Exception ex) {
            return null;
        }
    }
}
