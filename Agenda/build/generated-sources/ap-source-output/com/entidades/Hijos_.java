package com.entidades;

import com.entidades.RegistroVacuna;
import com.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-15T22:30:57")
@StaticMetamodel(Hijos.class)
public class Hijos_ { 

    public static volatile CollectionAttribute<Hijos, RegistroVacuna> registroVacunaCollection;
    public static volatile SingularAttribute<Hijos, Date> fechaNacimiento;
    public static volatile SingularAttribute<Hijos, String> municipio;
    public static volatile SingularAttribute<Hijos, Usuario> idUsuario;
    public static volatile SingularAttribute<Hijos, String> direccion;
    public static volatile SingularAttribute<Hijos, String> nombre;
    public static volatile SingularAttribute<Hijos, String> nacionalidad;
    public static volatile SingularAttribute<Hijos, String> alergias;
    public static volatile SingularAttribute<Hijos, String> apellido;
    public static volatile SingularAttribute<Hijos, String> barrioCia;
    public static volatile SingularAttribute<Hijos, String> departamento;
    public static volatile SingularAttribute<Hijos, Character> sexo;
    public static volatile SingularAttribute<Hijos, Integer> ciCodigo;
    public static volatile SingularAttribute<Hijos, String> lugarNacimiento;
    public static volatile SingularAttribute<Hijos, String> seguroMedico;

}