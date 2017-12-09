package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-09T16:34:56")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile ListAttribute<Usuarios, Factura> facturaList;
    public static volatile SingularAttribute<Usuarios, Integer> identificacion;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, String> nombres;

}