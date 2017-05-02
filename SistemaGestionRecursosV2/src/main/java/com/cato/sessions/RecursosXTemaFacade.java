/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.sessions;

import com.cato.entities.RecursosXTema;
import com.cato.entities.Temas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alicia C
 */
@Stateless
public class RecursosXTemaFacade extends AbstractFacade<RecursosXTema> {

    @PersistenceContext(unitName = "com.cato_SistemaGestionRecursosV2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecursosXTemaFacade() {
        super(RecursosXTema.class);
    }
    
    public List<RecursosXTema> findByTemaId(Temas tema, Integer tipo) {

    try {
        return (List<RecursosXTema>) em.createNamedQuery("RecursosXTema.findByTemaIdTipoId")
                .setParameter(1, tema)
                .setParameter(2, tipo)
                .getResultList();
    }catch(Exception ex) {
        return null;
    }

}
}
