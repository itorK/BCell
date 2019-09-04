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
@Table(name = "dokumenty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dokumenty.findAll", query = "SELECT d FROM Dokumenty d")})
public class Dokumenty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dok_id")
    private Integer dokId;
    @Size(max = 255)
    @Column(name = "dok_nr")
    private String dokNr;
    @Size(max = 255)
    @Column(name = "dok_typ")
    private String dokTyp;
    @Column(name = "dok_uzyt_id")
    private Integer dokUzytId;
    @Column(name = "dok_kont_id")
    private Integer dokKontId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dok_ilosc")
    private Float dokIlosc;
    @Column(name = "dok_data_gen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dokDataGen;
    @Size(max = 2)
    @Column(name = "dok_status")
    private String dokStatus;
    @Size(max = 255)
    @Column(name = "dok_komentarz")
    private String dokKomentarz;
    @Column(name = "dok_baz_id")
    private Integer dokBazId;
    @Column(name = "dok_czy_ksieg")
    private Integer dokCzyKsieg;
    @Column(name = "dok_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dokDataWprow;
    @Column(name = "dok_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dokDataMod;
    @Column(name = "dok_uzyt_wprow")
    private Integer dokUzytWprow;
    @Column(name = "dok_uzyt_mod")
    private Integer dokUzytMod;
    @Column(name = "dok_dok_id")
    private Integer dokDokId;
    @Column(name = "dok_licznik")
    private Integer dokLicznik;

    public Dokumenty() {
    }

    public Dokumenty(Integer dokId) {
        this.dokId = dokId;
    }

    public Integer getDokId() {
        return dokId;
    }

    public void setDokId(Integer dokId) {
        this.dokId = dokId;
    }

    public String getDokNr() {
        return dokNr;
    }

    public void setDokNr(String dokNr) {
        this.dokNr = dokNr;
    }

    public String getDokTyp() {
        return dokTyp;
    }

    public void setDokTyp(String dokTyp) {
        this.dokTyp = dokTyp;
    }

    public Integer getDokUzytId() {
        return dokUzytId;
    }

    public void setDokUzytId(Integer dokUzytId) {
        this.dokUzytId = dokUzytId;
    }

    public Integer getDokKontId() {
        return dokKontId;
    }

    public void setDokKontId(Integer dokKontId) {
        this.dokKontId = dokKontId;
    }

    public Float getDokIlosc() {
        return dokIlosc;
    }

    public void setDokIlosc(Float dokIlosc) {
        this.dokIlosc = dokIlosc;
    }

    public Date getDokDataGen() {
        return dokDataGen;
    }

    public void setDokDataGen(Date dokDataGen) {
        this.dokDataGen = dokDataGen;
    }

    public String getDokStatus() {
        return dokStatus;
    }

    public void setDokStatus(String dokStatus) {
        this.dokStatus = dokStatus;
    }

    public String getDokKomentarz() {
        return dokKomentarz;
    }

    public void setDokKomentarz(String dokKomentarz) {
        this.dokKomentarz = dokKomentarz;
    }

    public Integer getDokBazId() {
        return dokBazId;
    }

    public void setDokBazId(Integer dokBazId) {
        this.dokBazId = dokBazId;
    }

    public Integer getDokCzyKsieg() {
        return dokCzyKsieg;
    }

    public void setDokCzyKsieg(Integer dokCzyKsieg) {
        this.dokCzyKsieg = dokCzyKsieg;
    }

    public Date getDokDataWprow() {
        return dokDataWprow;
    }

    public void setDokDataWprow(Date dokDataWprow) {
        this.dokDataWprow = dokDataWprow;
    }

    public Date getDokDataMod() {
        return dokDataMod;
    }

    public void setDokDataMod(Date dokDataMod) {
        this.dokDataMod = dokDataMod;
    }

    public Integer getDokUzytWprow() {
        return dokUzytWprow;
    }

    public void setDokUzytWprow(Integer dokUzytWprow) {
        this.dokUzytWprow = dokUzytWprow;
    }

    public Integer getDokUzytMod() {
        return dokUzytMod;
    }

    public void setDokUzytMod(Integer dokUzytMod) {
        this.dokUzytMod = dokUzytMod;
    }

    public Integer getDokDokId() {
        return dokDokId;
    }

    public void setDokDokId(Integer dokDokId) {
        this.dokDokId = dokDokId;
    }

    public Integer getDokLicznik() {
        return dokLicznik;
    }

    public void setDokLicznik(Integer dokLicznik) {
        this.dokLicznik = dokLicznik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dokId != null ? dokId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dokumenty)) {
            return false;
        }
        Dokumenty other = (Dokumenty) object;
        if ((this.dokId == null && other.dokId != null) || (this.dokId != null && !this.dokId.equals(other.dokId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Dokumenty[ dokId=" + dokId + " ]";
    }
    
}
