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
@Table(name = "imp_plany")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpPlany.findAll", query = "SELECT i FROM ImpPlany i")})
public class ImpPlany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iml_id")
    private Integer imlId;
    @Size(max = 255)
    @Column(name = "iml_nazwa_pliku")
    private String imlNazwaPliku;
    @Size(max = 255)
    @Column(name = "iml_strona")
    private String imlStrona;
    @Lob
    @Column(name = "iml_plik")
    private byte[] imlPlik;
    @Size(max = 255)
    @Column(name = "iml_week")
    private String imlWeek;

    public ImpPlany() {
    }

    public ImpPlany(Integer imlId) {
        this.imlId = imlId;
    }

    public Integer getImlId() {
        return imlId;
    }

    public void setImlId(Integer imlId) {
        this.imlId = imlId;
    }

    public String getImlNazwaPliku() {
        return imlNazwaPliku;
    }

    public void setImlNazwaPliku(String imlNazwaPliku) {
        this.imlNazwaPliku = imlNazwaPliku;
    }

    public String getImlStrona() {
        return imlStrona;
    }

    public void setImlStrona(String imlStrona) {
        this.imlStrona = imlStrona;
    }

    public byte[] getImlPlik() {
        return imlPlik;
    }

    public void setImlPlik(byte[] imlPlik) {
        this.imlPlik = imlPlik;
    }

    public String getImlWeek() {
        return imlWeek;
    }

    public void setImlWeek(String imlWeek) {
        this.imlWeek = imlWeek;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imlId != null ? imlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpPlany)) {
            return false;
        }
        ImpPlany other = (ImpPlany) object;
        if ((this.imlId == null && other.imlId != null) || (this.imlId != null && !this.imlId.equals(other.imlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ImpPlany[ imlId=" + imlId + " ]";
    }
    
}
