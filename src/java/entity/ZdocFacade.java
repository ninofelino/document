/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nino
 */
@Stateless
public class ZdocFacade extends AbstractFacade<Zdoc> {

    @PersistenceContext(unitName = "docmgrPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZdocFacade() {
        super(Zdoc.class);
    }
    
}
