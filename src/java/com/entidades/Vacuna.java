/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lore
 */
@Entity
@Table(name = "vacuna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacuna.findAll", query = "SELECT v FROM Vacuna v")
    , @NamedQuery(name = "Vacuna.findByCodigoVacuna", query = "SELECT v FROM Vacuna v WHERE v.codigoVacuna = :codigoVacuna")
    , @NamedQuery(name = "Vacuna.findByDescripcionVacuna", query = "SELECT v FROM Vacuna v WHERE v.descripcionVacuna = :descripcionVacuna")
    , @NamedQuery(name = "Vacuna.findByDosis", query = "SELECT v FROM Vacuna v WHERE v.dosis = :dosis")})
public class Vacuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "codigo_vacuna")
    private String codigoVacuna;
    @Size(max = 30)
    @Column(name = "descripcion_vacuna")
    private String descripcionVacuna;
    @Size(max = 10)
    @Column(name = "dosis")
    private String dosis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVacuna")
    private Collection<RegistroVacuna> registroVacunaCollection;

    public Vacuna() {
    }

    public Vacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
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

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @XmlTransient
    public Collection<RegistroVacuna> getRegistroVacunaCollection() {
        return registroVacunaCollection;
    }

    public void setRegistroVacunaCollection(Collection<RegistroVacuna> registroVacunaCollection) {
        this.registroVacunaCollection = registroVacunaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoVacuna != null ? codigoVacuna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacuna)) {
            return false;
        }
        Vacuna other = (Vacuna) object;
        if ((this.codigoVacuna == null && other.codigoVacuna != null) || (this.codigoVacuna != null && !this.codigoVacuna.equals(other.codigoVacuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Vacuna[ codigoVacuna=" + codigoVacuna + " ]";
    }
    
}
