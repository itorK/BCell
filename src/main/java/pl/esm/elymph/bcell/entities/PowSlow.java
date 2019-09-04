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
@Table(name = "pow_slow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PowSlow.findAll", query = "SELECT p FROM PowSlow p")})
public class PowSlow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pslo_id")
    private Integer psloId;
    @Column(name = "pslo_slow_id_tkrz")
    private Integer psloSlowIdTkrz;
    @Column(name = "pslo_slow_id_twzk")
    private Integer psloSlowIdTwzk;
    @Column(name = "pslo_priorytet")
    private Integer psloPriorytet;
    @Size(max = 2)
    @Column(name = "pslo_status")
    private String psloStatus;
    @Size(max = 10)
    @Column(name = "pslo_oper")
    private String psloOper;

    public PowSlow() {
    }

    public PowSlow(Integer psloId) {
        this.psloId = psloId;
    }

    public Integer getPsloId() {
        return psloId;
    }

    public void setPsloId(Integer psloId) {
        this.psloId = psloId;
    }

    public Integer getPsloSlowIdTkrz() {
        return psloSlowIdTkrz;
    }

    public void setPsloSlowIdTkrz(Integer psloSlowIdTkrz) {
        this.psloSlowIdTkrz = psloSlowIdTkrz;
    }

    public Integer getPsloSlowIdTwzk() {
        return psloSlowIdTwzk;
    }

    public void setPsloSlowIdTwzk(Integer psloSlowIdTwzk) {
        this.psloSlowIdTwzk = psloSlowIdTwzk;
    }

    public Integer getPsloPriorytet() {
        return psloPriorytet;
    }

    public void setPsloPriorytet(Integer psloPriorytet) {
        this.psloPriorytet = psloPriorytet;
    }

    public String getPsloStatus() {
        return psloStatus;
    }

    public void setPsloStatus(String psloStatus) {
        this.psloStatus = psloStatus;
    }

    public String getPsloOper() {
        return psloOper;
    }

    public void setPsloOper(String psloOper) {
        this.psloOper = psloOper;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psloId != null ? psloId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PowSlow)) {
            return false;
        }
        PowSlow other = (PowSlow) object;
        if ((this.psloId == null && other.psloId != null) || (this.psloId != null && !this.psloId.equals(other.psloId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.PowSlow[ psloId=" + psloId + " ]";
    }
    
}
