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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Natan
 */
@Entity
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s"),
    @NamedQuery(name = "Sala.findByIdSala", query = "SELECT s FROM Sala s WHERE s.idSala = :idSala"),
    @NamedQuery(name = "Sala.findByNCadeiras", query = "SELECT s FROM Sala s WHERE s.nCadeiras = :nCadeiras"),
    @NamedQuery(name = "Sala.findByAcessivel", query = "SELECT s FROM Sala s WHERE s.acessivel = :acessivel"),
    @NamedQuery(name = "Sala.findByQualidade", query = "SELECT s FROM Sala s WHERE s.qualidade = :qualidade")})
public class Sala implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdSala")
    private Integer idSala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NCadeiras")
    private int nCadeiras;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Acessivel")
    private int acessivel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Qualidade")
    private int qualidade;

    public Sala() {
    }

    public Sala(Integer idSala) {
        this.idSala = idSala;
    }

    public Sala(Integer idSala, int nCadeiras, int acessivel, int qualidade) {
        this.idSala = idSala;
        this.nCadeiras = nCadeiras;
        this.acessivel = acessivel;
        this.qualidade = qualidade;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public int getNCadeiras() {
        return nCadeiras;
    }

    public void setNCadeiras(int nCadeiras) {
        this.nCadeiras = nCadeiras;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSala != null ? idSala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.idSala == null && other.idSala != null) || (this.idSala != null && !this.idSala.equals(other.idSala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.ufs.trabalhosad.modelo.Sala[ idSala=" + idSala + " ]";
    }
    
}
