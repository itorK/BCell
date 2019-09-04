/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "stany")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stany.findAll", query = "SELECT s FROM Stany s")})
public class Stany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stan_ilosc_zak")
    private Float stanIloscZak;
    @Column(name = "stan_ilosc_zam")
    private Float stanIloscZam;
    @Column(name = "stan_suma")
    private Float stanSuma;
    @Column(name = "stan_wypr")
    private Float stanWypr;
    @Column(name = "stan_wysl")
    private Integer stanWysl;
    @Column(name = "stan_wysp")
    private Integer stanWysp;

    public Stany() {
    }

    public Stany(Integer stanId) {
        this.stanId = stanId;
    }

    public Stany(Integer stanId, String stanSlowTsloKod) {
        this.stanId = stanId;
        this.stanSlowTsloKod = stanSlowTsloKod;
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

    public Float getStanIloscZak() {
        return stanIloscZak;
    }

    public void setStanIloscZak(Float stanIloscZak) {
        this.stanIloscZak = stanIloscZak;
    }

    public Float getStanIloscZam() {
        return stanIloscZam;
    }

    public void setStanIloscZam(Float stanIloscZam) {
        this.stanIloscZam = stanIloscZam;
    }

    public Float getStanSuma() {
        return stanSuma;
    }

    public void setStanSuma(Float stanSuma) {
        this.stanSuma = stanSuma;
    }

    public Float getStanWypr() {
        return stanWypr;
    }

    public void setStanWypr(Float stanWypr) {
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
        hash += (stanId != null ? stanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stany)) {
            return false;
        }
        Stany other = (Stany) object;
        if ((this.stanId == null && other.stanId != null) || (this.stanId != null && !this.stanId.equals(other.stanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Stany[ stanId=" + stanId + " ]";
    }
    
}
