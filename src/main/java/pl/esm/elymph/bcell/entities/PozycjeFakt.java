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
@Table(name = "pozycje_fakt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PozycjeFakt.findAll", query = "SELECT p FROM PozycjeFakt p")})
public class PozycjeFakt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pfak_id")
    private Integer pfakId;
    @Column(name = "pfak_fakt_id")
    private Integer pfakFaktId;
    @Size(max = 255)
    @Column(name = "pfak_nazwa")
    private String pfakNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pfak_ilosc")
    private Float pfakIlosc;
    @Size(max = 4)
    @Column(name = "pfak_status")
    private String pfakStatus;
    @Column(name = "pfak_nr")
    private Integer pfakNr;
    @Size(max = 255)
    @Column(name = "pfak_utworzyl")
    private String pfakUtworzyl;
    @Column(name = "pfak_data_utworzenia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pfakDataUtworzenia;
    @Column(name = "pfak_dpz_id")
    private Integer pfakDpzId;
    @Column(name = "pfak_cena_1")
    private BigDecimal pfakCena1;
    @Column(name = "pfak_cena_2")
    private BigDecimal pfakCena2;
    @Size(max = 5)
    @Column(name = "pfak_slow_id")
    private String pfakSlowId;
    @Column(name = "pfak_cena_2_euro")
    private BigDecimal pfakCena2Euro;
    @Column(name = "pfak_euro")
    private BigDecimal pfakEuro;
    @Column(name = "pfak_cena_brutto_1")
    private BigDecimal pfakCenaBrutto1;
    @Column(name = "pfak_cena_netto_1")
    private BigDecimal pfakCenaNetto1;
    @Column(name = "pfak_cena_brutto_2")
    private BigDecimal pfakCenaBrutto2;
    @Column(name = "pfak_cena_netto_2")
    private BigDecimal pfakCenaNetto2;
    @Size(max = 255)
    @Column(name = "pfak_pkwiu_nr")
    private String pfakPkwiuNr;
    @Column(name = "pfak_czy_stan")
    private Integer pfakCzyStan;

    public PozycjeFakt() {
    }

    public PozycjeFakt(Integer pfakId) {
        this.pfakId = pfakId;
    }

    public Integer getPfakId() {
        return pfakId;
    }

    public void setPfakId(Integer pfakId) {
        this.pfakId = pfakId;
    }

    public Integer getPfakFaktId() {
        return pfakFaktId;
    }

    public void setPfakFaktId(Integer pfakFaktId) {
        this.pfakFaktId = pfakFaktId;
    }

    public String getPfakNazwa() {
        return pfakNazwa;
    }

    public void setPfakNazwa(String pfakNazwa) {
        this.pfakNazwa = pfakNazwa;
    }

    public Float getPfakIlosc() {
        return pfakIlosc;
    }

    public void setPfakIlosc(Float pfakIlosc) {
        this.pfakIlosc = pfakIlosc;
    }

    public String getPfakStatus() {
        return pfakStatus;
    }

    public void setPfakStatus(String pfakStatus) {
        this.pfakStatus = pfakStatus;
    }

    public Integer getPfakNr() {
        return pfakNr;
    }

    public void setPfakNr(Integer pfakNr) {
        this.pfakNr = pfakNr;
    }

    public String getPfakUtworzyl() {
        return pfakUtworzyl;
    }

    public void setPfakUtworzyl(String pfakUtworzyl) {
        this.pfakUtworzyl = pfakUtworzyl;
    }

    public Date getPfakDataUtworzenia() {
        return pfakDataUtworzenia;
    }

    public void setPfakDataUtworzenia(Date pfakDataUtworzenia) {
        this.pfakDataUtworzenia = pfakDataUtworzenia;
    }

    public Integer getPfakDpzId() {
        return pfakDpzId;
    }

    public void setPfakDpzId(Integer pfakDpzId) {
        this.pfakDpzId = pfakDpzId;
    }

    public BigDecimal getPfakCena1() {
        return pfakCena1;
    }

    public void setPfakCena1(BigDecimal pfakCena1) {
        this.pfakCena1 = pfakCena1;
    }

    public BigDecimal getPfakCena2() {
        return pfakCena2;
    }

    public void setPfakCena2(BigDecimal pfakCena2) {
        this.pfakCena2 = pfakCena2;
    }

    public String getPfakSlowId() {
        return pfakSlowId;
    }

    public void setPfakSlowId(String pfakSlowId) {
        this.pfakSlowId = pfakSlowId;
    }

    public BigDecimal getPfakCena2Euro() {
        return pfakCena2Euro;
    }

    public void setPfakCena2Euro(BigDecimal pfakCena2Euro) {
        this.pfakCena2Euro = pfakCena2Euro;
    }

    public BigDecimal getPfakEuro() {
        return pfakEuro;
    }

    public void setPfakEuro(BigDecimal pfakEuro) {
        this.pfakEuro = pfakEuro;
    }

    public BigDecimal getPfakCenaBrutto1() {
        return pfakCenaBrutto1;
    }

    public void setPfakCenaBrutto1(BigDecimal pfakCenaBrutto1) {
        this.pfakCenaBrutto1 = pfakCenaBrutto1;
    }

    public BigDecimal getPfakCenaNetto1() {
        return pfakCenaNetto1;
    }

    public void setPfakCenaNetto1(BigDecimal pfakCenaNetto1) {
        this.pfakCenaNetto1 = pfakCenaNetto1;
    }

    public BigDecimal getPfakCenaBrutto2() {
        return pfakCenaBrutto2;
    }

    public void setPfakCenaBrutto2(BigDecimal pfakCenaBrutto2) {
        this.pfakCenaBrutto2 = pfakCenaBrutto2;
    }

    public BigDecimal getPfakCenaNetto2() {
        return pfakCenaNetto2;
    }

    public void setPfakCenaNetto2(BigDecimal pfakCenaNetto2) {
        this.pfakCenaNetto2 = pfakCenaNetto2;
    }

    public String getPfakPkwiuNr() {
        return pfakPkwiuNr;
    }

    public void setPfakPkwiuNr(String pfakPkwiuNr) {
        this.pfakPkwiuNr = pfakPkwiuNr;
    }

    public Integer getPfakCzyStan() {
        return pfakCzyStan;
    }

    public void setPfakCzyStan(Integer pfakCzyStan) {
        this.pfakCzyStan = pfakCzyStan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pfakId != null ? pfakId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PozycjeFakt)) {
            return false;
        }
        PozycjeFakt other = (PozycjeFakt) object;
        if ((this.pfakId == null && other.pfakId != null) || (this.pfakId != null && !this.pfakId.equals(other.pfakId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.PozycjeFakt[ pfakId=" + pfakId + " ]";
    }
    
}
