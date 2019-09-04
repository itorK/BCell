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
@Table(name = "kontrahenci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kontrahenci.findAll", query = "SELECT k FROM Kontrahenci k")})
public class Kontrahenci implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kont_id")
    private Integer kontId;
    @Size(max = 255)
    @Column(name = "kont_nazwa")
    private String kontNazwa;
    @Size(max = 255)
    @Column(name = "kont_ulica")
    private String kontUlica;
    @Size(max = 100)
    @Column(name = "kont_nr_domu")
    private String kontNrDomu;
    @Size(max = 255)
    @Column(name = "kont_kod_poczt")
    private String kontKodPoczt;
    @Size(max = 255)
    @Column(name = "kont_poczta")
    private String kontPoczta;
    @Size(max = 255)
    @Column(name = "kont_nip")
    private String kontNip;
    @Column(name = "kont_uzyt_wprow")
    private Integer kontUzytWprow;
    @Column(name = "kont_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kontDataWprow;
    @Column(name = "kont_baz_id")
    private Integer kontBazId;
    @Column(name = "kont_czy_komp")
    private Integer kontCzyKomp;
    @Size(max = 255)
    @Column(name = "kont_telefon")
    private String kontTelefon;
    @Size(max = 5)
    @Column(name = "kont_rodzaj")
    private String kontRodzaj;
    @Size(max = 255)
    @Column(name = "kont_email")
    private String kontEmail;
    @Size(max = 5)
    @Column(name = "kont_typ")
    private String kontTyp;
    @Column(name = "kont_termin_plat")
    private Integer kontTerminPlat;
    @Column(name = "kont_gkont_id")
    private Integer kontGkontId;
    @Size(max = 255)
    @Column(name = "kont_skrot")
    private String kontSkrot;

    public Kontrahenci() {
    }

    public Kontrahenci(Integer kontId) {
        this.kontId = kontId;
    }

    public Integer getKontId() {
        return kontId;
    }

    public void setKontId(Integer kontId) {
        this.kontId = kontId;
    }

    public String getKontNazwa() {
        return kontNazwa;
    }

    public void setKontNazwa(String kontNazwa) {
        this.kontNazwa = kontNazwa;
    }

    public String getKontUlica() {
        return kontUlica;
    }

    public void setKontUlica(String kontUlica) {
        this.kontUlica = kontUlica;
    }

    public String getKontNrDomu() {
        return kontNrDomu;
    }

    public void setKontNrDomu(String kontNrDomu) {
        this.kontNrDomu = kontNrDomu;
    }

    public String getKontKodPoczt() {
        return kontKodPoczt;
    }

    public void setKontKodPoczt(String kontKodPoczt) {
        this.kontKodPoczt = kontKodPoczt;
    }

    public String getKontPoczta() {
        return kontPoczta;
    }

    public void setKontPoczta(String kontPoczta) {
        this.kontPoczta = kontPoczta;
    }

    public String getKontNip() {
        return kontNip;
    }

    public void setKontNip(String kontNip) {
        this.kontNip = kontNip;
    }

    public Integer getKontUzytWprow() {
        return kontUzytWprow;
    }

    public void setKontUzytWprow(Integer kontUzytWprow) {
        this.kontUzytWprow = kontUzytWprow;
    }

    public Date getKontDataWprow() {
        return kontDataWprow;
    }

    public void setKontDataWprow(Date kontDataWprow) {
        this.kontDataWprow = kontDataWprow;
    }

    public Integer getKontBazId() {
        return kontBazId;
    }

    public void setKontBazId(Integer kontBazId) {
        this.kontBazId = kontBazId;
    }

    public Integer getKontCzyKomp() {
        return kontCzyKomp;
    }

    public void setKontCzyKomp(Integer kontCzyKomp) {
        this.kontCzyKomp = kontCzyKomp;
    }

    public String getKontTelefon() {
        return kontTelefon;
    }

    public void setKontTelefon(String kontTelefon) {
        this.kontTelefon = kontTelefon;
    }

    public String getKontRodzaj() {
        return kontRodzaj;
    }

    public void setKontRodzaj(String kontRodzaj) {
        this.kontRodzaj = kontRodzaj;
    }

    public String getKontEmail() {
        return kontEmail;
    }

    public void setKontEmail(String kontEmail) {
        this.kontEmail = kontEmail;
    }

    public String getKontTyp() {
        return kontTyp;
    }

    public void setKontTyp(String kontTyp) {
        this.kontTyp = kontTyp;
    }

    public Integer getKontTerminPlat() {
        return kontTerminPlat;
    }

    public void setKontTerminPlat(Integer kontTerminPlat) {
        this.kontTerminPlat = kontTerminPlat;
    }

    public Integer getKontGkontId() {
        return kontGkontId;
    }

    public void setKontGkontId(Integer kontGkontId) {
        this.kontGkontId = kontGkontId;
    }

    public String getKontSkrot() {
        return kontSkrot;
    }

    public void setKontSkrot(String kontSkrot) {
        this.kontSkrot = kontSkrot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kontId != null ? kontId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kontrahenci)) {
            return false;
        }
        Kontrahenci other = (Kontrahenci) object;
        if ((this.kontId == null && other.kontId != null) || (this.kontId != null && !this.kontId.equals(other.kontId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Kontrahenci[ kontId=" + kontId + " ]";
    }
    
}
