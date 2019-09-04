/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "slowniki")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Slowniki.findAll", query = "SELECT s FROM Slowniki s")})
public class Slowniki implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "slow_id")
    private Integer slowId;
    @Size(max = 4)
    @Column(name = "slow_tslo_kod")
    private String slowTsloKod;
    @Size(max = 255)
    @Column(name = "slow_nazwa")
    private String slowNazwa;
    @Size(max = 255)
    @Column(name = "slow_nazwa2")
    private String slowNazwa2;
    @Size(max = 255)
    @Column(name = "slow_widok")
    private String slowWidok;
    @Size(max = 2)
    @Column(name = "slow_status")
    private String slowStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "slow_cena_1")
    private BigDecimal slowCena1;
    @Column(name = "slow_cena_2")
    private BigDecimal slowCena2;
    @Column(name = "slow_grupa_wpa_id")
    private Integer slowGrupaWpaId;
    @Column(name = "slow_wpa_id_jedn")
    private Integer slowWpaIdJedn;
    @Size(max = 255)
    @Column(name = "slow_zdjecie")
    private String slowZdjecie;
    @Column(name = "slow_dodatek")
    private Integer slowDodatek;
    @Size(max = 255)
    @Column(name = "slow_rodzaj")
    private String slowRodzaj;
    @Size(max = 255)
    @Column(name = "slow_kolor")
    private String slowKolor;
    @Size(max = 255)
    @Column(name = "slow_wielkosc")
    private String slowWielkosc;
    @Size(max = 255)
    @Column(name = "slow_rozmiar")
    private String slowRozmiar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "kompTwzkId")
    private List<Komponenty> komponentyList;
    @OneToMany(mappedBy = "slceSlowId")
    private List<SlownikiCena> slownikiCenaList;

    public Slowniki() {
    }

    public Slowniki(Integer slowId) {
        this.slowId = slowId;
    }

    public Slowniki(Integer slowId, int id) {
        this.slowId = slowId;
        this.id = id;
    }

    public Integer getSlowId() {
        return slowId;
    }

    public void setSlowId(Integer slowId) {
        this.slowId = slowId;
    }

    public String getSlowTsloKod() {
        return slowTsloKod;
    }

    public void setSlowTsloKod(String slowTsloKod) {
        this.slowTsloKod = slowTsloKod;
    }

    public String getSlowNazwa() {
        return slowNazwa;
    }

    public void setSlowNazwa(String slowNazwa) {
        this.slowNazwa = slowNazwa;
    }

    public String getSlowNazwa2() {
        return slowNazwa2;
    }

    public void setSlowNazwa2(String slowNazwa2) {
        this.slowNazwa2 = slowNazwa2;
    }

    public String getSlowWidok() {
        return slowWidok;
    }

    public void setSlowWidok(String slowWidok) {
        this.slowWidok = slowWidok;
    }

    public String getSlowStatus() {
        return slowStatus;
    }

    public void setSlowStatus(String slowStatus) {
        this.slowStatus = slowStatus;
    }

    public BigDecimal getSlowCena1() {
        return slowCena1;
    }

    public void setSlowCena1(BigDecimal slowCena1) {
        this.slowCena1 = slowCena1;
    }

    public BigDecimal getSlowCena2() {
        return slowCena2;
    }

    public void setSlowCena2(BigDecimal slowCena2) {
        this.slowCena2 = slowCena2;
    }

    public Integer getSlowGrupaWpaId() {
        return slowGrupaWpaId;
    }

    public void setSlowGrupaWpaId(Integer slowGrupaWpaId) {
        this.slowGrupaWpaId = slowGrupaWpaId;
    }

    public Integer getSlowWpaIdJedn() {
        return slowWpaIdJedn;
    }

    public void setSlowWpaIdJedn(Integer slowWpaIdJedn) {
        this.slowWpaIdJedn = slowWpaIdJedn;
    }

    public String getSlowZdjecie() {
        return slowZdjecie;
    }

    public void setSlowZdjecie(String slowZdjecie) {
        this.slowZdjecie = slowZdjecie;
    }

    public Integer getSlowDodatek() {
        return slowDodatek;
    }

    public void setSlowDodatek(Integer slowDodatek) {
        this.slowDodatek = slowDodatek;
    }

    public String getSlowRodzaj() {
        return slowRodzaj;
    }

    public void setSlowRodzaj(String slowRodzaj) {
        this.slowRodzaj = slowRodzaj;
    }

    public String getSlowKolor() {
        return slowKolor;
    }

    public void setSlowKolor(String slowKolor) {
        this.slowKolor = slowKolor;
    }

    public String getSlowWielkosc() {
        return slowWielkosc;
    }

    public void setSlowWielkosc(String slowWielkosc) {
        this.slowWielkosc = slowWielkosc;
    }

    public String getSlowRozmiar() {
        return slowRozmiar;
    }

    public void setSlowRozmiar(String slowRozmiar) {
        this.slowRozmiar = slowRozmiar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Komponenty> getKomponentyList() {
        return komponentyList;
    }

    public void setKomponentyList(List<Komponenty> komponentyList) {
        this.komponentyList = komponentyList;
    }

    @XmlTransient
    public List<SlownikiCena> getSlownikiCenaList() {
        return slownikiCenaList;
    }

    public void setSlownikiCenaList(List<SlownikiCena> slownikiCenaList) {
        this.slownikiCenaList = slownikiCenaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (slowId != null ? slowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Slowniki)) {
            return false;
        }
        Slowniki other = (Slowniki) object;
        if ((this.slowId == null && other.slowId != null) || (this.slowId != null && !this.slowId.equals(other.slowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Slowniki[ slowId=" + slowId + " ]";
    }
    
}
