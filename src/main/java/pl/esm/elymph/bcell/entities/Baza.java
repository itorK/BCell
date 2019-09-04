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
@Table(name = "baza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Baza.findAll", query = "SELECT b FROM Baza b")})
public class Baza implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "baz_id")
    private Integer bazId;
    @Size(max = 255)
    @Column(name = "baz_nazwa")
    private String bazNazwa;
    @Size(max = 255)
    @Column(name = "baz_nazwa_biz")
    private String bazNazwaBiz;

    public Baza() {
    }

    public Baza(Integer bazId) {
        this.bazId = bazId;
    }

    public Integer getBazId() {
        return bazId;
    }

    public void setBazId(Integer bazId) {
        this.bazId = bazId;
    }

    public String getBazNazwa() {
        return bazNazwa;
    }

    public void setBazNazwa(String bazNazwa) {
        this.bazNazwa = bazNazwa;
    }

    public String getBazNazwaBiz() {
        return bazNazwaBiz;
    }

    public void setBazNazwaBiz(String bazNazwaBiz) {
        this.bazNazwaBiz = bazNazwaBiz;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bazId != null ? bazId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Baza)) {
            return false;
        }
        Baza other = (Baza) object;
        if ((this.bazId == null && other.bazId != null) || (this.bazId != null && !this.bazId.equals(other.bazId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Baza[ bazId=" + bazId + " ]";
    }
    
}
