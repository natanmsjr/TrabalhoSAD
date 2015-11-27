package br.ufs.trabalhosad.dao;

import java.util.List;

/**
 *
 * @author Administrador
 * @param <Entidade>
 */
public interface DAO<Entidade> {
    
    void inserir(Class<Entidade> classeDaEntidade) throws Exception;
    void remover(Class<Entidade> classeDaEntidade) throws Exception;
    void atualizar(Class<Entidade> classeDaEntidade) throws Exception;    
    Entidade buscar(Class<Entidade> classeDaEntidade) throws Exception;    
    List<Entidade> listar() throws Exception;
}
