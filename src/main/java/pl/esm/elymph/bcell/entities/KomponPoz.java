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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "kompon_poz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KomponPoz.findAll", query = "SELECT k FROM KomponPoz k")})
public class KomponPoz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kpoz_id")
    private Integer kpozId;
    @Column(name = "kpoz_pkom_id")
    private Integer kpozPkomId;
    @Column(name = "kpoz_slow_id")
    private Integer kpozSlowId;
    @Column(name = "kpoz_dpz_id")
    private Integer kpozDpzId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "kpoz_ilosc_pocz")
    private Float kpozIloscPocz;
    @Column(name = "kpoz_ilosc")
    private Float kpozIlosc;
    @Size(max = 2)
    @Column(name = "kpoz_status")
    private String kpozStatus;
    @Column(name = "kpoz_uzyt_wprow")
    private Integer kpozUzytWprow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kpoz_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kpozDataWprow;

    public KomponPoz() {
    }

    public KomponPoz(Integer kpozId) {
        this.kpozId = kpozId;
    }

    public KomponPoz(Integer kpozId, Date kpozDataWprow) {
        this.kpozId = kpozId;
        this.kpozDataWprow = kpozDataWprow;
    }

    public Integer getKpozId() {
        return kpozId;
    }

    public void setKpozId(Integer kpozId) {
        this.kpozId = kpozId;
    }

    public Integer getKpozPkomId() {
        return kpozPkomId;
    }

    public void setKpozPkomId(Integer kpozPkomId) {
        this.kpozPkomId = kpozPkomId;
    }

    public Integer getKpozSlowId() {
        return kpozSlowId;
    }

    public void setKpozSlowId(Integer kpozSlowId) {
        this.kpozSlowId = kpozSlowId;
    }

    public Integer getKpozDpzId() {
        return kpozDpzId;
    }

    public void setKpozDpzId(Integer kpozDpzId) {
        this.kpozDpzId = kpozDpzId;
    }

    public Float getKpozIloscPocz() {
        return kpozIloscPocz;
    }

    public void setKpozIloscPocz(Float kpozIloscPocz) {
        this.kpozIloscPocz = kpozIloscPocz;
    }

    public Float getKpozIlosc() {
        return kpozIlosc;
    }

    public void setKpozIlosc(Float kpozIlosc) {
        this.kpozIlosc = kpozIlosc;
    }

    public String getKpozStatus() {
        return kpozStatus;
    }

    public void setKpozStatus(String kpozStatus) {
        this.kpozStatus = kpozStatus;
    }

    public Integer getKpozUzytWprow() {
        return kpozUzytWprow;
    }

    public void setKpozUzytWprow(Integer kpozUzytWprow) {
        this.kpozUzytWprow = kpozUzytWprow;
    }

    public Date getKpozDataWprow() {
        return kpozDataWprow;
    }

    public void setKpozDataWprow(Date kpozDataWprow) {
        this.kpozDataWprow = kpozDataWprow;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kpozId != null ? kpozId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KomponPoz)) {
            return false;
        }
        KomponPoz other = (KomponPoz) object;
        if ((this.kpozId == null && other.kpozId != null) || (this.kpozId != null && !this.kpozId.equals(other.kpozId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KomponPoz[ kpozId=" + kpozId + " ]";
    }
    
}
