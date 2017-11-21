package com.entidades;

import com.entidades.RegistroVacuna;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-15T22:30:57")
@StaticMetamodel(Vacuna.class)
public class Vacuna_ { 

    public static volatile SingularAttribute<Vacuna, String> descripcionVacuna;
    public static volatile CollectionAttribute<Vacuna, RegistroVacuna> registroVacunaCollection;
    public static volatile SingularAttribute<Vacuna, String> dosis;
    public static volatile SingularAttribute<Vacuna, String> codigoVacuna;

}