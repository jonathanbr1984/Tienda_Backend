package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Detalles;
import co.edu.sena.adsi.jpa.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-09T16:34:56")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Double> total;
    public static volatile SingularAttribute<Factura, Usuarios> usuariosId;
    public static volatile SingularAttribute<Factura, Integer> id;
    public static volatile ListAttribute<Factura, Detalles> detallesList;

}