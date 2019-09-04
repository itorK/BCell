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
import javax.persistence.Lob;
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
@Table(name = "imp_inw")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpInw.findAll", query = "SELECT i FROM ImpInw i")})
public class ImpInw implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "imin_id")
    private Integer iminId;
    @Column(name = "imin_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iminDataWprow;
    @Column(name = "imin_slow_id")
    private Integer iminSlowId;
    @Size(max = 255)
    @Column(name = "imin_nazwa")
    private String iminNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "imin_ilosc")
    private Float iminIlosc;
    @Lob
    @Column(name = "imin_plik")
    private byte[] iminPlik;
    @Size(max = 255)
    @Column(name = "imin_nazwa_pliku")
    private String iminNazwaPliku;
    @Size(max = 2)
    @Column(name = "imin_status")
    private String iminStatus;

    public ImpInw() {
    }

    public ImpInw(Integer iminId) {
        this.iminId = iminId;
    }

    public Integer getIminId() {
        return iminId;
    }

    public void setIminId(Integer iminId) {
        this.iminId = iminId;
    }

    public Date getIminDataWprow() {
        return iminDataWprow;
    }

    public void setIminDataWprow(Date iminDataWprow) {
        this.iminDataWprow = iminDataWprow;
    }

    public Integer getIminSlowId() {
        return iminSlowId;
    }

    public void setIminSlowId(Integer iminSlowId) {
        this.iminSlowId = iminSlowId;
    }

    public String getIminNazwa() {
        return iminNazwa;
    }

    public void setIminNazwa(String iminNazwa) {
        this.iminNazwa = iminNazwa;
    }

    public Float getIminIlosc() {
        return iminIlosc;
    }

    public void setIminIlosc(Float iminIlosc) {
        this.iminIlosc = iminIlosc;
    }

    public byte[] getIminPlik() {
        return iminPlik;
    }

    public void setIminPlik(byte[] iminPlik) {
        this.iminPlik = iminPlik;
    }

    public String getIminNazwaPliku() {
        return iminNazwaPliku;
    }

    public void setIminNazwaPliku(String iminNazwaPliku) {
        this.iminNazwaPliku = iminNazwaPliku;
    }

    public String getIminStatus() {
        return iminStatus;
    }

    public void setIminStatus(String iminStatus) {
        this.iminStatus = iminStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iminId != null ? iminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpInw)) {
            return false;
        }
        ImpInw other = (ImpInw) object;
        if ((this.iminId == null && other.iminId != null) || (this.iminId != null && !this.iminId.equals(other.iminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ImpInw[ iminId=" + iminId + " ]";
    }
    
}
