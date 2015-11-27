/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.trabalhosad.session;

import br.ufs.trabalhosad.modelo.Sala;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Natan
 */
@Stateless
public class SalaFacade extends AbstractFacade<Sala> {
    @PersistenceContext(unitName = "TrabalhoSAD")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalaFacade() {
        super(Sala.class);
    }
    
}
