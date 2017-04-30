/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cato.sessions;

import com.cato.entities.Mallas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alicia C
 */
@Stateless
public class MallasFacade extends AbstractFacade<Mallas> {

    @PersistenceContext(unitName = "com.cato_SistemaGestionRecursosV2_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MallasFacade() {
        super(Mallas.class);
    }

    public Mallas findByCodigo(String codigo) {

        try {
            return (Mallas) em.createNamedQuery("Mallas.findByCodigo")
                    .setParameter("codigo", codigo)
                    .getSingleResult();
        } catch (Exception ex) {
            return null;
        }
    }

    public Mallas findByAnio(String anio) {

        try {
            return (Mallas) em.createNamedQuery("Mallas.findByAnio")
                    .setParameter("anio", anio)
                    .getSingleResult();

        } catch (Exception ex) {
            return null;
        }
    }
}
