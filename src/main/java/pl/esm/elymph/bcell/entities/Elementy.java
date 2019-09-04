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
@Table(name = "elementy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elementy.findAll", query = "SELECT e FROM Elementy e")})
public class Elementy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ele_id")
    private Integer eleId;
    @Column(name = "ele_nr")
    private Integer eleNr;
    @Size(max = 255)
    @Column(name = "ele_nazwa")
    private String eleNazwa;
    @Column(name = "ele_uzyt_id")
    private Integer eleUzytId;
    @Column(name = "ele_dpz_id_pz")
    private Integer eleDpzIdPz;
    @Column(name = "ele_pfak_id_zak")
    private Integer elePfakIdZak;
    @Column(name = "ele_slow_id")
    private Integer eleSlowId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ele_ilosc")
    private Float eleIlosc;
    @Column(name = "ele_pkom_id")
    private Integer elePkomId;
    @Column(name = "ele_ele_id")
    private Integer eleEleId;

    public Elementy() {
    }

    public Elementy(Integer eleId) {
        this.eleId = eleId;
    }

    public Integer getEleId() {
        return eleId;
    }

    public void setEleId(Integer eleId) {
        this.eleId = eleId;
    }

    public Integer getEleNr() {
        return eleNr;
    }

    public void setEleNr(Integer eleNr) {
        this.eleNr = eleNr;
    }

    public String getEleNazwa() {
        return eleNazwa;
    }

    public void setEleNazwa(String eleNazwa) {
        this.eleNazwa = eleNazwa;
    }

    public Integer getEleUzytId() {
        return eleUzytId;
    }

    public void setEleUzytId(Integer eleUzytId) {
        this.eleUzytId = eleUzytId;
    }

    public Integer getEleDpzIdPz() {
        return eleDpzIdPz;
    }

    public void setEleDpzIdPz(Integer eleDpzIdPz) {
        this.eleDpzIdPz = eleDpzIdPz;
    }

    public Integer getElePfakIdZak() {
        return elePfakIdZak;
    }

    public void setElePfakIdZak(Integer elePfakIdZak) {
        this.elePfakIdZak = elePfakIdZak;
    }

    public Integer getEleSlowId() {
        return eleSlowId;
    }

    public void setEleSlowId(Integer eleSlowId) {
        this.eleSlowId = eleSlowId;
    }

    public Float getEleIlosc() {
        return eleIlosc;
    }

    public void setEleIlosc(Float eleIlosc) {
        this.eleIlosc = eleIlosc;
    }

    public Integer getElePkomId() {
        return elePkomId;
    }

    public void setElePkomId(Integer elePkomId) {
        this.elePkomId = elePkomId;
    }

    public Integer getEleEleId() {
        return eleEleId;
    }

    public void setEleEleId(Integer eleEleId) {
        this.eleEleId = eleEleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eleId != null ? eleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elementy)) {
            return false;
        }
        Elementy other = (Elementy) object;
        if ((this.eleId == null && other.eleId != null) || (this.eleId != null && !this.eleId.equals(other.eleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.Elementy[ eleId=" + eleId + " ]";
    }
    
}
