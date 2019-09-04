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
@Table(name = "rabaty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rabaty.findAll", query = "SELECT r FROM Rabaty r")})
public class Rabaty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rab_id")
    private Integer rabId;
    @Size(max = 255)
    @Column(name = "rab_nazwa")
    private String rabNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rab_procent")
    private Float rabProcent;
    @Column(name = "rab_ilosc")
    private Float rabIlosc;
    @Size(max = 5)
    @Column(name = "rab_typ")
    private String rabTyp;
    @Column(name = "rab_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rabDataWprow;
    @Column(name = "rab_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rabDataMod;
    @Column(name = "rab_uzyt_wprow")
    private Integer rabUzytWprow;
    @Column(name = "rab_uzyt_mod")
    private Integer rabUzytMod;
    @Column(name = "rab_slow_id")
    private Integer rabSlowId;
    @Column(name = "rab_kont_id")
    private Integer rabKontId;
    @Column(name = "rab_fakt_id")
    private Integer rabFaktId;
    @Column(name = "rab_pfak_id")
    private Integer rabPfakId;
    @Size(max = 2)
    @Column(name = "rab_status")
    private String rabStatus;

    public Rabaty() {
    }

    public Rabaty(Integer rabId) {
        this.rabId = rabId;
    }

    public Integer getRabId() {
        return rabId;
    }

    public void setRabId(Integer rabId) {
        this.rabId = rabId;
    }

    public String getRabNazwa() {
        return rabNazwa;
    }

    public void setRabNazwa(String rabNazwa) {
        this.rabNazwa = rabNazwa;
    }

    public Float getRabProcent() {
        return rabProcent;
    }

    public void setRabProcent(Float rabProcent) {
        this.rabProcent = rabProcent;
    }

    public Float getRabIlosc() {
        return rabIlosc;
    }

    public void setRabIlosc(Float rabIlosc) {
        this.rabIlosc = rabIlosc;
    }

    public String getRabTyp() {
        return rabTyp;
    }

    public void setRabTyp(String rabTyp) {
        this.rabTyp = rabTyp;
    }

    public Date getRabDataWprow() {
        return rabDataWprow;
    }

    public void setRabDataWprow(Date rabDataWprow) {
        this.rabDataWprow = rabDataWprow;
    }

    public Date getRabDataMod() {
        return rabDataMod;
    }

    public void setRabDataMod(Date rabDataMod) {
        this.rabDataMod = rabDataMod;
    }

    public Integer getRabUzytWprow() {
        return rabUzytWprow;
    }

    public void setRabUzytWprow(Integer rabUzytWprow) {
        this.rabUzytWprow = rabUzytWprow;
    }

    public Integer getRabUzytMod() {
        return rabUzytMod;
    }

    public void setRabUzytMod(Integer rabUzytMod) {
        this.rabUzytMod = rabUzytMod;
    }

    public Integer getRabSlowId() {
        return rabSlowId;
    }

    public void setRabSlowId(Integer rabSlowId) {
        this.rabSlowId = rabSlowId;
    }

    public Integer getRabKontId() {
        return rabKontId;
    }

    public void setRabKontId(Integer rabKontId) {
        this.rabKontId = rabKontId;
    }

    public Integer getRabFaktId() {
        return rabFaktId;
    }

    public void setRabFaktId(Integer rabFaktId) {
        this.rabFaktId = rabFaktId;
    }

    public Integer getRabPfakId() {
        return rabPfakId;
    }

    public void setRabPfakId(Integer rabPfakId) {
        this.rabPfakId = rabPfakId;
    }

    public String getRabStatus() {
        return rabStatus;
    }

    public void setRabStatus(String rabStatus) {
        this.rabStatus = rabStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rabId != null ? rabId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rabaty)) {
            return false;
        }
        Rabaty other = (Rabaty) object;
        if ((this.rabId == null && other.rabId != null) || (this.rabId != null && !this.rabId.equals(other.rabId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Rabaty[ rabId=" + rabId + " ]";
    }
    
}
