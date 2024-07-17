    
package com.mycompany.projetolpooe1_elielsilveira.model.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eliel
 */
public class PersistenciaJPA implements InterfacePersistencia{

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("ProjetoLPOOE1_elielsilveira");
        entity = factory.createEntityManager();
    }
    
    
    
    
    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

   

    @Override
    public void persist(Object o) throws Exception {
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
    }

    
}
