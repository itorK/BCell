/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.esm.elymph.bcell.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "kompon_cena")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KomponCena.findAll", query = "SELECT k FROM KomponCena k")})
public class KomponCena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "koce_id")
    private Integer koceId;
    @Column(name = "koce_slce_id")
    private Integer koceSlceId;
    @Column(name = "koce_fakt_id")
    private Integer koceFaktId;
    @Column(name = "koce_pfak_id")
    private Integer kocePfakId;
    @Column(name = "koce_czy_indyw")
    private Integer koceCzyIndyw;
    @Column(name = "koce_termin_plat")
    @Temporal(TemporalType.DATE)
    private Date koceTerminPlat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "koce_cena")
    private BigDecimal koceCena;
    @Size(max = 5)
    @Column(name = "koce_waluta")
    private String koceWaluta;
    @Column(name = "koce_rabat")
    private Float koceRabat;
    @Size(max = 5)
    @Column(name = "koce_status")
    private String koceStatus;
    @JoinColumn(name = "koce_kzak_id", referencedColumnName = "kzak_id")
    @ManyToOne
    private KomponZak koceKzakId;

    public KomponCena() {
    }

    public KomponCena(Integer koceId) {
        this.koceId = koceId;
    }

    public Integer getKoceId() {
        return koceId;
    }

    public void setKoceId(Integer koceId) {
        this.koceId = koceId;
    }

    public Integer getKoceSlceId() {
        return koceSlceId;
    }

    public void setKoceSlceId(Integer koceSlceId) {
        this.koceSlceId = koceSlceId;
    }

    public Integer getKoceFaktId() {
        return koceFaktId;
    }

    public void setKoceFaktId(Integer koceFaktId) {
        this.koceFaktId = koceFaktId;
    }

    public Integer getKocePfakId() {
        return kocePfakId;
    }

    public void setKocePfakId(Integer kocePfakId) {
        this.kocePfakId = kocePfakId;
    }

    public Integer getKoceCzyIndyw() {
        return koceCzyIndyw;
    }

    public void setKoceCzyIndyw(Integer koceCzyIndyw) {
        this.koceCzyIndyw = koceCzyIndyw;
    }

    public Date getKoceTerminPlat() {
        return koceTerminPlat;
    }

    public void setKoceTerminPlat(Date koceTerminPlat) {
        this.koceTerminPlat = koceTerminPlat;
    }

    public BigDecimal getKoceCena() {
        return koceCena;
    }

    public void setKoceCena(BigDecimal koceCena) {
        this.koceCena = koceCena;
    }

    public String getKoceWaluta() {
        return koceWaluta;
    }

    public void setKoceWaluta(String koceWaluta) {
        this.koceWaluta = koceWaluta;
    }

    public Float getKoceRabat() {
        return koceRabat;
    }

    public void setKoceRabat(Float koceRabat) {
        this.koceRabat = koceRabat;
    }

    public String getKoceStatus() {
        return koceStatus;
    }

    public void setKoceStatus(String koceStatus) {
        this.koceStatus = koceStatus;
    }

    public KomponZak getKoceKzakId() {
        return koceKzakId;
    }

    public void setKoceKzakId(KomponZak koceKzakId) {
        this.koceKzakId = koceKzakId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (koceId != null ? koceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KomponCena)) {
            return false;
        }
        KomponCena other = (KomponCena) object;
        if ((this.koceId == null && other.koceId != null) || (this.koceId != null && !this.koceId.equals(other.koceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.esm.elymph.bcell.entities.KomponCena[ koceId=" + koceId + " ]";
    }
    
}
