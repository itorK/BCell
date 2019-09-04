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
@Table(name = "wzor_elem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WzorElem.findAll", query = "SELECT w FROM WzorElem w")})
public class WzorElem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wze_id")
    private Integer wzeId;
    @Column(name = "wze_slow_id_twzk")
    private Integer wzeSlowIdTwzk;
    @Column(name = "wze_slow_id_twze")
    private Integer wzeSlowIdTwze;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "wze_ilosc")
    private Float wzeIlosc;

    public WzorElem() {
    }

    public WzorElem(Integer wzeId) {
        this.wzeId = wzeId;
    }

    public Integer getWzeId() {
        return wzeId;
    }

    public void setWzeId(Integer wzeId) {
        this.wzeId = wzeId;
    }

    public Integer getWzeSlowIdTwzk() {
        return wzeSlowIdTwzk;
    }

    public void setWzeSlowIdTwzk(Integer wzeSlowIdTwzk) {
        this.wzeSlowIdTwzk = wzeSlowIdTwzk;
    }

    public Integer getWzeSlowIdTwze() {
        return wzeSlowIdTwze;
    }

    public void setWzeSlowIdTwze(Integer wzeSlowIdTwze) {
        this.wzeSlowIdTwze = wzeSlowIdTwze;
    }

    public Float getWzeIlosc() {
        return wzeIlosc;
    }

    public void setWzeIlosc(Float wzeIlosc) {
        this.wzeIlosc = wzeIlosc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wzeId != null ? wzeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WzorElem)) {
            return false;
        }
        WzorElem other = (WzorElem) object;
        if ((this.wzeId == null && other.wzeId != null) || (this.wzeId != null && !this.wzeId.equals(other.wzeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.WzorElem[ wzeId=" + wzeId + " ]";
    }
    
}
