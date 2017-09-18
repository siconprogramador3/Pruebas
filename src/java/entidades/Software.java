/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
 * @author ANDY
 */
@Entity
@Table(name = "software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Software.findAll", query = "SELECT s FROM Software s")
    , @NamedQuery(name = "Software.findByIdSoftware", query = "SELECT s FROM Software s WHERE s.idSoftware = :idSoftware")
    , @NamedQuery(name = "Software.findBySoftware", query = "SELECT s FROM Software s WHERE s.software = :software")
    , @NamedQuery(name = "Software.findByDetalle", query = "SELECT s FROM Software s WHERE s.detalle = :detalle")
    , @NamedQuery(name = "Software.findByContrasena", query = "SELECT s FROM Software s WHERE s.contrasena = :contrasena")
    , @NamedQuery(name = "Software.findByIp", query = "SELECT s FROM Software s WHERE s.ip = :ip")
    , @NamedQuery(name = "Software.findByObservaciones", query = "SELECT s FROM Software s WHERE s.observaciones = :observaciones")})
public class Software implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_software")
    private Integer idSoftware;
    @Size(max = 30)
    @Column(name = "software")
    private String software;
    @Size(max = 255)
    @Column(name = "detalle")
    private String detalle;
    @Size(max = 30)
    @Column(name = "contrasena")
    private String contrasena;
    @Size(max = 15)
    @Column(name = "ip")
    private String ip;
    @Size(max = 255)
    @Column(name = "observaciones")
    private String observaciones;

    public Software() {
    }

    public Software(Integer idSoftware) {
        this.idSoftware = idSoftware;
    }

    public Integer getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(Integer idSoftware) {
        this.idSoftware = idSoftware;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSoftware != null ? idSoftware.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Software)) {
            return false;
        }
        Software other = (Software) object;
        if ((this.idSoftware == null && other.idSoftware != null) || (this.idSoftware != null && !this.idSoftware.equals(other.idSoftware))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Software[ idSoftware=" + idSoftware + " ]";
    }
    
}
