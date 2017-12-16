/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

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
 * @author Lore
 */
@Entity
@Table(name = "registro_vacuna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroVacuna.findAll", query = "SELECT r FROM RegistroVacuna r")
    , @NamedQuery(name = "RegistroVacuna.findByEdadMeses", query = "SELECT r FROM RegistroVacuna r WHERE r.edadMeses = :edadMeses")
    , @NamedQuery(name = "RegistroVacuna.findByFecha", query = "SELECT r FROM RegistroVacuna r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "RegistroVacuna.findByEstado", query = "SELECT r FROM RegistroVacuna r WHERE r.estado = :estado")
    , @NamedQuery(name = "RegistroVacuna.findByIdRegistro", query = "SELECT r FROM RegistroVacuna r WHERE r.idRegistro = :idRegistro")
    , @NamedQuery(name = "RegistroVacuna.findByDosis", query = "SELECT r FROM RegistroVacuna r WHERE r.dosis = :dosis")})
public class RegistroVacuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "edad_meses")
    private Integer edadMeses;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "estado")
    private Boolean estado;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_registro")
    private Integer idRegistro;
    @Size(max = 100)
    @Column(name = "dosis")
    private String dosis;
    @JoinColumn(name = "id_hijo", referencedColumnName = "ci_codigo")
    @ManyToOne(optional = false)
    private Hijos idHijo;
    @JoinColumn(name = "id_vacuna", referencedColumnName = "codigo_vacuna")
    @ManyToOne(optional = false)
    private Vacuna idVacuna;

    public RegistroVacuna() {
    }

    public RegistroVacuna(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getEdadMeses() {
        return edadMeses;
    }

    public void setEdadMeses(Integer edadMeses) {
        this.edadMeses = edadMeses;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Hijos getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(Hijos idHijo) {
        this.idHijo = idHijo;
    }

    public Vacuna getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Vacuna idVacuna) {
        this.idVacuna = idVacuna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroVacuna)) {
            return false;
        }
        RegistroVacuna other = (RegistroVacuna) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.RegistroVacuna[ idRegistro=" + idRegistro + " ]";
    }
    
}
