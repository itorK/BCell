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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "teksty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teksty.findAll", query = "SELECT t FROM Teksty t")})
public class Teksty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tek_id")
    private Integer tekId;
    @Lob
    @Column(name = "tek_tresc")
    private byte[] tekTresc;

    public Teksty() {
    }

    public Teksty(Integer tekId) {
        this.tekId = tekId;
    }

    public Integer getTekId() {
        return tekId;
    }

    public void setTekId(Integer tekId) {
        this.tekId = tekId;
    }

    public byte[] getTekTresc() {
        return tekTresc;
    }

    public void setTekTresc(byte[] tekTresc) {
        this.tekTresc = tekTresc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tekId != null ? tekId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teksty)) {
            return false;
        }
        Teksty other = (Teksty) object;
        if ((this.tekId == null && other.tekId != null) || (this.tekId != null && !this.tekId.equals(other.tekId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Teksty[ tekId=" + tekId + " ]";
    }
    
}
