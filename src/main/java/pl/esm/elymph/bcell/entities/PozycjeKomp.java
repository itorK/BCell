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
@Table(name = "pozycje_komp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PozycjeKomp.findAll", query = "SELECT p FROM PozycjeKomp p")})
public class PozycjeKomp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkom_id")
    private Integer pkomId;
    @Size(max = 255)
    @Column(name = "pkom_nazwa")
    private String pkomNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pkom_ilosc")
    private Float pkomIlosc;
    @Column(name = "pkom_uzyt_wprow")
    private Integer pkomUzytWprow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pkom_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pkomDataWprow;

    public PozycjeKomp() {
    }

    public PozycjeKomp(Integer pkomId) {
        this.pkomId = pkomId;
    }

    public PozycjeKomp(Integer pkomId, Date pkomDataWprow) {
        this.pkomId = pkomId;
        this.pkomDataWprow = pkomDataWprow;
    }

    public Integer getPkomId() {
        return pkomId;
    }

    public void setPkomId(Integer pkomId) {
        this.pkomId = pkomId;
    }

    public String getPkomNazwa() {
        return pkomNazwa;
    }

    public void setPkomNazwa(String pkomNazwa) {
        this.pkomNazwa = pkomNazwa;
    }

    public Float getPkomIlosc() {
        return pkomIlosc;
    }

    public void setPkomIlosc(Float pkomIlosc) {
        this.pkomIlosc = pkomIlosc;
    }

    public Integer getPkomUzytWprow() {
        return pkomUzytWprow;
    }

    public void setPkomUzytWprow(Integer pkomUzytWprow) {
        this.pkomUzytWprow = pkomUzytWprow;
    }

    public Date getPkomDataWprow() {
        return pkomDataWprow;
    }

    public void setPkomDataWprow(Date pkomDataWprow) {
        this.pkomDataWprow = pkomDataWprow;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkomId != null ? pkomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PozycjeKomp)) {
            return false;
        }
        PozycjeKomp other = (PozycjeKomp) object;
        if ((this.pkomId == null && other.pkomId != null) || (this.pkomId != null && !this.pkomId.equals(other.pkomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.PozycjeKomp[ pkomId=" + pkomId + " ]";
    }
    
}
