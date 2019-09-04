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
@Table(name = "kompon_rab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KomponRab.findAll", query = "SELECT k FROM KomponRab k")})
public class KomponRab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "krab_id")
    private Integer krabId;
    @Column(name = "krab_rab_id")
    private Integer krabRabId;
    @Size(max = 255)
    @Column(name = "krab_nazwa")
    private String krabNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "krab_procent")
    private Float krabProcent;
    @Column(name = "krab_ilosc")
    private BigDecimal krabIlosc;
    @Size(max = 5)
    @Column(name = "krab_typ")
    private String krabTyp;
    @Column(name = "krab_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date krabDataWprow;
    @Column(name = "krab_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date krabDataMod;
    @Column(name = "krab_uzyt_wprow")
    private Integer krabUzytWprow;
    @Column(name = "krab_uzyt_mod")
    private Integer krabUzytMod;
    @Column(name = "krab_slow_id")
    private Integer krabSlowId;
    @Column(name = "krab_kont_id")
    private Integer krabKontId;
    @Column(name = "krab_fakt_id")
    private Integer krabFaktId;
    @Column(name = "krab_pfak_id")
    private Integer krabPfakId;
    @Column(name = "krab_cena_po")
    private BigDecimal krabCenaPo;

    public KomponRab() {
    }

    public KomponRab(Integer krabId) {
        this.krabId = krabId;
    }

    public Integer getKrabId() {
        return krabId;
    }

    public void setKrabId(Integer krabId) {
        this.krabId = krabId;
    }

    public Integer getKrabRabId() {
        return krabRabId;
    }

    public void setKrabRabId(Integer krabRabId) {
        this.krabRabId = krabRabId;
    }

    public String getKrabNazwa() {
        return krabNazwa;
    }

    public void setKrabNazwa(String krabNazwa) {
        this.krabNazwa = krabNazwa;
    }

    public Float getKrabProcent() {
        return krabProcent;
    }

    public void setKrabProcent(Float krabProcent) {
        this.krabProcent = krabProcent;
    }

    public BigDecimal getKrabIlosc() {
        return krabIlosc;
    }

    public void setKrabIlosc(BigDecimal krabIlosc) {
        this.krabIlosc = krabIlosc;
    }

    public String getKrabTyp() {
        return krabTyp;
    }

    public void setKrabTyp(String krabTyp) {
        this.krabTyp = krabTyp;
    }

    public Date getKrabDataWprow() {
        return krabDataWprow;
    }

    public void setKrabDataWprow(Date krabDataWprow) {
        this.krabDataWprow = krabDataWprow;
    }

    public Date getKrabDataMod() {
        return krabDataMod;
    }

    public void setKrabDataMod(Date krabDataMod) {
        this.krabDataMod = krabDataMod;
    }

    public Integer getKrabUzytWprow() {
        return krabUzytWprow;
    }

    public void setKrabUzytWprow(Integer krabUzytWprow) {
        this.krabUzytWprow = krabUzytWprow;
    }

    public Integer getKrabUzytMod() {
        return krabUzytMod;
    }

    public void setKrabUzytMod(Integer krabUzytMod) {
        this.krabUzytMod = krabUzytMod;
    }

    public Integer getKrabSlowId() {
        return krabSlowId;
    }

    public void setKrabSlowId(Integer krabSlowId) {
        this.krabSlowId = krabSlowId;
    }

    public Integer getKrabKontId() {
        return krabKontId;
    }

    public void setKrabKontId(Integer krabKontId) {
        this.krabKontId = krabKontId;
    }

    public Integer getKrabFaktId() {
        return krabFaktId;
    }

    public void setKrabFaktId(Integer krabFaktId) {
        this.krabFaktId = krabFaktId;
    }

    public Integer getKrabPfakId() {
        return krabPfakId;
    }

    public void setKrabPfakId(Integer krabPfakId) {
        this.krabPfakId = krabPfakId;
    }

    public BigDecimal getKrabCenaPo() {
        return krabCenaPo;
    }

    public void setKrabCenaPo(BigDecimal krabCenaPo) {
        this.krabCenaPo = krabCenaPo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (krabId != null ? krabId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KomponRab)) {
            return false;
        }
        KomponRab other = (KomponRab) object;
        if ((this.krabId == null && other.krabId != null) || (this.krabId != null && !this.krabId.equals(other.krabId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KomponRab[ krabId=" + krabId + " ]";
    }
    
}
