/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nino
 */
@Entity
@Table(name = "ZDOC_LINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZdocLine.findAll", query = "SELECT z FROM ZdocLine z"),
    @NamedQuery(name = "ZdocLine.findByZdocId", query = "SELECT z FROM ZdocLine z WHERE z.zdocId = :zdocId"),
    @NamedQuery(name = "ZdocLine.findByZdocLineId", query = "SELECT z FROM ZdocLine z WHERE z.zdocLineId = :zdocLineId"),
    @NamedQuery(name = "ZdocLine.findByNomor", query = "SELECT z FROM ZdocLine z WHERE z.nomor = :nomor"),
    @NamedQuery(name = "ZdocLine.findByPic", query = "SELECT z FROM ZdocLine z WHERE z.pic = :pic"),
    @NamedQuery(name = "ZdocLine.findByTgl", query = "SELECT z FROM ZdocLine z WHERE z.tgl = :tgl"),
    @NamedQuery(name = "ZdocLine.findByRespond", query = "SELECT z FROM ZdocLine z WHERE z.respond = :respond"),
    @NamedQuery(name = "ZdocLine.findByKeterangan", query = "SELECT z FROM ZdocLine z WHERE z.keterangan = :keterangan")})
public class ZdocLine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ZDOC_ID")
    private Integer zdocId;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOC_LINE_ID", nullable = false)
    private Integer zdocLineId;
    @Column(name = "NOMOR")
    private Integer nomor;
    @Size(max = 20)
    @Column(name = "PIC", length = 20)
    private String pic;
    @Column(name = "TGL")
    @Temporal(TemporalType.DATE)
    private Date tgl;
    @Size(max = 20)
    @Column(name = "RESPOND", length = 20)
    private String respond;
    @Size(max = 50)
    @Column(name = "KETERANGAN", length = 50)
    private String keterangan;

    public ZdocLine() {
    }

    public ZdocLine(Integer zdocLineId) {
        this.zdocLineId = zdocLineId;
    }

    public Integer getZdocId() {
        return zdocId;
    }

    public void setZdocId(Integer zdocId) {
        this.zdocId = zdocId;
    }

    public Integer getZdocLineId() {
        return zdocLineId;
    }

    public void setZdocLineId(Integer zdocLineId) {
        this.zdocLineId = zdocLineId;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getRespond() {
        return respond;
    }

    public void setRespond(String respond) {
        this.respond = respond;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocLineId != null ? zdocLineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZdocLine)) {
            return false;
        }
        ZdocLine other = (ZdocLine) object;
        if ((this.zdocLineId == null && other.zdocLineId != null) || (this.zdocLineId != null && !this.zdocLineId.equals(other.zdocLineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZdocLine[ zdocLineId=" + zdocLineId + " ]";
    }
    
}
