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
public class Sala implements Serializable{
    
    @Id
    @GeneratedValue
    private String id_sala;
    private int numero_cadeiras;
    private int acessivel;
    private int qualidade;

    public Sala() {}
    
    public Sala(String id_sala, int numero_cadeiras, int acessivel, int qualidade) {
        this.id_sala = id_sala;
        this.numero_cadeiras = numero_cadeiras;
        this.acessivel = acessivel;
        this.qualidade = qualidade;        
    }
    
    public String getIdSala() {
        return id_sala;
    }
 
    public void setIdSala(String id_sala) {
        this.id_sala = id_sala;
    }
    
    public int getNumeroCadeiras() {
        return numero_cadeiras;
    }
    
    public void setNumeroCadeiras(int numero_cadeiras) {
        this.numero_cadeiras = numero_cadeiras;
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
