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
@Table(name = "grupa_kont")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupaKont.findAll", query = "SELECT g FROM GrupaKont g")})
public class GrupaKont implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gkont_id")
    private Integer gkontId;
    @Size(max = 255)
    @Column(name = "gkont_opis")
    private String gkontOpis;
    @Column(name = "gkont_slce_id")
    private Integer gkontSlceId;
    @Column(name = "gkont_uzyt_id")
    private Integer gkontUzytId;
    @Column(name = "gkont_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gkontDataWprow;
    @Column(name = "gkont_data_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gkontDataMod;
    @Column(name = "gkont_wpa_id")
    private Integer gkontWpaId;
    @Column(name = "gkont_kont_id")
    private Integer gkontKontId;

    public GrupaKont() {
    }

    public GrupaKont(Integer gkontId) {
        this.gkontId = gkontId;
    }

    public Integer getGkontId() {
        return gkontId;
    }

    public void setGkontId(Integer gkontId) {
        this.gkontId = gkontId;
    }

    public String getGkontOpis() {
        return gkontOpis;
    }

    public void setGkontOpis(String gkontOpis) {
        this.gkontOpis = gkontOpis;
    }

    public Integer getGkontSlceId() {
        return gkontSlceId;
    }

    public void setGkontSlceId(Integer gkontSlceId) {
        this.gkontSlceId = gkontSlceId;
    }

    public Integer getGkontUzytId() {
        return gkontUzytId;
    }

    public void setGkontUzytId(Integer gkontUzytId) {
        this.gkontUzytId = gkontUzytId;
    }

    public Date getGkontDataWprow() {
        return gkontDataWprow;
    }

    public void setGkontDataWprow(Date gkontDataWprow) {
        this.gkontDataWprow = gkontDataWprow;
    }

    public Date getGkontDataMod() {
        return gkontDataMod;
    }

    public void setGkontDataMod(Date gkontDataMod) {
        this.gkontDataMod = gkontDataMod;
    }

    public Integer getGkontWpaId() {
        return gkontWpaId;
    }

    public void setGkontWpaId(Integer gkontWpaId) {
        this.gkontWpaId = gkontWpaId;
    }

    public Integer getGkontKontId() {
        return gkontKontId;
    }

    public void setGkontKontId(Integer gkontKontId) {
        this.gkontKontId = gkontKontId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gkontId != null ? gkontId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupaKont)) {
            return false;
        }
        GrupaKont other = (GrupaKont) object;
        if ((this.gkontId == null && other.gkontId != null) || (this.gkontId != null && !this.gkontId.equals(other.gkontId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.GrupaKont[ gkontId=" + gkontId + " ]";
    }
    
}
