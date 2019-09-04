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
@Table(name = "kont_slow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KontSlow.findAll", query = "SELECT k FROM KontSlow k")})
public class KontSlow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kslo_id")
    private Integer ksloId;
    @Column(name = "kslo_slow_id")
    private Integer ksloSlowId;
    @Column(name = "kslo_kont_id")
    private Integer ksloKontId;
    @Size(max = 10)
    @Column(name = "kslo_status")
    private String ksloStatus;

    public KontSlow() {
    }

    public KontSlow(Integer ksloId) {
        this.ksloId = ksloId;
    }

    public Integer getKsloId() {
        return ksloId;
    }

    public void setKsloId(Integer ksloId) {
        this.ksloId = ksloId;
    }

    public Integer getKsloSlowId() {
        return ksloSlowId;
    }

    public void setKsloSlowId(Integer ksloSlowId) {
        this.ksloSlowId = ksloSlowId;
    }

    public Integer getKsloKontId() {
        return ksloKontId;
    }

    public void setKsloKontId(Integer ksloKontId) {
        this.ksloKontId = ksloKontId;
    }

    public String getKsloStatus() {
        return ksloStatus;
    }

    public void setKsloStatus(String ksloStatus) {
        this.ksloStatus = ksloStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ksloId != null ? ksloId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KontSlow)) {
            return false;
        }
        KontSlow other = (KontSlow) object;
        if ((this.ksloId == null && other.ksloId != null) || (this.ksloId != null && !this.ksloId.equals(other.ksloId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KontSlow[ ksloId=" + ksloId + " ]";
    }
    
}
