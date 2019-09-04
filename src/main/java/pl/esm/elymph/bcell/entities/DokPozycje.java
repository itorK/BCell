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
@Table(name = "dok_pozycje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DokPozycje.findAll", query = "SELECT d FROM DokPozycje d")})
public class DokPozycje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dpz_id")
    private Integer dpzId;
    @Column(name = "dpz_dok_id")
    private Integer dpzDokId;
    @Column(name = "dpz_slow_id")
    private Integer dpzSlowId;
    @Column(name = "dpz_kzak_id")
    private Integer dpzKzakId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dpz_ilosc")
    private Float dpzIlosc;
    @Column(name = "dpz_tow_id")
    private Integer dpzTowId;
    @Size(max = 5)
    @Column(name = "dpz_typ_oper")
    private String dpzTypOper;
    @Column(name = "dpz_cena_1")
    private Float dpzCena1;
    @Column(name = "dpz_cena_2")
    private Float dpzCena2;
    @Column(name = "dpz_jedn_wpa_id")
    private Integer dpzJednWpaId;
    @Size(max = 255)
    @Column(name = "dpz_komentarz")
    private String dpzKomentarz;
    @Column(name = "dpz_data_zatw")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dpzDataZatw;
    @Column(name = "dpz_ele_id")
    private Integer dpzEleId;
    @Size(max = 5)
    @Column(name = "dpz_status")
    private String dpzStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dpz_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dpzDataWprow;
    @Column(name = "dpz_uzyt_wprow")
    private Integer dpzUzytWprow;
    @Column(name = "dpz_nr")
    private Integer dpzNr;
    @Size(max = 255)
    @Column(name = "dpz_wlasny")
    private String dpzWlasny;

    public DokPozycje() {
    }

    public DokPozycje(Integer dpzId) {
        this.dpzId = dpzId;
    }

    public DokPozycje(Integer dpzId, Date dpzDataWprow) {
        this.dpzId = dpzId;
        this.dpzDataWprow = dpzDataWprow;
    }

    public Integer getDpzId() {
        return dpzId;
    }

    public void setDpzId(Integer dpzId) {
        this.dpzId = dpzId;
    }

    public Integer getDpzDokId() {
        return dpzDokId;
    }

    public void setDpzDokId(Integer dpzDokId) {
        this.dpzDokId = dpzDokId;
    }

    public Integer getDpzSlowId() {
        return dpzSlowId;
    }

    public void setDpzSlowId(Integer dpzSlowId) {
        this.dpzSlowId = dpzSlowId;
    }

    public Integer getDpzKzakId() {
        return dpzKzakId;
    }

    public void setDpzKzakId(Integer dpzKzakId) {
        this.dpzKzakId = dpzKzakId;
    }

    public Float getDpzIlosc() {
        return dpzIlosc;
    }

    public void setDpzIlosc(Float dpzIlosc) {
        this.dpzIlosc = dpzIlosc;
    }

    public Integer getDpzTowId() {
        return dpzTowId;
    }

    public void setDpzTowId(Integer dpzTowId) {
        this.dpzTowId = dpzTowId;
    }

    public String getDpzTypOper() {
        return dpzTypOper;
    }

    public void setDpzTypOper(String dpzTypOper) {
        this.dpzTypOper = dpzTypOper;
    }

    public Float getDpzCena1() {
        return dpzCena1;
    }

    public void setDpzCena1(Float dpzCena1) {
        this.dpzCena1 = dpzCena1;
    }

    public Float getDpzCena2() {
        return dpzCena2;
    }

    public void setDpzCena2(Float dpzCena2) {
        this.dpzCena2 = dpzCena2;
    }

    public Integer getDpzJednWpaId() {
        return dpzJednWpaId;
    }

    public void setDpzJednWpaId(Integer dpzJednWpaId) {
        this.dpzJednWpaId = dpzJednWpaId;
    }

    public String getDpzKomentarz() {
        return dpzKomentarz;
    }

    public void setDpzKomentarz(String dpzKomentarz) {
        this.dpzKomentarz = dpzKomentarz;
    }

    public Date getDpzDataZatw() {
        return dpzDataZatw;
    }

    public void setDpzDataZatw(Date dpzDataZatw) {
        this.dpzDataZatw = dpzDataZatw;
    }

    public Integer getDpzEleId() {
        return dpzEleId;
    }

    public void setDpzEleId(Integer dpzEleId) {
        this.dpzEleId = dpzEleId;
    }

    public String getDpzStatus() {
        return dpzStatus;
    }

    public void setDpzStatus(String dpzStatus) {
        this.dpzStatus = dpzStatus;
    }

    public Date getDpzDataWprow() {
        return dpzDataWprow;
    }

    public void setDpzDataWprow(Date dpzDataWprow) {
        this.dpzDataWprow = dpzDataWprow;
    }

    public Integer getDpzUzytWprow() {
        return dpzUzytWprow;
    }

    public void setDpzUzytWprow(Integer dpzUzytWprow) {
        this.dpzUzytWprow = dpzUzytWprow;
    }

    public Integer getDpzNr() {
        return dpzNr;
    }

    public void setDpzNr(Integer dpzNr) {
        this.dpzNr = dpzNr;
    }

    public String getDpzWlasny() {
        return dpzWlasny;
    }

    public void setDpzWlasny(String dpzWlasny) {
        this.dpzWlasny = dpzWlasny;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dpzId != null ? dpzId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DokPozycje)) {
            return false;
        }
        DokPozycje other = (DokPozycje) object;
        if ((this.dpzId == null && other.dpzId != null) || (this.dpzId != null && !this.dpzId.equals(other.dpzId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.DokPozycje[ dpzId=" + dpzId + " ]";
    }
    
}
