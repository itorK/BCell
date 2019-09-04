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
@Table(name = "grupa_tow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupaTow.findAll", query = "SELECT g FROM GrupaTow g")})
public class GrupaTow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gtow_id")
    private Integer gtowId;
    @Size(max = 200)
    @Column(name = "gtow_nazwa")
    private String gtowNazwa;
    @Column(name = "gtow_data")
    @Temporal(TemporalType.DATE)
    private Date gtowData;
    @Size(max = 2)
    @Column(name = "gtow_status")
    private String gtowStatus;
    @Column(name = "gtow_fk")
    private Integer gtowFk;
    @Column(name = "gtow_kont_id")
    private Integer gtowKontId;

    public GrupaTow() {
    }

    public GrupaTow(Integer gtowId) {
        this.gtowId = gtowId;
    }

    public Integer getGtowId() {
        return gtowId;
    }

    public void setGtowId(Integer gtowId) {
        this.gtowId = gtowId;
    }

    public String getGtowNazwa() {
        return gtowNazwa;
    }

    public void setGtowNazwa(String gtowNazwa) {
        this.gtowNazwa = gtowNazwa;
    }

    public Date getGtowData() {
        return gtowData;
    }

    public void setGtowData(Date gtowData) {
        this.gtowData = gtowData;
    }

    public String getGtowStatus() {
        return gtowStatus;
    }

    public void setGtowStatus(String gtowStatus) {
        this.gtowStatus = gtowStatus;
    }

    public Integer getGtowFk() {
        return gtowFk;
    }

    public void setGtowFk(Integer gtowFk) {
        this.gtowFk = gtowFk;
    }

    public Integer getGtowKontId() {
        return gtowKontId;
    }

    public void setGtowKontId(Integer gtowKontId) {
        this.gtowKontId = gtowKontId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gtowId != null ? gtowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupaTow)) {
            return false;
        }
        GrupaTow other = (GrupaTow) object;
        if ((this.gtowId == null && other.gtowId != null) || (this.gtowId != null && !this.gtowId.equals(other.gtowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.GrupaTow[ gtowId=" + gtowId + " ]";
    }
    
}
