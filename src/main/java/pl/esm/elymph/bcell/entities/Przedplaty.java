/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "przedplaty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Przedplaty.findAll", query = "SELECT p FROM Przedplaty p")})
public class Przedplaty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prz_id")
    private Integer przId;
    @Column(name = "prz_nr")
    private Integer przNr;
    @Size(max = 255)
    @Column(name = "prz_nr_fakt")
    private String przNrFakt;
    @Column(name = "prz_fakt_id")
    private Integer przFaktId;
    @Column(name = "prz_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date przDataWprow;
    @Column(name = "prz_uzyt_wprow")
    private Integer przUzytWprow;
    @Column(name = "prz_data_ksieg")
    @Temporal(TemporalType.DATE)
    private Date przDataKsieg;
    @Size(max = 5)
    @Column(name = "prz_status")
    private String przStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prz_kwota")
    private BigDecimal przKwota;
    @Size(max = 5)
    @Column(name = "prz_opis")
    private String przOpis;
    @Column(name = "prz_czy_zal")
    private Integer przCzyZal;

    public Przedplaty() {
    }

    public Przedplaty(Integer przId) {
        this.przId = przId;
    }

    public Integer getPrzId() {
        return przId;
    }

    public void setPrzId(Integer przId) {
        this.przId = przId;
    }

    public Integer getPrzNr() {
        return przNr;
    }

    public void setPrzNr(Integer przNr) {
        this.przNr = przNr;
    }

    public String getPrzNrFakt() {
        return przNrFakt;
    }

    public void setPrzNrFakt(String przNrFakt) {
        this.przNrFakt = przNrFakt;
    }

    public Integer getPrzFaktId() {
        return przFaktId;
    }

    public void setPrzFaktId(Integer przFaktId) {
        this.przFaktId = przFaktId;
    }

    public Date getPrzDataWprow() {
        return przDataWprow;
    }

    public void setPrzDataWprow(Date przDataWprow) {
        this.przDataWprow = przDataWprow;
    }

    public Integer getPrzUzytWprow() {
        return przUzytWprow;
    }

    public void setPrzUzytWprow(Integer przUzytWprow) {
        this.przUzytWprow = przUzytWprow;
    }

    public Date getPrzDataKsieg() {
        return przDataKsieg;
    }

    public void setPrzDataKsieg(Date przDataKsieg) {
        this.przDataKsieg = przDataKsieg;
    }

    public String getPrzStatus() {
        return przStatus;
    }

    public void setPrzStatus(String przStatus) {
        this.przStatus = przStatus;
    }

    public BigDecimal getPrzKwota() {
        return przKwota;
    }

    public void setPrzKwota(BigDecimal przKwota) {
        this.przKwota = przKwota;
    }

    public String getPrzOpis() {
        return przOpis;
    }

    public void setPrzOpis(String przOpis) {
        this.przOpis = przOpis;
    }

    public Integer getPrzCzyZal() {
        return przCzyZal;
    }

    public void setPrzCzyZal(Integer przCzyZal) {
        this.przCzyZal = przCzyZal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (przId != null ? przId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Przedplaty)) {
            return false;
        }
        Przedplaty other = (Przedplaty) object;
        if ((this.przId == null && other.przId != null) || (this.przId != null && !this.przId.equals(other.przId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Przedplaty[ przId=" + przId + " ]";
    }
    
}
