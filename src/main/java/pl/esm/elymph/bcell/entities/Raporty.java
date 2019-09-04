/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "raporty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Raporty.findAll", query = "SELECT r FROM Raporty r")})
public class Raporty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rap_id")
    private Integer rapId;
    @Column(name = "rap_slow_id_trap")
    private Integer rapSlowIdTrap;
    @Size(max = 255)
    @Column(name = "rap_nazwa")
    private String rapNazwa;
    @Size(max = 255)
    @Column(name = "rap_sciezka")
    private String rapSciezka;
    @Lob
    @Column(name = "rap_zapytanie")
    private byte[] rapZapytanie;

    public Raporty() {
    }

    public Raporty(Integer rapId) {
        this.rapId = rapId;
    }

    public Integer getRapId() {
        return rapId;
    }

    public void setRapId(Integer rapId) {
        this.rapId = rapId;
    }

    public Integer getRapSlowIdTrap() {
        return rapSlowIdTrap;
    }

    public void setRapSlowIdTrap(Integer rapSlowIdTrap) {
        this.rapSlowIdTrap = rapSlowIdTrap;
    }

    public String getRapNazwa() {
        return rapNazwa;
    }

    public void setRapNazwa(String rapNazwa) {
        this.rapNazwa = rapNazwa;
    }

    public String getRapSciezka() {
        return rapSciezka;
    }

    public void setRapSciezka(String rapSciezka) {
        this.rapSciezka = rapSciezka;
    }

    public byte[] getRapZapytanie() {
        return rapZapytanie;
    }

    public void setRapZapytanie(byte[] rapZapytanie) {
        this.rapZapytanie = rapZapytanie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rapId != null ? rapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Raporty)) {
            return false;
        }
        Raporty other = (Raporty) object;
        if ((this.rapId == null && other.rapId != null) || (this.rapId != null && !this.rapId.equals(other.rapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Raporty[ rapId=" + rapId + " ]";
    }
    
}
