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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "waluty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Waluty.findAll", query = "SELECT w FROM Waluty w")})
public class Waluty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "wal_kod")
    private String walKod;
    @Size(max = 255)
    @Column(name = "wal_opis")
    private String walOpis;
    @Column(name = "wal_data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date walData;
    @Column(name = "wal_przelicznik")
    private Integer walPrzelicznik;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "wal_kurs")
    private Float walKurs;

    public Waluty() {
    }

    public Waluty(String walKod) {
        this.walKod = walKod;
    }

    public String getWalKod() {
        return walKod;
    }

    public void setWalKod(String walKod) {
        this.walKod = walKod;
    }

    public String getWalOpis() {
        return walOpis;
    }

    public void setWalOpis(String walOpis) {
        this.walOpis = walOpis;
    }

    public Date getWalData() {
        return walData;
    }

    public void setWalData(Date walData) {
        this.walData = walData;
    }

    public Integer getWalPrzelicznik() {
        return walPrzelicznik;
    }

    public void setWalPrzelicznik(Integer walPrzelicznik) {
        this.walPrzelicznik = walPrzelicznik;
    }

    public Float getWalKurs() {
        return walKurs;
    }

    public void setWalKurs(Float walKurs) {
        this.walKurs = walKurs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (walKod != null ? walKod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Waluty)) {
            return false;
        }
        Waluty other = (Waluty) object;
        if ((this.walKod == null && other.walKod != null) || (this.walKod != null && !this.walKod.equals(other.walKod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Waluty[ walKod=" + walKod + " ]";
    }
    
}
