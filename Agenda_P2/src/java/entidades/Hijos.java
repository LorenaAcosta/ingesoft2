/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ingenieria
 */
@Entity
@Table(name = "hijos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hijos.findAll", query = "SELECT h FROM Hijos h")
    , @NamedQuery(name = "Hijos.findByCiCodigo", query = "SELECT h FROM Hijos h WHERE h.ciCodigo = :ciCodigo")
    , @NamedQuery(name = "Hijos.findByNombre", query = "SELECT h FROM Hijos h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Hijos.findByApellido", query = "SELECT h FROM Hijos h WHERE h.apellido = :apellido")
    , @NamedQuery(name = "Hijos.findByFechaNacimiento", query = "SELECT h FROM Hijos h WHERE h.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Hijos.findByLugarNacimiento", query = "SELECT h FROM Hijos h WHERE h.lugarNacimiento = :lugarNacimiento")
    , @NamedQuery(name = "Hijos.findBySexo", query = "SELECT h FROM Hijos h WHERE h.sexo = :sexo")
    , @NamedQuery(name = "Hijos.findByNacionalidad", query = "SELECT h FROM Hijos h WHERE h.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Hijos.findByDireccion", query = "SELECT h FROM Hijos h WHERE h.direccion = :direccion")
    , @NamedQuery(name = "Hijos.findByDepartamento", query = "SELECT h FROM Hijos h WHERE h.departamento = :departamento")
    , @NamedQuery(name = "Hijos.findByMunicipio", query = "SELECT h FROM Hijos h WHERE h.municipio = :municipio")
    , @NamedQuery(name = "Hijos.findByBarrioCia", query = "SELECT h FROM Hijos h WHERE h.barrioCia = :barrioCia")
    , @NamedQuery(name = "Hijos.findBySeguroMedico", query = "SELECT h FROM Hijos h WHERE h.seguroMedico = :seguroMedico")
    , @NamedQuery(name = "Hijos.findByAlergias", query = "SELECT h FROM Hijos h WHERE h.alergias = :alergias")})
public class Hijos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ci_codigo")
    private Integer ciCodigo;
    @Size(max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 40)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 20)
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Column(name = "sexo")
    private Character sexo;
    @Size(max = 20)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Size(max = 30)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "departamento")
    private String departamento;
    @Size(max = 20)
    @Column(name = "municipio")
    private String municipio;
    @Size(max = 20)
    @Column(name = "barrio_cia")
    private String barrioCia;
    @Size(max = 15)
    @Column(name = "seguro_medico")
    private String seguroMedico;
    @Size(max = 20)
    @Column(name = "alergias")
    private String alergias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciCodigoHijo")
    private Collection<Vacuna> vacunaCollection;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Hijos() {
    }

    public Hijos(Integer ciCodigo) {
        this.ciCodigo = ciCodigo;
    }

    public Integer getCiCodigo() {
        return ciCodigo;
    }

    public void setCiCodigo(Integer ciCodigo) {
        this.ciCodigo = ciCodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBarrioCia() {
        return barrioCia;
    }

    public void setBarrioCia(String barrioCia) {
        this.barrioCia = barrioCia;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @XmlTransient
    public Collection<Vacuna> getVacunaCollection() {
        return vacunaCollection;
    }

    public void setVacunaCollection(Collection<Vacuna> vacunaCollection) {
        this.vacunaCollection = vacunaCollection;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ciCodigo != null ? ciCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hijos)) {
            return false;
        }
        Hijos other = (Hijos) object;
        if ((this.ciCodigo == null && other.ciCodigo != null) || (this.ciCodigo != null && !this.ciCodigo.equals(other.ciCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Hijos[ ciCodigo=" + ciCodigo + " ]";
    }
    
}
