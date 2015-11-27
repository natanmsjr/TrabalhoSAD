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
    
    public DataModel getListarSalas() throws Exception {
        List<Sala> lista = new SalaDAO().listar();
        listaSalas = new ListDataModel(lista);
        return listaSalas;
    }
    
    public Sala getSala() {
        return sala;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}