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
@Table(name = "pracownicy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pracownicy.findAll", query = "SELECT p FROM Pracownicy p")})
public class Pracownicy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prac_id")
    private Integer pracId;
    @Size(max = 255)
    @Column(name = "prac_nazwa")
    private String pracNazwa;

    public Pracownicy() {
    }

    public Pracownicy(Integer pracId) {
        this.pracId = pracId;
    }

    public Integer getPracId() {
        return pracId;
    }

    public void setPracId(Integer pracId) {
        this.pracId = pracId;
    }

    public String getPracNazwa() {
        return pracNazwa;
    }

    public void setPracNazwa(String pracNazwa) {
        this.pracNazwa = pracNazwa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pracId != null ? pracId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pracownicy)) {
            return false;
        }
        Pracownicy other = (Pracownicy) object;
        if ((this.pracId == null && other.pracId != null) || (this.pracId != null && !this.pracId.equals(other.pracId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Pracownicy[ pracId=" + pracId + " ]";
    }
    
}
