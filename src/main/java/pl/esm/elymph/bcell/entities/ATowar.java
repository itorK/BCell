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
@Table(name = "a_towar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ATowar.findAll", query = "SELECT a FROM ATowar a")})
public class ATowar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "a_tow_id")
    private Integer aTowId;
    @Size(max = 255)
    @Column(name = "a_tow_utworzyl")
    private String aTowUtworzyl;
    @Column(name = "a_tow_data_utworz")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aTowDataUtworz;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tow_id")
    private int towId;
    @Column(name = "tow_slow_id_tkrz")
    private Integer towSlowIdTkrz;
    @Size(max = 255)
    @Column(name = "tow_nazwa")
    private String towNazwa;
    @Column(name = "tow_zam")
    private Integer towZam;
    @Column(name = "tow_zak")
    private Integer towZak;
    @Column(name = "tow_suma")
    private Integer towSuma;
    @Column(name = "tow_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date towDataWprow;
    @Size(max = 255)
    @Column(name = "tow_uzyt_wprow")
    private String towUzytWprow;
    @Column(name = "tow_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date towDataMod;
    @Size(max = 255)
    @Column(name = "tow_uzyt_mod")
    private String towUzytMod;
    @Column(name = "tow_nr_wersji")
    private Integer towNrWersji;
    @Column(name = "tow_tow_id")
    private Integer towTowId;
    @Column(name = "tow_data_zam")
    @Temporal(TemporalType.DATE)
    private Date towDataZam;
    @Column(name = "tow_data_zak")
    @Temporal(TemporalType.DATE)
    private Date towDataZak;
    @Size(max = 2)
    @Column(name = "tow_status")
    private String towStatus;
    @Column(name = "tow_data_realizacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date towDataRealizacji;
    @Size(max = 255)
    @Column(name = "tow_kal_rspr_nr")
    private String towKalRsprNr;
    @Size(max = 4)
    @Column(name = "tow_kal_mspr_nr")
    private String towKalMsprNr;
    @Column(name = "tow_fakt_id")
    private Integer towFaktId;
    @Column(name = "tow_gtow_id")
    private Integer towGtowId;

    public ATowar() {
    }

    public ATowar(Integer aTowId) {
        this.aTowId = aTowId;
    }

    public ATowar(Integer aTowId, int towId) {
        this.aTowId = aTowId;
        this.towId = towId;
    }

    public Integer getATowId() {
        return aTowId;
    }

    public void setATowId(Integer aTowId) {
        this.aTowId = aTowId;
    }

    public String getATowUtworzyl() {
        return aTowUtworzyl;
    }

    public void setATowUtworzyl(String aTowUtworzyl) {
        this.aTowUtworzyl = aTowUtworzyl;
    }

    public Date getATowDataUtworz() {
        return aTowDataUtworz;
    }

    public void setATowDataUtworz(Date aTowDataUtworz) {
        this.aTowDataUtworz = aTowDataUtworz;
    }

    public int getTowId() {
        return towId;
    }

    public void setTowId(int towId) {
        this.towId = towId;
    }

    public Integer getTowSlowIdTkrz() {
        return towSlowIdTkrz;
    }

    public void setTowSlowIdTkrz(Integer towSlowIdTkrz) {
        this.towSlowIdTkrz = towSlowIdTkrz;
    }

    public String getTowNazwa() {
        return towNazwa;
    }

    public void setTowNazwa(String towNazwa) {
        this.towNazwa = towNazwa;
    }

    public Integer getTowZam() {
        return towZam;
    }

    public void setTowZam(Integer towZam) {
        this.towZam = towZam;
    }

    public Integer getTowZak() {
        return towZak;
    }

    public void setTowZak(Integer towZak) {
        this.towZak = towZak;
    }

    public Integer getTowSuma() {
        return towSuma;
    }

    public void setTowSuma(Integer towSuma) {
        this.towSuma = towSuma;
    }

    public Date getTowDataWprow() {
        return towDataWprow;
    }

    public void setTowDataWprow(Date towDataWprow) {
        this.towDataWprow = towDataWprow;
    }

    public String getTowUzytWprow() {
        return towUzytWprow;
    }

    public void setTowUzytWprow(String towUzytWprow) {
        this.towUzytWprow = towUzytWprow;
    }

    public Date getTowDataMod() {
        return towDataMod;
    }

    public void setTowDataMod(Date towDataMod) {
        this.towDataMod = towDataMod;
    }

    public String getTowUzytMod() {
        return towUzytMod;
    }

    public void setTowUzytMod(String towUzytMod) {
        this.towUzytMod = towUzytMod;
    }

    public Integer getTowNrWersji() {
        return towNrWersji;
    }

    public void setTowNrWersji(Integer towNrWersji) {
        this.towNrWersji = towNrWersji;
    }

    public Integer getTowTowId() {
        return towTowId;
    }

    public void setTowTowId(Integer towTowId) {
        this.towTowId = towTowId;
    }

    public Date getTowDataZam() {
        return towDataZam;
    }

    public void setTowDataZam(Date towDataZam) {
        this.towDataZam = towDataZam;
    }

    public Date getTowDataZak() {
        return towDataZak;
    }

    public void setTowDataZak(Date towDataZak) {
        this.towDataZak = towDataZak;
    }

    public String getTowStatus() {
        return towStatus;
    }

    public void setTowStatus(String towStatus) {
        this.towStatus = towStatus;
    }

    public Date getTowDataRealizacji() {
        return towDataRealizacji;
    }

    public void setTowDataRealizacji(Date towDataRealizacji) {
        this.towDataRealizacji = towDataRealizacji;
    }

    public String getTowKalRsprNr() {
        return towKalRsprNr;
    }

    public void setTowKalRsprNr(String towKalRsprNr) {
        this.towKalRsprNr = towKalRsprNr;
    }

    public String getTowKalMsprNr() {
        return towKalMsprNr;
    }

    public void setTowKalMsprNr(String towKalMsprNr) {
        this.towKalMsprNr = towKalMsprNr;
    }

    public Integer getTowFaktId() {
        return towFaktId;
    }

    public void setTowFaktId(Integer towFaktId) {
        this.towFaktId = towFaktId;
    }

    public Integer getTowGtowId() {
        return towGtowId;
    }

    public void setTowGtowId(Integer towGtowId) {
        this.towGtowId = towGtowId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aTowId != null ? aTowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ATowar)) {
            return false;
        }
        ATowar other = (ATowar) object;
        if ((this.aTowId == null && other.aTowId != null) || (this.aTowId != null && !this.aTowId.equals(other.aTowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ATowar[ aTowId=" + aTowId + " ]";
    }
    
}
