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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author itor
 */
@Entity
@Table(name = "imp_kom")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpKom.findAll", query = "SELECT i FROM ImpKom i")})
public class ImpKom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "imk_id")
    private Integer imkId;
    @Column(name = "imk_imp_id")
    private Integer imkImpId;
    @Lob
    @Column(name = "imk_kom")
    private byte[] imkKom;

    public ImpKom() {
    }

    public ImpKom(Integer imkId) {
        this.imkId = imkId;
    }

    public Integer getImkId() {
        return imkId;
    }

    public void setImkId(Integer imkId) {
        this.imkId = imkId;
    }

    public Integer getImkImpId() {
        return imkImpId;
    }

    public void setImkImpId(Integer imkImpId) {
        this.imkImpId = imkImpId;
    }

    public byte[] getImkKom() {
        return imkKom;
    }

    public void setImkKom(byte[] imkKom) {
        this.imkKom = imkKom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imkId != null ? imkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpKom)) {
            return false;
        }
        ImpKom other = (ImpKom) object;
        if ((this.imkId == null && other.imkId != null) || (this.imkId != null && !this.imkId.equals(other.imkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ImpKom[ imkId=" + imkId + " ]";
    }
    
}
