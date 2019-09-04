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
@Table(name = "licznik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Licznik.findAll", query = "SELECT l FROM Licznik l")})
public class Licznik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "licz_id")
    private Integer liczId;
    @Size(max = 4)
    @Column(name = "licz_typ")
    private String liczTyp;
    @Column(name = "licz_cnt")
    private Integer liczCnt;
    @Size(max = 255)
    @Column(name = "licz_prefix")
    private String liczPrefix;
    @Column(name = "licz_fk")
    private Integer liczFk;
    @Size(max = 255)
    @Column(name = "licz_skrot")
    private String liczSkrot;

    public Licznik() {
    }

    public Licznik(Integer liczId) {
        this.liczId = liczId;
    }

    public Integer getLiczId() {
        return liczId;
    }

    public void setLiczId(Integer liczId) {
        this.liczId = liczId;
    }

    public String getLiczTyp() {
        return liczTyp;
    }

    public void setLiczTyp(String liczTyp) {
        this.liczTyp = liczTyp;
    }

    public Integer getLiczCnt() {
        return liczCnt;
    }

    public void setLiczCnt(Integer liczCnt) {
        this.liczCnt = liczCnt;
    }

    public String getLiczPrefix() {
        return liczPrefix;
    }

    public void setLiczPrefix(String liczPrefix) {
        this.liczPrefix = liczPrefix;
    }

    public Integer getLiczFk() {
        return liczFk;
    }

    public void setLiczFk(Integer liczFk) {
        this.liczFk = liczFk;
    }

    public String getLiczSkrot() {
        return liczSkrot;
    }

    public void setLiczSkrot(String liczSkrot) {
        this.liczSkrot = liczSkrot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (liczId != null ? liczId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licznik)) {
            return false;
        }
        Licznik other = (Licznik) object;
        if ((this.liczId == null && other.liczId != null) || (this.liczId != null && !this.liczId.equals(other.liczId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Licznik[ liczId=" + liczId + " ]";
    }
    
}
