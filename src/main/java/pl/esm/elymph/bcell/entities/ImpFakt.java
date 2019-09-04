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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "imp_fakt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpFakt.findAll", query = "SELECT i FROM ImpFakt i")})
public class ImpFakt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ifak_id")
    private Integer ifakId;
    @Size(max = 255)
    @Column(name = "ifak_nazwa")
    private String ifakNazwa;
    @Lob
    @Column(name = "ifak_plik")
    private byte[] ifakPlik;
    @Column(name = "ifak_data_wprow")
    @Temporal(TemporalType.DATE)
    private Date ifakDataWprow;
    @Size(max = 2)
    @Column(name = "ifak_status")
    private String ifakStatus;
    @JoinColumn(name = "ifak_fakt_id", referencedColumnName = "fakt_id")
    @ManyToOne
    private Faktury ifakFaktId;

    public ImpFakt() {
    }

    public ImpFakt(Integer ifakId) {
        this.ifakId = ifakId;
    }

    public Integer getIfakId() {
        return ifakId;
    }

    public void setIfakId(Integer ifakId) {
        this.ifakId = ifakId;
    }

    public String getIfakNazwa() {
        return ifakNazwa;
    }

    public void setIfakNazwa(String ifakNazwa) {
        this.ifakNazwa = ifakNazwa;
    }

    public byte[] getIfakPlik() {
        return ifakPlik;
    }

    public void setIfakPlik(byte[] ifakPlik) {
        this.ifakPlik = ifakPlik;
    }

    public Date getIfakDataWprow() {
        return ifakDataWprow;
    }

    public void setIfakDataWprow(Date ifakDataWprow) {
        this.ifakDataWprow = ifakDataWprow;
    }

    public String getIfakStatus() {
        return ifakStatus;
    }

    public void setIfakStatus(String ifakStatus) {
        this.ifakStatus = ifakStatus;
    }

    public Faktury getIfakFaktId() {
        return ifakFaktId;
    }

    public void setIfakFaktId(Faktury ifakFaktId) {
        this.ifakFaktId = ifakFaktId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ifakId != null ? ifakId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpFakt)) {
            return false;
        }
        ImpFakt other = (ImpFakt) object;
        if ((this.ifakId == null && other.ifakId != null) || (this.ifakId != null && !this.ifakId.equals(other.ifakId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ImpFakt[ ifakId=" + ifakId + " ]";
    }
    
}
