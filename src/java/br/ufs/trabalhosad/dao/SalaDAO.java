package br.ufs.trabalhosad.dao;

import br.ufs.trabalhosad.modelo.Sala;
import javax.ejb.Stateless;
import java.util.List;
/**
 *
 * @author Natan
 */

@Stateless
public class SalaDAO extends DAO<Sala> {
    private static final long serialVersionUID = 1L;
    
    public SalaDAO() {
        super(Sala.class);
    }

    public int adicionarQtdEstoque(int id, int qtd){
		Sala s = entityManager.find(Sala.class, id);
		int numero_cadeiras = s.getNumeroCadeiras();
		s.setNumeroCadeiras(numero_cadeiras + qtd);
		this.atualizar(s);
		return numero_cadeiras + qtd;
	}
	
	public int removerQtdEstoque(int id, int qtd){
		Sala s = entityManager.find(Sala.class, id);
		int numero_cadeiras = s.getNumeroCadeiras();
		s.setNumeroCadeiras(numero_cadeiras + qtd);
		this.atualizar(s);
		return numero_cadeiras - qtd;
	}
	
	public List<Sala> buscarPadrao(String padrao){
		return entityManager.createQuery("select l from Livro l where l.titulo = " + padrao).getResultList();
	}
	
	public List<Sala> livrosEscassos(){
        String estoqueEscasso = "yes";
		return entityManager.createQuery("select l from Livro l where l.estoque <= " + estoqueEscasso).getResultList();
	}
}
