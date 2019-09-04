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
@Table(name = "mv_kompon_poz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MvKomponPoz.findAll", query = "SELECT m FROM MvKomponPoz m")})
public class MvKomponPoz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mv_kpoz_id")
    private Integer mvKpozId;
    @Column(name = "mv_kpoz_pkom_id")
    private Integer mvKpozPkomId;
    @Column(name = "mv_kpoz_slow_id")
    private Integer mvKpozSlowId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "mv_kpoz_ilosc_pocz")
    private Float mvKpozIloscPocz;
    @Column(name = "mv_kpoz_ilosc")
    private Float mvKpozIlosc;

    public MvKomponPoz() {
    }

    public MvKomponPoz(Integer mvKpozId) {
        this.mvKpozId = mvKpozId;
    }

    public Integer getMvKpozId() {
        return mvKpozId;
    }

    public void setMvKpozId(Integer mvKpozId) {
        this.mvKpozId = mvKpozId;
    }

    public Integer getMvKpozPkomId() {
        return mvKpozPkomId;
    }

    public void setMvKpozPkomId(Integer mvKpozPkomId) {
        this.mvKpozPkomId = mvKpozPkomId;
    }

    public Integer getMvKpozSlowId() {
        return mvKpozSlowId;
    }

    public void setMvKpozSlowId(Integer mvKpozSlowId) {
        this.mvKpozSlowId = mvKpozSlowId;
    }

    public Float getMvKpozIloscPocz() {
        return mvKpozIloscPocz;
    }

    public void setMvKpozIloscPocz(Float mvKpozIloscPocz) {
        this.mvKpozIloscPocz = mvKpozIloscPocz;
    }

    public Float getMvKpozIlosc() {
        return mvKpozIlosc;
    }

    public void setMvKpozIlosc(Float mvKpozIlosc) {
        this.mvKpozIlosc = mvKpozIlosc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvKpozId != null ? mvKpozId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvKomponPoz)) {
            return false;
        }
        MvKomponPoz other = (MvKomponPoz) object;
        if ((this.mvKpozId == null && other.mvKpozId != null) || (this.mvKpozId != null && !this.mvKpozId.equals(other.mvKpozId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.MvKomponPoz[ mvKpozId=" + mvKpozId + " ]";
    }
    
}
