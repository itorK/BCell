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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "prawa_w_mod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrawaWMod.findAll", query = "SELECT p FROM PrawaWMod p")})
public class PrawaWMod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pwm_id")
    private Integer pwmId;
    @Column(name = "pwm_mod_id")
    private Integer pwmModId;
    @Column(name = "pwm_uzyt_id")
    private Integer pwmUzytId;

    public PrawaWMod() {
    }

    public PrawaWMod(Integer pwmId) {
        this.pwmId = pwmId;
    }

    public Integer getPwmId() {
        return pwmId;
    }

    public void setPwmId(Integer pwmId) {
        this.pwmId = pwmId;
    }

    public Integer getPwmModId() {
        return pwmModId;
    }

    public void setPwmModId(Integer pwmModId) {
        this.pwmModId = pwmModId;
    }

    public Integer getPwmUzytId() {
        return pwmUzytId;
    }

    public void setPwmUzytId(Integer pwmUzytId) {
        this.pwmUzytId = pwmUzytId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pwmId != null ? pwmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrawaWMod)) {
            return false;
        }
        PrawaWMod other = (PrawaWMod) object;
        if ((this.pwmId == null && other.pwmId != null) || (this.pwmId != null && !this.pwmId.equals(other.pwmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.PrawaWMod[ pwmId=" + pwmId + " ]";
    }
    
}
