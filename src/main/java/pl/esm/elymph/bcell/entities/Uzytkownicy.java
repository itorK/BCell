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
@Table(name = "uzytkownicy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Uzytkownicy.findAll", query = "SELECT u FROM Uzytkownicy u")})
public class Uzytkownicy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uzyt_id")
    private Integer uzytId;
    @Size(max = 255)
    @Column(name = "uzyt_nazwa")
    private String uzytNazwa;
    @Size(max = 255)
    @Column(name = "uzyt_password")
    private String uzytPassword;
    @Size(max = 255)
    @Column(name = "uzyt_baza")
    private String uzytBaza;

    public Uzytkownicy() {
    }

    public Uzytkownicy(Integer uzytId) {
        this.uzytId = uzytId;
    }

    public Integer getUzytId() {
        return uzytId;
    }

    public void setUzytId(Integer uzytId) {
        this.uzytId = uzytId;
    }

    public String getUzytNazwa() {
        return uzytNazwa;
    }

    public void setUzytNazwa(String uzytNazwa) {
        this.uzytNazwa = uzytNazwa;
    }

    public String getUzytPassword() {
        return uzytPassword;
    }

    public void setUzytPassword(String uzytPassword) {
        this.uzytPassword = uzytPassword;
    }

    public String getUzytBaza() {
        return uzytBaza;
    }

    public void setUzytBaza(String uzytBaza) {
        this.uzytBaza = uzytBaza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uzytId != null ? uzytId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uzytkownicy)) {
            return false;
        }
        Uzytkownicy other = (Uzytkownicy) object;
        if ((this.uzytId == null && other.uzytId != null) || (this.uzytId != null && !this.uzytId.equals(other.uzytId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Uzytkownicy[ uzytId=" + uzytId + " ]";
    }
    
}
