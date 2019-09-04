/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "kompon_zak")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KomponZak.findAll", query = "SELECT k FROM KomponZak k")})
public class KomponZak implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kzak_id")
    private Integer kzakId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kzak_slow_id_twzk")
    private int kzakSlowIdTwzk;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "kzak_ilosc_zak")
    private Float kzakIloscZak;
    @Column(name = "kzak_data_zak")
    @Temporal(TemporalType.DATE)
    private Date kzakDataZak;
    @Column(name = "kzak_ilosc_stan")
    private Integer kzakIloscStan;
    @Size(max = 255)
    @Column(name = "kzak_utworzyl")
    private String kzakUtworzyl;
    @Column(name = "kzak_data_utworzenia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kzakDataUtworzenia;
    @Size(max = 255)
    @Column(name = "kzak_modyfikowal")
    private String kzakModyfikowal;
    @Column(name = "kzak_data_modyfikacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kzakDataModyfikacji;
    @Size(max = 255)
    @Column(name = "kzak_rspr_nr")
    private String kzakRsprNr;
    @Size(max = 4)
    @Column(name = "kzak_mspr_nr")
    private String kzakMsprNr;
    @Size(max = 255)
    @Column(name = "kzak_prac_nazwa")
    private String kzakPracNazwa;
    @Size(max = 255)
    @Column(name = "kzak_komentarz")
    private String kzakKomentarz;
    @Column(name = "kzak_opt_id")
    private Integer kzakOptId;
    @Size(max = 4)
    @Column(name = "kzak_status")
    private String kzakStatus;
    @Column(name = "kzak_wartosc_1")
    private BigDecimal kzakWartosc1;
    @Column(name = "kzak_wartosc_2")
    private BigDecimal kzakWartosc2;
    @Column(name = "kzak_dpz_id")
    private Integer kzakDpzId;
    @Column(name = "kzak_pfak_id")
    private Integer kzakPfakId;
    @OneToMany(mappedBy = "koceKzakId")
    private List<KomponCena> komponCenaList;

    public KomponZak() {
    }

    public KomponZak(Integer kzakId) {
        this.kzakId = kzakId;
    }

    public KomponZak(Integer kzakId, int kzakSlowIdTwzk) {
        this.kzakId = kzakId;
        this.kzakSlowIdTwzk = kzakSlowIdTwzk;
    }

    public Integer getKzakId() {
        return kzakId;
    }

    public void setKzakId(Integer kzakId) {
        this.kzakId = kzakId;
    }

    public int getKzakSlowIdTwzk() {
        return kzakSlowIdTwzk;
    }

    public void setKzakSlowIdTwzk(int kzakSlowIdTwzk) {
        this.kzakSlowIdTwzk = kzakSlowIdTwzk;
    }

    public Float getKzakIloscZak() {
        return kzakIloscZak;
    }

    public void setKzakIloscZak(Float kzakIloscZak) {
        this.kzakIloscZak = kzakIloscZak;
    }

    public Date getKzakDataZak() {
        return kzakDataZak;
    }

    public void setKzakDataZak(Date kzakDataZak) {
        this.kzakDataZak = kzakDataZak;
    }

    public Integer getKzakIloscStan() {
        return kzakIloscStan;
    }

    public void setKzakIloscStan(Integer kzakIloscStan) {
        this.kzakIloscStan = kzakIloscStan;
    }

    public String getKzakUtworzyl() {
        return kzakUtworzyl;
    }

    public void setKzakUtworzyl(String kzakUtworzyl) {
        this.kzakUtworzyl = kzakUtworzyl;
    }

    public Date getKzakDataUtworzenia() {
        return kzakDataUtworzenia;
    }

    public void setKzakDataUtworzenia(Date kzakDataUtworzenia) {
        this.kzakDataUtworzenia = kzakDataUtworzenia;
    }

    public String getKzakModyfikowal() {
        return kzakModyfikowal;
    }

    public void setKzakModyfikowal(String kzakModyfikowal) {
        this.kzakModyfikowal = kzakModyfikowal;
    }

    public Date getKzakDataModyfikacji() {
        return kzakDataModyfikacji;
    }

    public void setKzakDataModyfikacji(Date kzakDataModyfikacji) {
        this.kzakDataModyfikacji = kzakDataModyfikacji;
    }

    public String getKzakRsprNr() {
        return kzakRsprNr;
    }

    public void setKzakRsprNr(String kzakRsprNr) {
        this.kzakRsprNr = kzakRsprNr;
    }

    public String getKzakMsprNr() {
        return kzakMsprNr;
    }

    public void setKzakMsprNr(String kzakMsprNr) {
        this.kzakMsprNr = kzakMsprNr;
    }

    public String getKzakPracNazwa() {
        return kzakPracNazwa;
    }

    public void setKzakPracNazwa(String kzakPracNazwa) {
        this.kzakPracNazwa = kzakPracNazwa;
    }

    public String getKzakKomentarz() {
        return kzakKomentarz;
    }

    public void setKzakKomentarz(String kzakKomentarz) {
        this.kzakKomentarz = kzakKomentarz;
    }

    public Integer getKzakOptId() {
        return kzakOptId;
    }

    public void setKzakOptId(Integer kzakOptId) {
        this.kzakOptId = kzakOptId;
    }

    public String getKzakStatus() {
        return kzakStatus;
    }

    public void setKzakStatus(String kzakStatus) {
        this.kzakStatus = kzakStatus;
    }

    public BigDecimal getKzakWartosc1() {
        return kzakWartosc1;
    }

    public void setKzakWartosc1(BigDecimal kzakWartosc1) {
        this.kzakWartosc1 = kzakWartosc1;
    }

    public BigDecimal getKzakWartosc2() {
        return kzakWartosc2;
    }

    public void setKzakWartosc2(BigDecimal kzakWartosc2) {
        this.kzakWartosc2 = kzakWartosc2;
    }

    public Integer getKzakDpzId() {
        return kzakDpzId;
    }

    public void setKzakDpzId(Integer kzakDpzId) {
        this.kzakDpzId = kzakDpzId;
    }

    public Integer getKzakPfakId() {
        return kzakPfakId;
    }

    public void setKzakPfakId(Integer kzakPfakId) {
        this.kzakPfakId = kzakPfakId;
    }

    @XmlTransient
    public List<KomponCena> getKomponCenaList() {
        return komponCenaList;
    }

    public void setKomponCenaList(List<KomponCena> komponCenaList) {
        this.komponCenaList = komponCenaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kzakId != null ? kzakId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KomponZak)) {
            return false;
        }
        KomponZak other = (KomponZak) object;
        if ((this.kzakId == null && other.kzakId != null) || (this.kzakId != null && !this.kzakId.equals(other.kzakId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KomponZak[ kzakId=" + kzakId + " ]";
    }
    
}
