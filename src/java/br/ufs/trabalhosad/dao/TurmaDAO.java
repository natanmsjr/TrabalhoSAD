package br.ufs.trabalhosad.dao;

import br.ufs.trabalhosad.modelo.Turma;
import javax.ejb.Stateless;
import java.util.List;
/**
 *
 * @author Natan
 */

@Stateless
public class TurmaDAO extends DAO<Turma> {
    private static final long serialVersionUID = 1L;
    
    public TurmaDAO() {
        super(Turma.class);
    }

    public int adicionarQtdEstoque(int id, int qtd){
        Turma t = entityManager.find(Turma.class, id);
        int numero_alunos = t.getNumeroAlunos();
        t.setNumeroAlunos(numero_alunos + qtd);
        this.atualizar(t);
        return numero_alunos + qtd;
    }
    
    public int removerQtdEstoque(int id, int qtd){
        Turma t = entityManager.find(Turma.class, id);
        int numero_alunos = t.getNumeroAlunos();
        t.setNumeroAlunos(numero_alunos - qtd);
        this.atualizar(t);
        return numero_alunos - qtd;
    }
    
    public List<Turma> list(){
        return entityManager.createQuery("select * from colegio").getResultList();
    }
    
    public List<Turma> buscarPadrao(String padrao){
        return entityManager.createQuery("select * from colegio l where l.titulo = " + padrao).getResultList();
    }
    
    public List<Turma> livrosEscassos(){
        String estoqueEscasso = "yes";
        return entityManager.createQuery("select t from colegio t where l.estoque <= " + estoqueEscasso).getResultList();
    }
}