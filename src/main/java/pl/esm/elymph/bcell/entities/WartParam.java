/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
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
@Table(name = "wart_param")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WartParam.findAll", query = "SELECT w FROM WartParam w")})
public class WartParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wpa_id")
    private Integer wpaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wpa_par_id")
    private int wpaParId;
    @Size(max = 255)
    @Column(name = "wpa_nazwa")
    private String wpaNazwa;
    @Size(max = 255)
    @Column(name = "wpa_dod_info")
    private String wpaDodInfo;
    @Size(max = 2)
    @Column(name = "wpa_domyslna")
    private String wpaDomyslna;
    @OneToMany(mappedBy = "faktParTypPlat")
    private List<Faktury> fakturyList;

    public WartParam() {
    }

    public WartParam(Integer wpaId) {
        this.wpaId = wpaId;
    }

    public WartParam(Integer wpaId, int wpaParId) {
        this.wpaId = wpaId;
        this.wpaParId = wpaParId;
    }

    public Integer getWpaId() {
        return wpaId;
    }

    public void setWpaId(Integer wpaId) {
        this.wpaId = wpaId;
    }

    public int getWpaParId() {
        return wpaParId;
    }

    public void setWpaParId(int wpaParId) {
        this.wpaParId = wpaParId;
    }

    public String getWpaNazwa() {
        return wpaNazwa;
    }

    public void setWpaNazwa(String wpaNazwa) {
        this.wpaNazwa = wpaNazwa;
    }

    public String getWpaDodInfo() {
        return wpaDodInfo;
    }

    public void setWpaDodInfo(String wpaDodInfo) {
        this.wpaDodInfo = wpaDodInfo;
    }

    public String getWpaDomyslna() {
        return wpaDomyslna;
    }

    public void setWpaDomyslna(String wpaDomyslna) {
        this.wpaDomyslna = wpaDomyslna;
    }

    @XmlTransient
    public List<Faktury> getFakturyList() {
        return fakturyList;
    }

    public void setFakturyList(List<Faktury> fakturyList) {
        this.fakturyList = fakturyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wpaId != null ? wpaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WartParam)) {
            return false;
        }
        WartParam other = (WartParam) object;
        if ((this.wpaId == null && other.wpaId != null) || (this.wpaId != null && !this.wpaId.equals(other.wpaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.WartParam[ wpaId=" + wpaId + " ]";
    }
    
}
