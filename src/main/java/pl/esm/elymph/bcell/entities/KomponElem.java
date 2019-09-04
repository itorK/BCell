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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "kompon_elem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KomponElem.findAll", query = "SELECT k FROM KomponElem k")})
public class KomponElem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kele_id")
    private Integer keleId;
    @Column(name = "kele_ele_id")
    private Integer keleEleId;
    @Column(name = "kele_uzyt_id")
    private Integer keleUzytId;
    @Column(name = "kele_dpz_id")
    private Integer keleDpzId;
    @Column(name = "kele_pfak_id")
    private Integer kelePfakId;
    @Column(name = "kele_slow_id")
    private Integer keleSlowId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "kele_ilosc")
    private Float keleIlosc;
    @Column(name = "kele_ele_id_rez")
    private Integer keleEleIdRez;
    @Column(name = "kele_pkom_id")
    private Integer kelePkomId;

    public KomponElem() {
    }

    public KomponElem(Integer keleId) {
        this.keleId = keleId;
    }

    public Integer getKeleId() {
        return keleId;
    }

    public void setKeleId(Integer keleId) {
        this.keleId = keleId;
    }

    public Integer getKeleEleId() {
        return keleEleId;
    }

    public void setKeleEleId(Integer keleEleId) {
        this.keleEleId = keleEleId;
    }

    public Integer getKeleUzytId() {
        return keleUzytId;
    }

    public void setKeleUzytId(Integer keleUzytId) {
        this.keleUzytId = keleUzytId;
    }

    public Integer getKeleDpzId() {
        return keleDpzId;
    }

    public void setKeleDpzId(Integer keleDpzId) {
        this.keleDpzId = keleDpzId;
    }

    public Integer getKelePfakId() {
        return kelePfakId;
    }

    public void setKelePfakId(Integer kelePfakId) {
        this.kelePfakId = kelePfakId;
    }

    public Integer getKeleSlowId() {
        return keleSlowId;
    }

    public void setKeleSlowId(Integer keleSlowId) {
        this.keleSlowId = keleSlowId;
    }

    public Float getKeleIlosc() {
        return keleIlosc;
    }

    public void setKeleIlosc(Float keleIlosc) {
        this.keleIlosc = keleIlosc;
    }

    public Integer getKeleEleIdRez() {
        return keleEleIdRez;
    }

    public void setKeleEleIdRez(Integer keleEleIdRez) {
        this.keleEleIdRez = keleEleIdRez;
    }

    public Integer getKelePkomId() {
        return kelePkomId;
    }

    public void setKelePkomId(Integer kelePkomId) {
        this.kelePkomId = kelePkomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keleId != null ? keleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KomponElem)) {
            return false;
        }
        KomponElem other = (KomponElem) object;
        if ((this.keleId == null && other.keleId != null) || (this.keleId != null && !this.keleId.equals(other.keleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KomponElem[ keleId=" + keleId + " ]";
    }
    
}
