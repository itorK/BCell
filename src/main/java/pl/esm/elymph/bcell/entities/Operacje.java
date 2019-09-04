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
@Table(name = "operacje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operacje.findAll", query = "SELECT o FROM Operacje o")})
public class Operacje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "opt_id")
    private Integer optId;
    @Column(name = "opt_slow_id_tkrz")
    private Integer optSlowIdTkrz;
    @Column(name = "opt_data_operacji")
    @Temporal(TemporalType.DATE)
    private Date optDataOperacji;
    @Size(max = 11)
    @Column(name = "opt_status")
    private String optStatus;
    @Column(name = "opt_ilosc")
    private Integer optIlosc;
    @Column(name = "opt_prac_id")
    private Integer optPracId;
    @Column(name = "opt_dpz_id")
    private Integer optDpzId;
    @Column(name = "opt_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date optDataWprow;
    @Column(name = "opt_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date optDataMod;
    @Column(name = "opt_uzyt_wprow")
    private Integer optUzytWprow;
    @Column(name = "opt_uzyt_mod")
    private Integer optUzytMod;
    @Column(name = "opt_data_zatw")
    @Temporal(TemporalType.TIMESTAMP)
    private Date optDataZatw;
    @Size(max = 255)
    @Column(name = "opt_komentarz")
    private String optKomentarz;
    @Column(name = "opt_opt_id")
    private Integer optOptId;

    public Operacje() {
    }

    public Operacje(Integer optId) {
        this.optId = optId;
    }

    public Integer getOptId() {
        return optId;
    }

    public void setOptId(Integer optId) {
        this.optId = optId;
    }

    public Integer getOptSlowIdTkrz() {
        return optSlowIdTkrz;
    }

    public void setOptSlowIdTkrz(Integer optSlowIdTkrz) {
        this.optSlowIdTkrz = optSlowIdTkrz;
    }

    public Date getOptDataOperacji() {
        return optDataOperacji;
    }

    public void setOptDataOperacji(Date optDataOperacji) {
        this.optDataOperacji = optDataOperacji;
    }

    public String getOptStatus() {
        return optStatus;
    }

    public void setOptStatus(String optStatus) {
        this.optStatus = optStatus;
    }

    public Integer getOptIlosc() {
        return optIlosc;
    }

    public void setOptIlosc(Integer optIlosc) {
        this.optIlosc = optIlosc;
    }

    public Integer getOptPracId() {
        return optPracId;
    }

    public void setOptPracId(Integer optPracId) {
        this.optPracId = optPracId;
    }

    public Integer getOptDpzId() {
        return optDpzId;
    }

    public void setOptDpzId(Integer optDpzId) {
        this.optDpzId = optDpzId;
    }

    public Date getOptDataWprow() {
        return optDataWprow;
    }

    public void setOptDataWprow(Date optDataWprow) {
        this.optDataWprow = optDataWprow;
    }

    public Date getOptDataMod() {
        return optDataMod;
    }

    public void setOptDataMod(Date optDataMod) {
        this.optDataMod = optDataMod;
    }

    public Integer getOptUzytWprow() {
        return optUzytWprow;
    }

    public void setOptUzytWprow(Integer optUzytWprow) {
        this.optUzytWprow = optUzytWprow;
    }

    public Integer getOptUzytMod() {
        return optUzytMod;
    }

    public void setOptUzytMod(Integer optUzytMod) {
        this.optUzytMod = optUzytMod;
    }

    public Date getOptDataZatw() {
        return optDataZatw;
    }

    public void setOptDataZatw(Date optDataZatw) {
        this.optDataZatw = optDataZatw;
    }

    public String getOptKomentarz() {
        return optKomentarz;
    }

    public void setOptKomentarz(String optKomentarz) {
        this.optKomentarz = optKomentarz;
    }

    public Integer getOptOptId() {
        return optOptId;
    }

    public void setOptOptId(Integer optOptId) {
        this.optOptId = optOptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (optId != null ? optId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operacje)) {
            return false;
        }
        Operacje other = (Operacje) object;
        if ((this.optId == null && other.optId != null) || (this.optId != null && !this.optId.equals(other.optId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Operacje[ optId=" + optId + " ]";
    }
    
}
