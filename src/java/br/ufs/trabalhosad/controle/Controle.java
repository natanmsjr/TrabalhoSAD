package br.ufs.trabalhosad.controle;

import br.ufs.trabalhosad.dao.TurmaDAO;
import br.ufs.trabalhosad.modelo.Turma;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Natan
 */
public class Controle {
    private Turma turma;
    private DataModel listaTurma;
 
    public DataModel getListarTurma() {
        List<Turma> listaT = new TurmaDAO().list();
        listaTurma = new ListDataModel(listaT);
        return listaTurma;
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
        return "gerenciarTurma";
    }
    
    public String excluirTurma(){
        Turma turmaTemp = (Turma)(listaTurma.getRowData());
        TurmaDAO dao = new TurmaDAO();
        dao.remove(turmaTemp);
        return "index";
    }
    
    public String adicionarTurma(){
        TurmaDAO dao = new TurmaDAO();
        dao.save(turma);
        return "resultadobusca";
    }

    public String alterarTurma(){
        TurmaDAO dao = new TurmaDAO();
        dao.update(turma);
        return "resultadobusca";
    }
}