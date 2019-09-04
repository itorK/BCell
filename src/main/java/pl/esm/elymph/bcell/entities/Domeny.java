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
@Table(name = "domeny")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Domeny.findAll", query = "SELECT d FROM Domeny d")})
public class Domeny implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dom_id")
    private Integer domId;
    @Size(max = 255)
    @Column(name = "dom_typ")
    private String domTyp;
    @Size(max = 255)
    @Column(name = "dom_status")
    private String domStatus;
    @Size(max = 255)
    @Column(name = "dom_nazwa")
    private String domNazwa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dom_data_utw")
    @Temporal(TemporalType.TIMESTAMP)
    private Date domDataUtw;
    @Column(name = "dom_utworzyl")
    private Integer domUtworzyl;

    public Domeny() {
    }

    public Domeny(Integer domId) {
        this.domId = domId;
    }

    public Domeny(Integer domId, Date domDataUtw) {
        this.domId = domId;
        this.domDataUtw = domDataUtw;
    }

    public Integer getDomId() {
        return domId;
    }

    public void setDomId(Integer domId) {
        this.domId = domId;
    }

    public String getDomTyp() {
        return domTyp;
    }

    public void setDomTyp(String domTyp) {
        this.domTyp = domTyp;
    }

    public String getDomStatus() {
        return domStatus;
    }

    public void setDomStatus(String domStatus) {
        this.domStatus = domStatus;
    }

    public String getDomNazwa() {
        return domNazwa;
    }

    public void setDomNazwa(String domNazwa) {
        this.domNazwa = domNazwa;
    }

    public Date getDomDataUtw() {
        return domDataUtw;
    }

    public void setDomDataUtw(Date domDataUtw) {
        this.domDataUtw = domDataUtw;
    }

    public Integer getDomUtworzyl() {
        return domUtworzyl;
    }

    public void setDomUtworzyl(Integer domUtworzyl) {
        this.domUtworzyl = domUtworzyl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (domId != null ? domId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Domeny)) {
            return false;
        }
        Domeny other = (Domeny) object;
        if ((this.domId == null && other.domId != null) || (this.domId != null && !this.domId.equals(other.domId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Domeny[ domId=" + domId + " ]";
    }
    
}
