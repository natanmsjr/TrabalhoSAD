package br.ufs.trabalhosad.modelo;
 
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Natan
 */

@Entity
public class Turma implements Serializable {
    
    @Id
    @GeneratedValue
    private String disciplina;
    private String professor;
    private String dias_horario;
    private int numero_alunos;
    private String curso;
    private int periodo;
    private int acessivel;
    private int qualidade;
    
    public Turma() {}
    
    public Turma(String disciplina, String professor, String dias_horario, int numero_alunos, String curso, int periodo, int acessivel, int qualidade) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.dias_horario = dias_horario;
        this.numero_alunos = numero_alunos;
        this.curso = curso;
        this.periodo = periodo;
        this.acessivel = acessivel;
        this.qualidade = qualidade;        
    }
    
    public String getDisciplina() {
        return disciplina;
    }
 
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public String getProfessor() {
        return professor;
    }
 
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public String getDiasHorario() {
        return dias_horario;
    }
 
    public void setDiasHorario(String dias_horario) {
        this.dias_horario = dias_horario;
    }
        
    public int getNumeroAlunos() {
        return numero_alunos;
    }
 
    public void setNumeroAlunos(int numero_alunos) {
        this.numero_alunos = numero_alunos;
    }
    
    public String getCurso() {
        return curso;
    }
 
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getPeriodo() {
        return periodo;
    }
 
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public int getAcessivel() {
        return acessivel;
    }
    
    public void setAcessivel(int acessivel) {
        this.acessivel = acessivel;
    }
    
    public int getQualidade() {
        return qualidade;
    }
    
    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }
}
