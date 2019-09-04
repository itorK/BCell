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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "kalendarz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kalendarz.findAll", query = "SELECT k FROM Kalendarz k")})
public class Kalendarz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kal_id")
    private Integer kalId;
    @Size(max = 255)
    @Column(name = "kal_rspr_nr")
    private String kalRsprNr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "kal_mspr_nr")
    private String kalMsprNr;
    @Size(max = 11)
    @Column(name = "kal_status")
    private String kalStatus;
    @Column(name = "kal_procent")
    private Integer kalProcent;
    @Size(max = 255)
    @Column(name = "kal_utworzyl")
    private String kalUtworzyl;
    @Column(name = "kal_data_utworzenia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kalDataUtworzenia;
    @Size(max = 255)
    @Column(name = "kal_modyfikowal")
    private String kalModyfikowal;
    @Column(name = "kal_data_modyfikacji")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kalDataModyfikacji;

    public Kalendarz() {
    }

    public Kalendarz(Integer kalId) {
        this.kalId = kalId;
    }

    public Kalendarz(Integer kalId, String kalMsprNr) {
        this.kalId = kalId;
        this.kalMsprNr = kalMsprNr;
    }

    public Integer getKalId() {
        return kalId;
    }

    public void setKalId(Integer kalId) {
        this.kalId = kalId;
    }

    public String getKalRsprNr() {
        return kalRsprNr;
    }

    public void setKalRsprNr(String kalRsprNr) {
        this.kalRsprNr = kalRsprNr;
    }

    public String getKalMsprNr() {
        return kalMsprNr;
    }

    public void setKalMsprNr(String kalMsprNr) {
        this.kalMsprNr = kalMsprNr;
    }

    public String getKalStatus() {
        return kalStatus;
    }

    public void setKalStatus(String kalStatus) {
        this.kalStatus = kalStatus;
    }

    public Integer getKalProcent() {
        return kalProcent;
    }

    public void setKalProcent(Integer kalProcent) {
        this.kalProcent = kalProcent;
    }

    public String getKalUtworzyl() {
        return kalUtworzyl;
    }

    public void setKalUtworzyl(String kalUtworzyl) {
        this.kalUtworzyl = kalUtworzyl;
    }

    public Date getKalDataUtworzenia() {
        return kalDataUtworzenia;
    }

    public void setKalDataUtworzenia(Date kalDataUtworzenia) {
        this.kalDataUtworzenia = kalDataUtworzenia;
    }

    public String getKalModyfikowal() {
        return kalModyfikowal;
    }

    public void setKalModyfikowal(String kalModyfikowal) {
        this.kalModyfikowal = kalModyfikowal;
    }

    public Date getKalDataModyfikacji() {
        return kalDataModyfikacji;
    }

    public void setKalDataModyfikacji(Date kalDataModyfikacji) {
        this.kalDataModyfikacji = kalDataModyfikacji;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kalId != null ? kalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kalendarz)) {
            return false;
        }
        Kalendarz other = (Kalendarz) object;
        if ((this.kalId == null && other.kalId != null) || (this.kalId != null && !this.kalId.equals(other.kalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Kalendarz[ kalId=" + kalId + " ]";
    }
    
}
