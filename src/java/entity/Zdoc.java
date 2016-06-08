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
@Table(name = "ZDOC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zdoc.findAll", query = "SELECT z FROM Zdoc z"),
    @NamedQuery(name = "Zdoc.findByZdocId", query = "SELECT z FROM Zdoc z WHERE z.zdocId = :zdocId"),
    @NamedQuery(name = "Zdoc.findByName", query = "SELECT z FROM Zdoc z WHERE z.name = :name"),
    @NamedQuery(name = "Zdoc.findByReff", query = "SELECT z FROM Zdoc z WHERE z.reff = :reff"),
    @NamedQuery(name = "Zdoc.findByTgl", query = "SELECT z FROM Zdoc z WHERE z.tgl = :tgl"),
    @NamedQuery(name = "Zdoc.findByJudul", query = "SELECT z FROM Zdoc z WHERE z.judul = :judul"),
    @NamedQuery(name = "Zdoc.findByZstatusId", query = "SELECT z FROM Zdoc z WHERE z.zstatusId = :zstatusId"),
    @NamedQuery(name = "Zdoc.findByDescript", query = "SELECT z FROM Zdoc z WHERE z.descript = :descript"),
    @NamedQuery(name = "Zdoc.findByZuserId", query = "SELECT z FROM Zdoc z WHERE z.zuserId = :zuserId"),
    @NamedQuery(name = "Zdoc.findByZstatusdocId", query = "SELECT z FROM Zdoc z WHERE z.zstatusdocId = :zstatusdocId")})
public class Zdoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZDOC_ID", nullable = false)
    private Integer zdocId;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;
    @Size(max = 20)
    @Column(name = "REFF", length = 20)
    private String reff;
    @Column(name = "TGL")
    @Temporal(TemporalType.DATE)
    private Date tgl;
    @Size(max = 20)
    @Column(name = "JUDUL", length = 20)
    private String judul;
    @Column(name = "ZSTATUS_ID")
    private Integer zstatusId;
    @Size(max = 40)
    @Column(name = "DESCRIPT", length = 40)
    private String descript;
    @Column(name = "ZUSER_ID")
    private Integer zuserId;
    @Column(name = "ZSTATUSDOC_ID")
    private Integer zstatusdocId;

    public Zdoc() {
    }

    public Zdoc(Integer zdocId) {
        this.zdocId = zdocId;
    }

    public Integer getZdocId() {
        return zdocId;
    }

    public void setZdocId(Integer zdocId) {
        this.zdocId = zdocId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReff() {
        return reff;
    }

    public void setReff(String reff) {
        this.reff = reff;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Integer getZstatusId() {
        return zstatusId;
    }

    public void setZstatusId(Integer zstatusId) {
        this.zstatusId = zstatusId;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getZuserId() {
        return zuserId;
    }

    public void setZuserId(Integer zuserId) {
        this.zuserId = zuserId;
    }

    public Integer getZstatusdocId() {
        return zstatusdocId;
    }

    public void setZstatusdocId(Integer zstatusdocId) {
        this.zstatusdocId = zstatusdocId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zdocId != null ? zdocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zdoc)) {
            return false;
        }
        Zdoc other = (Zdoc) object;
        if ((this.zdocId == null && other.zdocId != null) || (this.zdocId != null && !this.zdocId.equals(other.zdocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zdoc[ zdocId=" + zdocId + " ]";
    }
    
}
