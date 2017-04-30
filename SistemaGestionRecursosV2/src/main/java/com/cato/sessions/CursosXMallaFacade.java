/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.sessions;

import com.cato.entities.CursosXMalla;
import com.cato.entities.Mallas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alicia C
 */
@Stateless
public class CursosXMallaFacade extends AbstractFacade<CursosXMalla> {

    @PersistenceContext(unitName = "com.cato_SistemaGestionRecursosV2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursosXMallaFacade() {
        super(CursosXMalla.class);
    }
    
    public List<CursosXMalla> findByMallaId(Mallas malla) {
    
        try {
            return (List<CursosXMalla>) em.createNamedQuery("CursosXMalla.findByMallaId")
                    .setParameter(1, malla)
                    .getResultList();
        } catch(Exception ex) {
            return null;
        }
    }    
    
}
