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
@Table(name = "imp_poz_inw")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpPozInw.findAll", query = "SELECT i FROM ImpPozInw i")})
public class ImpPozInw implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "impn_id")
    private Integer impnId;
    @Column(name = "impn_imin_id")
    private Integer impnIminId;
    @Column(name = "impn_slow_id")
    private Integer impnSlowId;
    @Size(max = 255)
    @Column(name = "impn_nazwa")
    private String impnNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "impn_ilosc_pocz")
    private Float impnIloscPocz;
    @Column(name = "impn_czy_pocz")
    private Integer impnCzyPocz;
    @Column(name = "impn_ilosc_inw")
    private Float impnIloscInw;
    @Column(name = "impn_czy_inw")
    private Integer impnCzyInw;
    @Column(name = "impn_ilosc_wl")
    private Float impnIloscWl;
    @Column(name = "impn_dopt_id")
    private Integer impnDoptId;

    public ImpPozInw() {
    }

    public ImpPozInw(Integer impnId) {
        this.impnId = impnId;
    }

    public Integer getImpnId() {
        return impnId;
    }

    public void setImpnId(Integer impnId) {
        this.impnId = impnId;
    }

    public Integer getImpnIminId() {
        return impnIminId;
    }

    public void setImpnIminId(Integer impnIminId) {
        this.impnIminId = impnIminId;
    }

    public Integer getImpnSlowId() {
        return impnSlowId;
    }

    public void setImpnSlowId(Integer impnSlowId) {
        this.impnSlowId = impnSlowId;
    }

    public String getImpnNazwa() {
        return impnNazwa;
    }

    public void setImpnNazwa(String impnNazwa) {
        this.impnNazwa = impnNazwa;
    }

    public Float getImpnIloscPocz() {
        return impnIloscPocz;
    }

    public void setImpnIloscPocz(Float impnIloscPocz) {
        this.impnIloscPocz = impnIloscPocz;
    }

    public Integer getImpnCzyPocz() {
        return impnCzyPocz;
    }

    public void setImpnCzyPocz(Integer impnCzyPocz) {
        this.impnCzyPocz = impnCzyPocz;
    }

    public Float getImpnIloscInw() {
        return impnIloscInw;
    }

    public void setImpnIloscInw(Float impnIloscInw) {
        this.impnIloscInw = impnIloscInw;
    }

    public Integer getImpnCzyInw() {
        return impnCzyInw;
    }

    public void setImpnCzyInw(Integer impnCzyInw) {
        this.impnCzyInw = impnCzyInw;
    }

    public Float getImpnIloscWl() {
        return impnIloscWl;
    }

    public void setImpnIloscWl(Float impnIloscWl) {
        this.impnIloscWl = impnIloscWl;
    }

    public Integer getImpnDoptId() {
        return impnDoptId;
    }

    public void setImpnDoptId(Integer impnDoptId) {
        this.impnDoptId = impnDoptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (impnId != null ? impnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpPozInw)) {
            return false;
        }
        ImpPozInw other = (ImpPozInw) object;
        if ((this.impnId == null && other.impnId != null) || (this.impnId != null && !this.impnId.equals(other.impnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.ImpPozInw[ impnId=" + impnId + " ]";
    }
    
}
