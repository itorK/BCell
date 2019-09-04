/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "imp_plany_uzyt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpPlanyUzyt.findAll", query = "SELECT i FROM ImpPlanyUzyt i")})
public class ImpPlanyUzyt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "imu_id")
    private Integer imuId;
    @Column(name = "imu_iml_id")
    private Integer imuImlId;
    @Column(name = "imu_uzyt_id")
    private Integer imuUzytId;
    @Size(max = 2)
    @Column(name = "imu_status")
    private String imuStatus;

    public ImpPlanyUzyt() {
    }

    public ImpPlanyUzyt(Integer imuId) {
        this.imuId = imuId;
    }

    public Integer getImuId() {
        return imuId;
    }

    public void setImuId(Integer imuId) {
        this.imuId = imuId;
    }

    public Integer getImuImlId() {
        return imuImlId;
    }

    public void setImuImlId(Integer imuImlId) {
        this.imuImlId = imuImlId;
    }

    public Integer getImuUzytId() {
        return imuUzytId;
    }

    public void setImuUzytId(Integer imuUzytId) {
        this.imuUzytId = imuUzytId;
    }

    public String getImuStatus() {
        return imuStatus;
    }

    public void setImuStatus(String imuStatus) {
        this.imuStatus = imuStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imuId != null ? imuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpPlanyUzyt)) {
            return false;
        }
        ImpPlanyUzyt other = (ImpPlanyUzyt) object;
        if ((this.imuId == null && other.imuId != null) || (this.imuId != null && !this.imuId.equals(other.imuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ImpPlanyUzyt[ imuId=" + imuId + " ]";
    }
    
}
