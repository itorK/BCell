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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "kont_cena")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KontCena.findAll", query = "SELECT k FROM KontCena k")})
public class KontCena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kcen_id")
    private Integer kcenId;
    @Column(name = "kcen_kont_id")
    private Integer kcenKontId;
    @Column(name = "kcen_wpa_id")
    private Integer kcenWpaId;
    @Column(name = "kcen_slce_id")
    private Integer kcenSlceId;
    @Column(name = "kcen_uzyt_id")
    private Integer kcenUzytId;
    @Column(name = "kcen_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kcenDataWprow;
    @Column(name = "kcen_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kcenDataMod;

    public KontCena() {
    }

    public KontCena(Integer kcenId) {
        this.kcenId = kcenId;
    }

    public Integer getKcenId() {
        return kcenId;
    }

    public void setKcenId(Integer kcenId) {
        this.kcenId = kcenId;
    }

    public Integer getKcenKontId() {
        return kcenKontId;
    }

    public void setKcenKontId(Integer kcenKontId) {
        this.kcenKontId = kcenKontId;
    }

    public Integer getKcenWpaId() {
        return kcenWpaId;
    }

    public void setKcenWpaId(Integer kcenWpaId) {
        this.kcenWpaId = kcenWpaId;
    }

    public Integer getKcenSlceId() {
        return kcenSlceId;
    }

    public void setKcenSlceId(Integer kcenSlceId) {
        this.kcenSlceId = kcenSlceId;
    }

    public Integer getKcenUzytId() {
        return kcenUzytId;
    }

    public void setKcenUzytId(Integer kcenUzytId) {
        this.kcenUzytId = kcenUzytId;
    }

    public Date getKcenDataWprow() {
        return kcenDataWprow;
    }

    public void setKcenDataWprow(Date kcenDataWprow) {
        this.kcenDataWprow = kcenDataWprow;
    }

    public Date getKcenDataMod() {
        return kcenDataMod;
    }

    public void setKcenDataMod(Date kcenDataMod) {
        this.kcenDataMod = kcenDataMod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kcenId != null ? kcenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KontCena)) {
            return false;
        }
        KontCena other = (KontCena) object;
        if ((this.kcenId == null && other.kcenId != null) || (this.kcenId != null && !this.kcenId.equals(other.kcenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KontCena[ kcenId=" + kcenId + " ]";
    }
    
}
