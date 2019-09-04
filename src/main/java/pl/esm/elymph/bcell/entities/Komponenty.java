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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "komponenty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Komponenty.findAll", query = "SELECT k FROM Komponenty k")})
public class Komponenty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "komp_id")
    private Integer kompId;
    @Column(name = "komp_tow_id")
    private Integer kompTowId;
    @Size(max = 255)
    @Column(name = "komp_nazwa")
    private String kompNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "komp_ilosc")
    private Float kompIlosc;
    @Size(max = 255)
    @Column(name = "komp_nazwa2")
    private String kompNazwa2;
    @Size(max = 2)
    @Column(name = "komp_status")
    private String kompStatus;
    @Column(name = "komp_data_realizacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kompDataRealizacji;
    @Basic(optional = false)
    @NotNull
    @Column(name = "komp_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kompDataWprow;
    @Basic(optional = false)
    @NotNull
    @Column(name = "komp_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kompDataMod;
    @JoinColumn(name = "komp_twzk_id", referencedColumnName = "slow_id")
    @ManyToOne
    private Slowniki kompTwzkId;

    public Komponenty() {
    }

    public Komponenty(Integer kompId) {
        this.kompId = kompId;
    }

    public Komponenty(Integer kompId, Date kompDataWprow, Date kompDataMod) {
        this.kompId = kompId;
        this.kompDataWprow = kompDataWprow;
        this.kompDataMod = kompDataMod;
    }

    public Integer getKompId() {
        return kompId;
    }

    public void setKompId(Integer kompId) {
        this.kompId = kompId;
    }

    public Integer getKompTowId() {
        return kompTowId;
    }

    public void setKompTowId(Integer kompTowId) {
        this.kompTowId = kompTowId;
    }

    public String getKompNazwa() {
        return kompNazwa;
    }

    public void setKompNazwa(String kompNazwa) {
        this.kompNazwa = kompNazwa;
    }

    public Float getKompIlosc() {
        return kompIlosc;
    }

    public void setKompIlosc(Float kompIlosc) {
        this.kompIlosc = kompIlosc;
    }

    public String getKompNazwa2() {
        return kompNazwa2;
    }

    public void setKompNazwa2(String kompNazwa2) {
        this.kompNazwa2 = kompNazwa2;
    }

    public String getKompStatus() {
        return kompStatus;
    }

    public void setKompStatus(String kompStatus) {
        this.kompStatus = kompStatus;
    }

    public Date getKompDataRealizacji() {
        return kompDataRealizacji;
    }

    public void setKompDataRealizacji(Date kompDataRealizacji) {
        this.kompDataRealizacji = kompDataRealizacji;
    }

    public Date getKompDataWprow() {
        return kompDataWprow;
    }

    public void setKompDataWprow(Date kompDataWprow) {
        this.kompDataWprow = kompDataWprow;
    }

    public Date getKompDataMod() {
        return kompDataMod;
    }

    public void setKompDataMod(Date kompDataMod) {
        this.kompDataMod = kompDataMod;
    }

    public Slowniki getKompTwzkId() {
        return kompTwzkId;
    }

    public void setKompTwzkId(Slowniki kompTwzkId) {
        this.kompTwzkId = kompTwzkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kompId != null ? kompId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Komponenty)) {
            return false;
        }
        Komponenty other = (Komponenty) object;
        if ((this.kompId == null && other.kompId != null) || (this.kompId != null && !this.kompId.equals(other.kompId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Komponenty[ kompId=" + kompId + " ]";
    }
    
}
