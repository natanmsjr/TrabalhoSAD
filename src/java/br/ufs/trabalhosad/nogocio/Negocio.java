package br.ufs.trabalhosad.nogocio;

import br.ufs.trabalhosad.dao.SalaDAO;
import br.ufs.trabalhosad.dao.TurmaDAO;
import br.ufs.trabalhosad.modelo.Turma;
import br.ufs.trabalhosad.modelo.Sala;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Natan
 */

@ManagedBean
@SessionScoped
public class Negocio {
    private Turma turma;
    private Sala sala;
    private DataModel listaTurmas;
    private DataModel listaSalas;
 
    public DataModel getListarTurmas() {
        List<Turma> lista = new TurmaDAO().list();
        listaTurmas = new ListDataModel(lista);
        return listaTurmas;
    }
    
    public Turma getTurma() {
        return turma;
    }
    
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public String prepararAdicionarTurma(){
        turma = new Turma();
        return "gerenciarTurma";
    }
    
    public String prepararAlterarTurma(){
        turma = (Turma)(listaTurma.getRowData());
        return "gerenciarLivro";
    }
    
    public String excluirLivro(){
        Turma turmaTemp = (Turma)(listaTurma.getRowData());
        TurmaDAO dao = new TurmaDAO();
        dao.remove(turmaTemp);
        return "index";
    }
    
    public String adicionarLivro(){
        LivroDao dao = new LivroDaoImp();
        dao.save(livro);
        return "index";
    }
    
    public String alterarLivro(){
        LivroDao dao = new LivroDaoImp();
        dao.update(livro);
        return "index";
    }
}

