package com.entidades;

import com.entidades.Hijos;
import com.entidades.Vacuna;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-15T22:30:57")
@StaticMetamodel(RegistroVacuna.class)
public class RegistroVacuna_ { 

    public static volatile SingularAttribute<RegistroVacuna, Date> fecha;
    public static volatile SingularAttribute<RegistroVacuna, Hijos> idHijo;
    public static volatile SingularAttribute<RegistroVacuna, Boolean> estado;
    public static volatile SingularAttribute<RegistroVacuna, Integer> edadMeses;
    public static volatile SingularAttribute<RegistroVacuna, String> dosis;
    public static volatile SingularAttribute<RegistroVacuna, Vacuna> idVacuna;
    public static volatile SingularAttribute<RegistroVacuna, Integer> idRegistro;

}