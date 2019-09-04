/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "dok_pow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DokPow.findAll", query = "SELECT d FROM DokPow d")})
public class DokPow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dpw_id")
    private Integer dpwId;
    @Column(name = "dpw_dok_id")
    private Integer dpwDokId;
    @Column(name = "dpw_fakt_id")
    private Integer dpwFaktId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dpw_data_utw")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dpwDataUtw;
    @Column(name = "dpw_utworzyl")
    private Integer dpwUtworzyl;

    public DokPow() {
    }

    public DokPow(Integer dpwId) {
        this.dpwId = dpwId;
    }

    public DokPow(Integer dpwId, Date dpwDataUtw) {
        this.dpwId = dpwId;
        this.dpwDataUtw = dpwDataUtw;
    }

    public Integer getDpwId() {
        return dpwId;
    }

    public void setDpwId(Integer dpwId) {
        this.dpwId = dpwId;
    }

    public Integer getDpwDokId() {
        return dpwDokId;
    }

    public void setDpwDokId(Integer dpwDokId) {
        this.dpwDokId = dpwDokId;
    }

    public Integer getDpwFaktId() {
        return dpwFaktId;
    }

    public void setDpwFaktId(Integer dpwFaktId) {
        this.dpwFaktId = dpwFaktId;
    }

    public Date getDpwDataUtw() {
        return dpwDataUtw;
    }

    public void setDpwDataUtw(Date dpwDataUtw) {
        this.dpwDataUtw = dpwDataUtw;
    }

    public Integer getDpwUtworzyl() {
        return dpwUtworzyl;
    }

    public void setDpwUtworzyl(Integer dpwUtworzyl) {
        this.dpwUtworzyl = dpwUtworzyl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dpwId != null ? dpwId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DokPow)) {
            return false;
        }
        DokPow other = (DokPow) object;
        if ((this.dpwId == null && other.dpwId != null) || (this.dpwId != null && !this.dpwId.equals(other.dpwId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.DokPow[ dpwId=" + dpwId + " ]";
    }
    
}
