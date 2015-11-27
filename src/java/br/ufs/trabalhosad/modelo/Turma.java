package br.ufs.trabalhosad.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Natan
 */
@Entity
@Table(name = "turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByIdTurma", query = "SELECT t FROM Turma t WHERE t.idTurma = :idTurma"),
    @NamedQuery(name = "Turma.findByDisciplina", query = "SELECT t FROM Turma t WHERE t.disciplina = :disciplina"),
    @NamedQuery(name = "Turma.findByProfessor", query = "SELECT t FROM Turma t WHERE t.professor = :professor"),
    @NamedQuery(name = "Turma.findByDiasHorario", query = "SELECT t FROM Turma t WHERE t.diasHorario = :diasHorario"),
    @NamedQuery(name = "Turma.findByNAlunos", query = "SELECT t FROM Turma t WHERE t.nAlunos = :nAlunos"),
    @NamedQuery(name = "Turma.findByCurso", query = "SELECT t FROM Turma t WHERE t.curso = :curso"),
    @NamedQuery(name = "Turma.findByPer\u00edodo", query = "SELECT t FROM Turma t WHERE t.periodo = :periodo"),
    @NamedQuery(name = "Turma.findByAcessibilidade", query = "SELECT t FROM Turma t WHERE t.acessibilidade = :acessibilidade"),
    @NamedQuery(name = "Turma.findByQualidade", query = "SELECT t FROM Turma t WHERE t.qualidade = :qualidade")})
public class Turma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTurma")
    private Integer idTurma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Disciplina")
    private String disciplina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "Professor")
    private String professor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "DiasHorario")
    private String diasHorario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NAlunos")
    private int nAlunos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Curso")
    private String curso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Periodo")
    private int período;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Acessibilidade")
    private int acessibilidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Qualidade")
    private int qualidade;

    public Turma() {
    }

    public Turma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public Turma(Integer idTurma, String disciplina, String professor, String diasHorario, int nAlunos, String curso, int período, int acessibilidade, int qualidade) {
        this.idTurma = idTurma;
        this.disciplina = disciplina;
        this.professor = professor;
        this.diasHorario = diasHorario;
        this.nAlunos = nAlunos;
        this.curso = curso;
        this.período = período;
        this.acessibilidade = acessibilidade;
        this.qualidade = qualidade;
    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
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
        return diasHorario;
    }

    public void setDiasHorario(String diasHorario) {
        this.diasHorario = diasHorario;
    }

    public int getNAlunos() {
        return nAlunos;
    }

    public void setNAlunos(int nAlunos) {
        this.nAlunos = nAlunos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeríodo() {
        return período;
    }

    public void setPeríodo(int período) {
        this.período = período;
    }

    public int getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(int acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTurma != null ? idTurma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.idTurma == null && other.idTurma != null) || (this.idTurma != null && !this.idTurma.equals(other.idTurma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.ufs.trabalhosad.modelo.Turma[ idTurma=" + idTurma + " ]";
    }
    
}
