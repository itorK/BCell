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
@Table(name = "zdarzenia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdarzenia.findAll", query = "SELECT z FROM Zdarzenia z")})
public class Zdarzenia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "zdarz_id")
    private Integer zdarzId;
    @Size(max = 255)
    @Column(name = "zdarz_tytul")
    private String zdarzTytul;
    @Size(max = 255)
    @Column(name = "zdarz_opis")
    private String zdarzOpis;
    @Column(name = "zdarz_uzyt_id")
    private Integer zdarzUzytId;
    @Column(name = "zdarz_data_pocz")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zdarzDataPocz;
    @Column(name = "zdarz_data_konc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zdarzDataKonc;
    @Column(name = "zdarz_data_utw")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zdarzDataUtw;

    public Zdarzenia() {
    }

    public Zdarzenia(Integer zdarzId) {
        this.zdarzId = zdarzId;
    }

    public Integer getZdarzId() {
        return zdarzId;
    }

    public void setZdarzId(Integer zdarzId) {
        this.zdarzId = zdarzId;
    }

    public String getZdarzTytul() {
        return zdarzTytul;
    }

    public void setZdarzTytul(String zdarzTytul) {
        this.zdarzTytul = zdarzTytul;
    }

    public String getZdarzOpis() {
        return zdarzOpis;
    }

    public void setZdarzOpis(String zdarzOpis) {
        this.zdarzOpis = zdarzOpis;
    }

    public Integer getZdarzUzytId() {
        return zdarzUzytId;
    }

    public void setZdarzUzytId(Integer zdarzUzytId) {
        this.zdarzUzytId = zdarzUzytId;
    }

    public Date getZdarzDataPocz() {
        return zdarzDataPocz;
    }

    public void setZdarzDataPocz(Date zdarzDataPocz) {
        this.zdarzDataPocz = zdarzDataPocz;
    }

    public Date getZdarzDataKonc() {
        return zdarzDataKonc;
    }

    public void setZdarzDataKonc(Date zdarzDataKonc) {
        this.zdarzDataKonc = zdarzDataKonc;
    }

    public Date getZdarzDataUtw() {
        return zdarzDataUtw;
    }

    public void setZdarzDataUtw(Date zdarzDataUtw) {
        this.zdarzDataUtw = zdarzDataUtw;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdarzId != null ? zdarzId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdarzenia)) {
            return false;
        }
        Zdarzenia other = (Zdarzenia) object;
        if ((this.zdarzId == null && other.zdarzId != null) || (this.zdarzId != null && !this.zdarzId.equals(other.zdarzId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Zdarzenia[ zdarzId=" + zdarzId + " ]";
    }
    
}
