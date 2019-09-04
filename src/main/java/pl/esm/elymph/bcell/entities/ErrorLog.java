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
@Table(name = "error_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ErrorLog.findAll", query = "SELECT e FROM ErrorLog e")})
public class ErrorLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "err_id")
    private Integer errId;
    @Lob
    @Column(name = "err_tekst")
    private byte[] errTekst;
    @Size(max = 255)
    @Column(name = "err_utworzyl")
    private String errUtworzyl;
    @Column(name = "err_data_utworzenia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date errDataUtworzenia;

    public ErrorLog() {
    }

    public ErrorLog(Integer errId) {
        this.errId = errId;
    }

    public Integer getErrId() {
        return errId;
    }

    public void setErrId(Integer errId) {
        this.errId = errId;
    }

    public byte[] getErrTekst() {
        return errTekst;
    }

    public void setErrTekst(byte[] errTekst) {
        this.errTekst = errTekst;
    }

    public String getErrUtworzyl() {
        return errUtworzyl;
    }

    public void setErrUtworzyl(String errUtworzyl) {
        this.errUtworzyl = errUtworzyl;
    }

    public Date getErrDataUtworzenia() {
        return errDataUtworzenia;
    }

    public void setErrDataUtworzenia(Date errDataUtworzenia) {
        this.errDataUtworzenia = errDataUtworzenia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (errId != null ? errId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ErrorLog)) {
            return false;
        }
        ErrorLog other = (ErrorLog) object;
        if ((this.errId == null && other.errId != null) || (this.errId != null && !this.errId.equals(other.errId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ErrorLog[ errId=" + errId + " ]";
    }
    
}
