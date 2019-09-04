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
@Table(name = "bledy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bledy.findAll", query = "SELECT b FROM Bledy b")})
public class Bledy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "blad_id")
    private Integer bladId;
    @Column(name = "blad_typ_bledu")
    private Integer bladTypBledu;
    @Size(max = 25)
    @Column(name = "blad_typ_dow")
    private String bladTypDow;
    @Column(name = "blad_id_dow")
    private Integer bladIdDow;
    @Size(max = 255)
    @Column(name = "blad_tekst")
    private String bladTekst;

    public Bledy() {
    }

    public Bledy(Integer bladId) {
        this.bladId = bladId;
    }

    public Integer getBladId() {
        return bladId;
    }

    public void setBladId(Integer bladId) {
        this.bladId = bladId;
    }

    public Integer getBladTypBledu() {
        return bladTypBledu;
    }

    public void setBladTypBledu(Integer bladTypBledu) {
        this.bladTypBledu = bladTypBledu;
    }

    public String getBladTypDow() {
        return bladTypDow;
    }

    public void setBladTypDow(String bladTypDow) {
        this.bladTypDow = bladTypDow;
    }

    public Integer getBladIdDow() {
        return bladIdDow;
    }

    public void setBladIdDow(Integer bladIdDow) {
        this.bladIdDow = bladIdDow;
    }

    public String getBladTekst() {
        return bladTekst;
    }

    public void setBladTekst(String bladTekst) {
        this.bladTekst = bladTekst;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bladId != null ? bladId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bledy)) {
            return false;
        }
        Bledy other = (Bledy) object;
        if ((this.bladId == null && other.bladId != null) || (this.bladId != null && !this.bladId.equals(other.bladId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Bledy[ bladId=" + bladId + " ]";
    }
    
}
