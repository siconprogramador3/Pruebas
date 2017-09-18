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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")
    , @NamedQuery(name = "Cuentas.findByIdCuentas", query = "SELECT c FROM Cuentas c WHERE c.idCuentas = :idCuentas")
    , @NamedQuery(name = "Cuentas.findByTipo", query = "SELECT c FROM Cuentas c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Cuentas.findByUsuario", query = "SELECT c FROM Cuentas c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "Cuentas.findByContrasena", query = "SELECT c FROM Cuentas c WHERE c.contrasena = :contrasena")
    , @NamedQuery(name = "Cuentas.findByCorreo", query = "SELECT c FROM Cuentas c WHERE c.correo = :correo")})
public class Cuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cuentas")
    private Integer idCuentas;
    @Size(max = 30)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 30)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 30)
    @Column(name = "contrasena")
    private String contrasena;
    @Size(max = 50)
    @Column(name = "correo")
    private String correo;
    @JoinColumn(name = "id_personal", referencedColumnName = "id_personal")
    @ManyToOne
    private Personal idPersonal;

    public Cuentas() {
    }

    public Cuentas(Integer idCuentas) {
        this.idCuentas = idCuentas;
    }

    public Integer getIdCuentas() {
        return idCuentas;
    }

    public void setIdCuentas(Integer idCuentas) {
        this.idCuentas = idCuentas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Personal getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Personal idPersonal) {
        this.idPersonal = idPersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuentas != null ? idCuentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.idCuentas == null && other.idCuentas != null) || (this.idCuentas != null && !this.idCuentas.equals(other.idCuentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cuentas[ idCuentas=" + idCuentas + " ]";
    }
    
}
