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
@Table(name = "wzor_komp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WzorKomp.findAll", query = "SELECT w FROM WzorKomp w")})
public class WzorKomp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wzk_id")
    private Integer wzkId;
    @Column(name = "wzk_slow_id_tkrz")
    private Integer wzkSlowIdTkrz;
    @Column(name = "wzk_slow_id_twzk")
    private Integer wzkSlowIdTwzk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "wzk_ilosc")
    private Float wzkIlosc;
    @Size(max = 5)
    @Column(name = "wzk_typ_oper")
    private String wzkTypOper;

    public WzorKomp() {
    }

    public WzorKomp(Integer wzkId) {
        this.wzkId = wzkId;
    }

    public Integer getWzkId() {
        return wzkId;
    }

    public void setWzkId(Integer wzkId) {
        this.wzkId = wzkId;
    }

    public Integer getWzkSlowIdTkrz() {
        return wzkSlowIdTkrz;
    }

    public void setWzkSlowIdTkrz(Integer wzkSlowIdTkrz) {
        this.wzkSlowIdTkrz = wzkSlowIdTkrz;
    }

    public Integer getWzkSlowIdTwzk() {
        return wzkSlowIdTwzk;
    }

    public void setWzkSlowIdTwzk(Integer wzkSlowIdTwzk) {
        this.wzkSlowIdTwzk = wzkSlowIdTwzk;
    }

    public Float getWzkIlosc() {
        return wzkIlosc;
    }

    public void setWzkIlosc(Float wzkIlosc) {
        this.wzkIlosc = wzkIlosc;
    }

    public String getWzkTypOper() {
        return wzkTypOper;
    }

    public void setWzkTypOper(String wzkTypOper) {
        this.wzkTypOper = wzkTypOper;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wzkId != null ? wzkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WzorKomp)) {
            return false;
        }
        WzorKomp other = (WzorKomp) object;
        if ((this.wzkId == null && other.wzkId != null) || (this.wzkId != null && !this.wzkId.equals(other.wzkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.WzorKomp[ wzkId=" + wzkId + " ]";
    }
    
}
