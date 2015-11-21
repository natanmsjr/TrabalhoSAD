package br.ufs.trabalhosad.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Natan
 */
public class DAO<Entidade> implements Serializable {
    protected static final long serialVersionUID = 1L;
    
    @PersistenceContext(unitName = "colegio")
    protected EntityManager entityManager;

    private final Class<Entidade> classeDaEntidade;

    public DAO(Class<Entidade> classeDaEntidade) {
        this.classeDaEntidade = classeDaEntidade;
    }

    public void atualizar(Entidade entidade) {
        entityManager.merge(entidade);
    }

    public Entidade buscar(Integer id) {
        return entityManager.find(classeDaEntidade, id);
    }

    public void inserir(Entidade entidade) {
        entityManager.persist(entidade);
    }

    public List<Entidade> listar() {
        return entityManager.createQuery("SELECT entidade FROM " + classeDaEntidade.getSimpleName() + " entidade", classeDaEntidade).getResultList();
    }

    public void remover(Integer id){
        entityManager.remove(entityManager.find(classeDaEntidade, id));
    };
}
