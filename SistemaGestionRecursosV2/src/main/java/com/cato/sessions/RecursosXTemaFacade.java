/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.sessions;

import com.cato.entities.RecursosXTema;
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
    
}
