/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nino
 */
@Entity
@Table(name = "ZPRIVILAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zprivilage.findAll", query = "SELECT z FROM Zprivilage z"),
    @NamedQuery(name = "Zprivilage.findByZprivilageId", query = "SELECT z FROM Zprivilage z WHERE z.zprivilageId = :zprivilageId"),
    @NamedQuery(name = "Zprivilage.findByName", query = "SELECT z FROM Zprivilage z WHERE z.name = :name")})
public class Zprivilage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZPRIVILAGE_ID", nullable = false)
    private Integer zprivilageId;
    @Size(max = 20)
    @Column(name = "NAME", length = 20)
    private String name;

    public Zprivilage() {
    }

    public Zprivilage(Integer zprivilageId) {
        this.zprivilageId = zprivilageId;
    }

    public Integer getZprivilageId() {
        return zprivilageId;
    }

    public void setZprivilageId(Integer zprivilageId) {
        this.zprivilageId = zprivilageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zprivilageId != null ? zprivilageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zprivilage)) {
            return false;
        }
        Zprivilage other = (Zprivilage) object;
        if ((this.zprivilageId == null && other.zprivilageId != null) || (this.zprivilageId != null && !this.zprivilageId.equals(other.zprivilageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Zprivilage[ zprivilageId=" + zprivilageId + " ]";
    }
    
}
