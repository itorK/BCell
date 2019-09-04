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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "a_komponenty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AKomponenty.findAll", query = "SELECT a FROM AKomponenty a")})
public class AKomponenty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "a_komp_id")
    private Integer aKompId;
    @Size(max = 255)
    @Column(name = "a_komp_kal_rspr_nr")
    private String aKompKalRsprNr;
    @Size(max = 4)
    @Column(name = "a_komp_kal_mspr_nr")
    private String aKompKalMsprNr;
    @Size(max = 255)
    @Column(name = "a_komp_utworzyl")
    private String aKompUtworzyl;
    @Column(name = "a_komp_data_utworz")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aKompDataUtworz;
    @Column(name = "komp_id")
    private Integer kompId;
    @Column(name = "komp_tow_id")
    private Integer kompTowId;
    @Size(max = 255)
    @Column(name = "komp_nazwa")
    private String kompNazwa;
    @Column(name = "komp_ilosc")
    private Integer kompIlosc;
    @Size(max = 255)
    @Column(name = "komp_nazwa2")
    private String kompNazwa2;
    @Size(max = 2)
    @Column(name = "komp_status")
    private String kompStatus;
    @Column(name = "komp_data_realizacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kompDataRealizacji;
    @Column(name = "komp_twzk_id")
    private Integer kompTwzkId;

    public AKomponenty() {
    }

    public AKomponenty(Integer aKompId) {
        this.aKompId = aKompId;
    }

    public Integer getAKompId() {
        return aKompId;
    }

    public void setAKompId(Integer aKompId) {
        this.aKompId = aKompId;
    }

    public String getAKompKalRsprNr() {
        return aKompKalRsprNr;
    }

    public void setAKompKalRsprNr(String aKompKalRsprNr) {
        this.aKompKalRsprNr = aKompKalRsprNr;
    }

    public String getAKompKalMsprNr() {
        return aKompKalMsprNr;
    }

    public void setAKompKalMsprNr(String aKompKalMsprNr) {
        this.aKompKalMsprNr = aKompKalMsprNr;
    }

    public String getAKompUtworzyl() {
        return aKompUtworzyl;
    }

    public void setAKompUtworzyl(String aKompUtworzyl) {
        this.aKompUtworzyl = aKompUtworzyl;
    }

    public Date getAKompDataUtworz() {
        return aKompDataUtworz;
    }

    public void setAKompDataUtworz(Date aKompDataUtworz) {
        this.aKompDataUtworz = aKompDataUtworz;
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

    public Integer getKompIlosc() {
        return kompIlosc;
    }

    public void setKompIlosc(Integer kompIlosc) {
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

    public Integer getKompTwzkId() {
        return kompTwzkId;
    }

    public void setKompTwzkId(Integer kompTwzkId) {
        this.kompTwzkId = kompTwzkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aKompId != null ? aKompId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AKomponenty)) {
            return false;
        }
        AKomponenty other = (AKomponenty) object;
        if ((this.aKompId == null && other.aKompId != null) || (this.aKompId != null && !this.aKompId.equals(other.aKompId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.AKomponenty[ aKompId=" + aKompId + " ]";
    }
    
}
