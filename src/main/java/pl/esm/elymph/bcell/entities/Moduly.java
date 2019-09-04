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
@Table(name = "moduly")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Moduly.findAll", query = "SELECT m FROM Moduly m")})
public class Moduly implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mod_id")
    private Integer modId;
    @Size(max = 255)
    @Column(name = "mod_nazwa")
    private String modNazwa;
    @Size(max = 255)
    @Column(name = "mod_nazwa_gwt")
    private String modNazwaGwt;
    @Column(name = "mod_ident_gwt")
    private Integer modIdentGwt;
    @Size(max = 255)
    @Column(name = "mod_klasa")
    private String modKlasa;

    public Moduly() {
    }

    public Moduly(Integer modId) {
        this.modId = modId;
    }

    public Integer getModId() {
        return modId;
    }

    public void setModId(Integer modId) {
        this.modId = modId;
    }

    public String getModNazwa() {
        return modNazwa;
    }

    public void setModNazwa(String modNazwa) {
        this.modNazwa = modNazwa;
    }

    public String getModNazwaGwt() {
        return modNazwaGwt;
    }

    public void setModNazwaGwt(String modNazwaGwt) {
        this.modNazwaGwt = modNazwaGwt;
    }

    public Integer getModIdentGwt() {
        return modIdentGwt;
    }

    public void setModIdentGwt(Integer modIdentGwt) {
        this.modIdentGwt = modIdentGwt;
    }

    public String getModKlasa() {
        return modKlasa;
    }

    public void setModKlasa(String modKlasa) {
        this.modKlasa = modKlasa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modId != null ? modId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moduly)) {
            return false;
        }
        Moduly other = (Moduly) object;
        if ((this.modId == null && other.modId != null) || (this.modId != null && !this.modId.equals(other.modId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Moduly[ modId=" + modId + " ]";
    }
    
}
