/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.trabalhosad.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "periodo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodo.findAll", query = "SELECT p FROM Periodo p"),
    @NamedQuery(name = "Periodo.findByIdPeriodo", query = "SELECT p FROM Periodo p WHERE p.idPeriodo = :idPeriodo"),
    @NamedQuery(name = "Periodo.findBySala", query = "SELECT p FROM Periodo p WHERE p.sala = :sala"),
    @NamedQuery(name = "Periodo.findByTurma", query = "SELECT p FROM Periodo p WHERE p.turma = :turma")})
public class Periodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "IdPeriodo")
    private String idPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Sala")
    private String sala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Turma")
    private int turma;

    public Periodo() {
    }

    public Periodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public Periodo(String idPeriodo, String sala, int turma) {
        this.idPeriodo = idPeriodo;
        this.sala = sala;
        this.turma = turma;
    }

    public String getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodo != null ? idPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodo)) {
            return false;
        }
        Periodo other = (Periodo) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.ufs.trabalhosad.modelo.Periodo[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
