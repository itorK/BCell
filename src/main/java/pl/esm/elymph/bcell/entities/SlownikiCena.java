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
@Table(name = "slowniki_cena")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SlownikiCena.findAll", query = "SELECT s FROM SlownikiCena s")})
public class SlownikiCena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "slce_id")
    private Integer slceId;
    @Column(name = "slce_wpa_id")
    private Integer slceWpaId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "slce_cena")
    private Float slceCena;
    @Size(max = 5)
    @Column(name = "slce_status")
    private String slceStatus;
    @Column(name = "slce_uzyt_wprow")
    private Integer slceUzytWprow;
    @Column(name = "slce_data_wprow")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slceDataWprow;
    @JoinColumn(name = "slce_slow_id", referencedColumnName = "slow_id")
    @ManyToOne
    private Slowniki slceSlowId;

    public SlownikiCena() {
    }

    public SlownikiCena(Integer slceId) {
        this.slceId = slceId;
    }

    public Integer getSlceId() {
        return slceId;
    }

    public void setSlceId(Integer slceId) {
        this.slceId = slceId;
    }

    public Integer getSlceWpaId() {
        return slceWpaId;
    }

    public void setSlceWpaId(Integer slceWpaId) {
        this.slceWpaId = slceWpaId;
    }

    public Float getSlceCena() {
        return slceCena;
    }

    public void setSlceCena(Float slceCena) {
        this.slceCena = slceCena;
    }

    public String getSlceStatus() {
        return slceStatus;
    }

    public void setSlceStatus(String slceStatus) {
        this.slceStatus = slceStatus;
    }

    public Integer getSlceUzytWprow() {
        return slceUzytWprow;
    }

    public void setSlceUzytWprow(Integer slceUzytWprow) {
        this.slceUzytWprow = slceUzytWprow;
    }

    public Date getSlceDataWprow() {
        return slceDataWprow;
    }

    public void setSlceDataWprow(Date slceDataWprow) {
        this.slceDataWprow = slceDataWprow;
    }

    public Slowniki getSlceSlowId() {
        return slceSlowId;
    }

    public void setSlceSlowId(Slowniki slceSlowId) {
        this.slceSlowId = slceSlowId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (slceId != null ? slceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SlownikiCena)) {
            return false;
        }
        SlownikiCena other = (SlownikiCena) object;
        if ((this.slceId == null && other.slceId != null) || (this.slceId != null && !this.slceId.equals(other.slceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.SlownikiCena[ slceId=" + slceId + " ]";
    }
    
}
