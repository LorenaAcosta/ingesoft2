/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Ingenieria
 */
@Entity
@Table(name = "vacuna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacuna.findAll", query = "SELECT v FROM Vacuna v")
    , @NamedQuery(name = "Vacuna.findByIdAplicacion", query = "SELECT v FROM Vacuna v WHERE v.idAplicacion = :idAplicacion")
    , @NamedQuery(name = "Vacuna.findByCodigoVacuna", query = "SELECT v FROM Vacuna v WHERE v.codigoVacuna = :codigoVacuna")
    , @NamedQuery(name = "Vacuna.findByDescripcionVacuna", query = "SELECT v FROM Vacuna v WHERE v.descripcionVacuna = :descripcionVacuna")
    , @NamedQuery(name = "Vacuna.findByAplicada", query = "SELECT v FROM Vacuna v WHERE v.aplicada = :aplicada")
    , @NamedQuery(name = "Vacuna.findByFechaAplicada", query = "SELECT v FROM Vacuna v WHERE v.fechaAplicada = :fechaAplicada")
    , @NamedQuery(name = "Vacuna.findByEdad", query = "SELECT v FROM Vacuna v WHERE v.edad = :edad")
    , @NamedQuery(name = "Vacuna.findByDosis", query = "SELECT v FROM Vacuna v WHERE v.dosis = :dosis")})
public class Vacuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_aplicacion")
    private Integer idAplicacion;
    @Size(max = 20)
    @Column(name = "codigo_vacuna")
    private String codigoVacuna;
    @Size(max = 30)
    @Column(name = "descripcion_vacuna")
    private String descripcionVacuna;
    @Column(name = "aplicada")
    private Boolean aplicada;
    @Column(name = "fecha_aplicada")
    @Temporal(TemporalType.DATE)
    private Date fechaAplicada;
    @Size(max = 10)
    @Column(name = "edad")
    private String edad;
    @Size(max = 10)
    @Column(name = "dosis")
    private String dosis;
    @JoinColumn(name = "ci_codigo_hijo", referencedColumnName = "ci_codigo")
    @ManyToOne(optional = false)
    private Hijos ciCodigoHijo;

    public Vacuna() {
    }

    public Vacuna(Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public Integer getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public String getDescripcionVacuna() {
        return descripcionVacuna;
    }

    public void setDescripcionVacuna(String descripcionVacuna) {
        this.descripcionVacuna = descripcionVacuna;
    }

    public Boolean getAplicada() {
        return aplicada;
    }

    public void setAplicada(Boolean aplicada) {
        this.aplicada = aplicada;
    }

    public Date getFechaAplicada() {
        return fechaAplicada;
    }

    public void setFechaAplicada(Date fechaAplicada) {
        this.fechaAplicada = fechaAplicada;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Hijos getCiCodigoHijo() {
        return ciCodigoHijo;
    }

    public void setCiCodigoHijo(Hijos ciCodigoHijo) {
        this.ciCodigoHijo = ciCodigoHijo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAplicacion != null ? idAplicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacuna)) {
            return false;
        }
        Vacuna other = (Vacuna) object;
        if ((this.idAplicacion == null && other.idAplicacion != null) || (this.idAplicacion != null && !this.idAplicacion.equals(other.idAplicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Vacuna[ idAplicacion=" + idAplicacion + " ]";
    }
    
}
