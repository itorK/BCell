/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "faktury")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Faktury.findAll", query = "SELECT f FROM Faktury f")})
public class Faktury implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fakt_id")
    private Integer faktId;
    @Size(max = 255)
    @Column(name = "fakt_nr_faktury")
    private String faktNrFaktury;
    @Column(name = "fakt_data_wystawienia")
    @Temporal(TemporalType.DATE)
    private Date faktDataWystawienia;
    @Size(max = 255)
    @Column(name = "fakt_opis")
    private String faktOpis;
    @Size(max = 4)
    @Column(name = "fakt_kal_mspr_nr")
    private String faktKalMsprNr;
    @Size(max = 255)
    @Column(name = "fakt_kal_rspr_nr")
    private String faktKalRsprNr;
    @Size(max = 255)
    @Column(name = "fakt_utworzyl")
    private String faktUtworzyl;
    @Column(name = "fakt_data_utworzenia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date faktDataUtworzenia;
    @Size(max = 255)
    @Column(name = "fakt_modyfikowal")
    private String faktModyfikowal;
    @Column(name = "fakt_data_modyfikacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date faktDataModyfikacji;
    @Column(name = "fakt_kont_id")
    private Integer faktKontId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fakt_kwota")
    private Float faktKwota;
    @Size(max = 10)
    @Column(name = "fakt_status")
    private String faktStatus;
    @Size(max = 5)
    @Column(name = "fakt_typ_fakt")
    private String faktTypFakt;
    @Column(name = "fakt_fakt_id")
    private Integer faktFaktId;
    @Size(max = 5)
    @Column(name = "fakt_waluta")
    private String faktWaluta;
    @Column(name = "fakt_kurs")
    private Float faktKurs;
    @Column(name = "fakt_gtow_id")
    private Integer faktGtowId;
    @Column(name = "fakt_wpa_id_trans")
    private Integer faktWpaIdTrans;
    @Column(name = "fakt_data_rozl")
    @Temporal(TemporalType.DATE)
    private Date faktDataRozl;
    @Column(name = "fakt_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date faktDataMod;
    @Column(name = "fakt_uzyt_mod")
    private Integer faktUzytMod;
    @Column(name = "fakt_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date faktDataWprow;
    @Column(name = "fakt_uzyt_wprow")
    private Integer faktUzytWprow;
    @Column(name = "fakt_licznik")
    private Integer faktLicznik;
    @Column(name = "fakt_kwota_brutto")
    private Long faktKwotaBrutto;
    @Column(name = "fakt_kwota_netto")
    private Long faktKwotaNetto;
    @Column(name = "fakt_vat")
    private Long faktVat;
    @Column(name = "fakt_termin")
    private Integer faktTermin;
    @Column(name = "fakt_data_wyst")
    @Temporal(TemporalType.DATE)
    private Date faktDataWyst;
    @Column(name = "fakt_data_sprz")
    @Temporal(TemporalType.DATE)
    private Date faktDataSprz;
    @Column(name = "fakt_typ")
    @Temporal(TemporalType.DATE)
    private Date faktTyp;
    @OneToMany(mappedBy = "ifakFaktId")
    private List<ImpFakt> impFaktList;
    @JoinColumn(name = "fakt_par_typ_plat", referencedColumnName = "wpa_id")
    @ManyToOne
    private WartParam faktParTypPlat;

    public Faktury() {
    }

    public Faktury(Integer faktId) {
        this.faktId = faktId;
    }

    public Integer getFaktId() {
        return faktId;
    }

    public void setFaktId(Integer faktId) {
        this.faktId = faktId;
    }

    public String getFaktNrFaktury() {
        return faktNrFaktury;
    }

    public void setFaktNrFaktury(String faktNrFaktury) {
        this.faktNrFaktury = faktNrFaktury;
    }

    public Date getFaktDataWystawienia() {
        return faktDataWystawienia;
    }

    public void setFaktDataWystawienia(Date faktDataWystawienia) {
        this.faktDataWystawienia = faktDataWystawienia;
    }

    public String getFaktOpis() {
        return faktOpis;
    }

    public void setFaktOpis(String faktOpis) {
        this.faktOpis = faktOpis;
    }

    public String getFaktKalMsprNr() {
        return faktKalMsprNr;
    }

    public void setFaktKalMsprNr(String faktKalMsprNr) {
        this.faktKalMsprNr = faktKalMsprNr;
    }

    public String getFaktKalRsprNr() {
        return faktKalRsprNr;
    }

    public void setFaktKalRsprNr(String faktKalRsprNr) {
        this.faktKalRsprNr = faktKalRsprNr;
    }

    public String getFaktUtworzyl() {
        return faktUtworzyl;
    }

    public void setFaktUtworzyl(String faktUtworzyl) {
        this.faktUtworzyl = faktUtworzyl;
    }

    public Date getFaktDataUtworzenia() {
        return faktDataUtworzenia;
    }

    public void setFaktDataUtworzenia(Date faktDataUtworzenia) {
        this.faktDataUtworzenia = faktDataUtworzenia;
    }

    public String getFaktModyfikowal() {
        return faktModyfikowal;
    }

    public void setFaktModyfikowal(String faktModyfikowal) {
        this.faktModyfikowal = faktModyfikowal;
    }

    public Date getFaktDataModyfikacji() {
        return faktDataModyfikacji;
    }

    public void setFaktDataModyfikacji(Date faktDataModyfikacji) {
        this.faktDataModyfikacji = faktDataModyfikacji;
    }

    public Integer getFaktKontId() {
        return faktKontId;
    }

    public void setFaktKontId(Integer faktKontId) {
        this.faktKontId = faktKontId;
    }

    public Float getFaktKwota() {
        return faktKwota;
    }

    public void setFaktKwota(Float faktKwota) {
        this.faktKwota = faktKwota;
    }

    public String getFaktStatus() {
        return faktStatus;
    }

    public void setFaktStatus(String faktStatus) {
        this.faktStatus = faktStatus;
    }

    public String getFaktTypFakt() {
        return faktTypFakt;
    }

    public void setFaktTypFakt(String faktTypFakt) {
        this.faktTypFakt = faktTypFakt;
    }

    public Integer getFaktFaktId() {
        return faktFaktId;
    }

    public void setFaktFaktId(Integer faktFaktId) {
        this.faktFaktId = faktFaktId;
    }

    public String getFaktWaluta() {
        return faktWaluta;
    }

    public void setFaktWaluta(String faktWaluta) {
        this.faktWaluta = faktWaluta;
    }

    public Float getFaktKurs() {
        return faktKurs;
    }

    public void setFaktKurs(Float faktKurs) {
        this.faktKurs = faktKurs;
    }

    public Integer getFaktGtowId() {
        return faktGtowId;
    }

    public void setFaktGtowId(Integer faktGtowId) {
        this.faktGtowId = faktGtowId;
    }

    public Integer getFaktWpaIdTrans() {
        return faktWpaIdTrans;
    }

    public void setFaktWpaIdTrans(Integer faktWpaIdTrans) {
        this.faktWpaIdTrans = faktWpaIdTrans;
    }

    public Date getFaktDataRozl() {
        return faktDataRozl;
    }

    public void setFaktDataRozl(Date faktDataRozl) {
        this.faktDataRozl = faktDataRozl;
    }

    public Date getFaktDataMod() {
        return faktDataMod;
    }

    public void setFaktDataMod(Date faktDataMod) {
        this.faktDataMod = faktDataMod;
    }

    public Integer getFaktUzytMod() {
        return faktUzytMod;
    }

    public void setFaktUzytMod(Integer faktUzytMod) {
        this.faktUzytMod = faktUzytMod;
    }

    public Date getFaktDataWprow() {
        return faktDataWprow;
    }

    public void setFaktDataWprow(Date faktDataWprow) {
        this.faktDataWprow = faktDataWprow;
    }

    public Integer getFaktUzytWprow() {
        return faktUzytWprow;
    }

    public void setFaktUzytWprow(Integer faktUzytWprow) {
        this.faktUzytWprow = faktUzytWprow;
    }

    public Integer getFaktLicznik() {
        return faktLicznik;
    }

    public void setFaktLicznik(Integer faktLicznik) {
        this.faktLicznik = faktLicznik;
    }

    public Long getFaktKwotaBrutto() {
        return faktKwotaBrutto;
    }

    public void setFaktKwotaBrutto(Long faktKwotaBrutto) {
        this.faktKwotaBrutto = faktKwotaBrutto;
    }

    public Long getFaktKwotaNetto() {
        return faktKwotaNetto;
    }

    public void setFaktKwotaNetto(Long faktKwotaNetto) {
        this.faktKwotaNetto = faktKwotaNetto;
    }

    public Long getFaktVat() {
        return faktVat;
    }

    public void setFaktVat(Long faktVat) {
        this.faktVat = faktVat;
    }

    public Integer getFaktTermin() {
        return faktTermin;
    }

    public void setFaktTermin(Integer faktTermin) {
        this.faktTermin = faktTermin;
    }

    public Date getFaktDataWyst() {
        return faktDataWyst;
    }

    public void setFaktDataWyst(Date faktDataWyst) {
        this.faktDataWyst = faktDataWyst;
    }

    public Date getFaktDataSprz() {
        return faktDataSprz;
    }

    public void setFaktDataSprz(Date faktDataSprz) {
        this.faktDataSprz = faktDataSprz;
    }

    public Date getFaktTyp() {
        return faktTyp;
    }

    public void setFaktTyp(Date faktTyp) {
        this.faktTyp = faktTyp;
    }

    @XmlTransient
    public List<ImpFakt> getImpFaktList() {
        return impFaktList;
    }

    public void setImpFaktList(List<ImpFakt> impFaktList) {
        this.impFaktList = impFaktList;
    }

    public WartParam getFaktParTypPlat() {
        return faktParTypPlat;
    }

    public void setFaktParTypPlat(WartParam faktParTypPlat) {
        this.faktParTypPlat = faktParTypPlat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faktId != null ? faktId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faktury)) {
            return false;
        }
        Faktury other = (Faktury) object;
        if ((this.faktId == null && other.faktId != null) || (this.faktId != null && !this.faktId.equals(other.faktId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Faktury[ faktId=" + faktId + " ]";
    }
    
}
