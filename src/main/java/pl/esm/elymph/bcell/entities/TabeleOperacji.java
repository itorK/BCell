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
@Table(name = "tabele_operacji")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabeleOperacji.findAll", query = "SELECT t FROM TabeleOperacji t")})
public class TabeleOperacji implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "topt_id")
    private Integer toptId;
    @Size(max = 255)
    @Column(name = "topt_nazwa")
    private String toptNazwa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "topt_wartosc")
    private Float toptWartosc;
    @Column(name = "topt_slow_id_cel")
    private Integer toptSlowIdCel;
    @Column(name = "topt_slow_id_pobranie")
    private Integer toptSlowIdPobranie;
    @Size(max = 255)
    @Column(name = "topt_param1")
    private String toptParam1;
    @Size(max = 255)
    @Column(name = "topt_def")
    private String toptDef;
    @Column(name = "topt_dopt_id")
    private Integer toptDoptId;

    public TabeleOperacji() {
    }

    public TabeleOperacji(Integer toptId) {
        this.toptId = toptId;
    }

    public Integer getToptId() {
        return toptId;
    }

    public void setToptId(Integer toptId) {
        this.toptId = toptId;
    }

    public String getToptNazwa() {
        return toptNazwa;
    }

    public void setToptNazwa(String toptNazwa) {
        this.toptNazwa = toptNazwa;
    }

    public Float getToptWartosc() {
        return toptWartosc;
    }

    public void setToptWartosc(Float toptWartosc) {
        this.toptWartosc = toptWartosc;
    }

    public Integer getToptSlowIdCel() {
        return toptSlowIdCel;
    }

    public void setToptSlowIdCel(Integer toptSlowIdCel) {
        this.toptSlowIdCel = toptSlowIdCel;
    }

    public Integer getToptSlowIdPobranie() {
        return toptSlowIdPobranie;
    }

    public void setToptSlowIdPobranie(Integer toptSlowIdPobranie) {
        this.toptSlowIdPobranie = toptSlowIdPobranie;
    }

    public String getToptParam1() {
        return toptParam1;
    }

    public void setToptParam1(String toptParam1) {
        this.toptParam1 = toptParam1;
    }

    public String getToptDef() {
        return toptDef;
    }

    public void setToptDef(String toptDef) {
        this.toptDef = toptDef;
    }

    public Integer getToptDoptId() {
        return toptDoptId;
    }

    public void setToptDoptId(Integer toptDoptId) {
        this.toptDoptId = toptDoptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (toptId != null ? toptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabeleOperacji)) {
            return false;
        }
        TabeleOperacji other = (TabeleOperacji) object;
        if ((this.toptId == null && other.toptId != null) || (this.toptId != null && !this.toptId.equals(other.toptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.TabeleOperacji[ toptId=" + toptId + " ]";
    }
    
}
