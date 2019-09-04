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
@Table(name = "import")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Import.findAll", query = "SELECT i FROM Import i")})
public class Import implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "imp_id")
    private Integer impId;
    @Size(max = 255)
    @Column(name = "imp_nazwa_pliku")
    private String impNazwaPliku;
    @Size(max = 255)
    @Column(name = "imp_status")
    private String impStatus;
    @Lob
    @Column(name = "imp_plik")
    private byte[] impPlik;
    @Column(name = "imp_data_importu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date impDataImportu;

    public Import() {
    }

    public Import(Integer impId) {
        this.impId = impId;
    }

    public Integer getImpId() {
        return impId;
    }

    public void setImpId(Integer impId) {
        this.impId = impId;
    }

    public String getImpNazwaPliku() {
        return impNazwaPliku;
    }

    public void setImpNazwaPliku(String impNazwaPliku) {
        this.impNazwaPliku = impNazwaPliku;
    }

    public String getImpStatus() {
        return impStatus;
    }

    public void setImpStatus(String impStatus) {
        this.impStatus = impStatus;
    }

    public byte[] getImpPlik() {
        return impPlik;
    }

    public void setImpPlik(byte[] impPlik) {
        this.impPlik = impPlik;
    }

    public Date getImpDataImportu() {
        return impDataImportu;
    }

    public void setImpDataImportu(Date impDataImportu) {
        this.impDataImportu = impDataImportu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (impId != null ? impId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Import)) {
            return false;
        }
        Import other = (Import) object;
        if ((this.impId == null && other.impId != null) || (this.impId != null && !this.impId.equals(other.impId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Import[ impId=" + impId + " ]";
    }
    
}
