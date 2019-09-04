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
@Table(name = "a_stany")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AStany.findAll", query = "SELECT a FROM AStany a")})
public class AStany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "a_stan_id")
    private Integer aStanId;
    @Size(max = 255)
    @Column(name = "a_stan_kal_rspr_nr")
    private String aStanKalRsprNr;
    @Size(max = 4)
    @Column(name = "a_stan_kal_mspr_nr")
    private String aStanKalMsprNr;
    @Size(max = 255)
    @Column(name = "a_stan_utworzyl")
    private String aStanUtworzyl;
    @Column(name = "a_stan_data_utworz")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aStanDataUtworz;
    @Column(name = "stan_id")
    private Integer stanId;
    @Size(max = 255)
    @Column(name = "stan_slow_nazwa")
    private String stanSlowNazwa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "stan_slow_tslo_kod")
    private String stanSlowTsloKod;
    @Column(name = "stan_komp_id")
    private Integer stanKompId;
    @Column(name = "stan_tow_id")
    private Integer stanTowId;
    @Column(name = "stan_ilosc_zak")
    private Integer stanIloscZak;
    @Column(name = "stan_ilosc_zam")
    private Integer stanIloscZam;
    @Column(name = "stan_suma")
    private Integer stanSuma;
    @Column(name = "stan_wypr")
    private Integer stanWypr;
    @Column(name = "stan_wysl")
    private Integer stanWysl;
    @Column(name = "stan_wysp")
    private Integer stanWysp;

    public AStany() {
    }

    public AStany(Integer aStanId) {
        this.aStanId = aStanId;
    }

    public AStany(Integer aStanId, String stanSlowTsloKod) {
        this.aStanId = aStanId;
        this.stanSlowTsloKod = stanSlowTsloKod;
    }

    public Integer getAStanId() {
        return aStanId;
    }

    public void setAStanId(Integer aStanId) {
        this.aStanId = aStanId;
    }

    public String getAStanKalRsprNr() {
        return aStanKalRsprNr;
    }

    public void setAStanKalRsprNr(String aStanKalRsprNr) {
        this.aStanKalRsprNr = aStanKalRsprNr;
    }

    public String getAStanKalMsprNr() {
        return aStanKalMsprNr;
    }

    public void setAStanKalMsprNr(String aStanKalMsprNr) {
        this.aStanKalMsprNr = aStanKalMsprNr;
    }

    public String getAStanUtworzyl() {
        return aStanUtworzyl;
    }

    public void setAStanUtworzyl(String aStanUtworzyl) {
        this.aStanUtworzyl = aStanUtworzyl;
    }

    public Date getAStanDataUtworz() {
        return aStanDataUtworz;
    }

    public void setAStanDataUtworz(Date aStanDataUtworz) {
        this.aStanDataUtworz = aStanDataUtworz;
    }

    public Integer getStanId() {
        return stanId;
    }

    public void setStanId(Integer stanId) {
        this.stanId = stanId;
    }

    public String getStanSlowNazwa() {
        return stanSlowNazwa;
    }

    public void setStanSlowNazwa(String stanSlowNazwa) {
        this.stanSlowNazwa = stanSlowNazwa;
    }

    public String getStanSlowTsloKod() {
        return stanSlowTsloKod;
    }

    public void setStanSlowTsloKod(String stanSlowTsloKod) {
        this.stanSlowTsloKod = stanSlowTsloKod;
    }

    public Integer getStanKompId() {
        return stanKompId;
    }

    public void setStanKompId(Integer stanKompId) {
        this.stanKompId = stanKompId;
    }

    public Integer getStanTowId() {
        return stanTowId;
    }

    public void setStanTowId(Integer stanTowId) {
        this.stanTowId = stanTowId;
    }

    public Integer getStanIloscZak() {
        return stanIloscZak;
    }

    public void setStanIloscZak(Integer stanIloscZak) {
        this.stanIloscZak = stanIloscZak;
    }

    public Integer getStanIloscZam() {
        return stanIloscZam;
    }

    public void setStanIloscZam(Integer stanIloscZam) {
        this.stanIloscZam = stanIloscZam;
    }

    public Integer getStanSuma() {
        return stanSuma;
    }

    public void setStanSuma(Integer stanSuma) {
        this.stanSuma = stanSuma;
    }

    public Integer getStanWypr() {
        return stanWypr;
    }

    public void setStanWypr(Integer stanWypr) {
        this.stanWypr = stanWypr;
    }

    public Integer getStanWysl() {
        return stanWysl;
    }

    public void setStanWysl(Integer stanWysl) {
        this.stanWysl = stanWysl;
    }

    public Integer getStanWysp() {
        return stanWysp;
    }

    public void setStanWysp(Integer stanWysp) {
        this.stanWysp = stanWysp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aStanId != null ? aStanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AStany)) {
            return false;
        }
        AStany other = (AStany) object;
        if ((this.aStanId == null && other.aStanId != null) || (this.aStanId != null && !this.aStanId.equals(other.aStanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.AStany[ aStanId=" + aStanId + " ]";
    }
    
}
