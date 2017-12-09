package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Detalles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-09T16:34:56")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> marca;
    public static volatile SingularAttribute<Productos, Integer> descuento;
    public static volatile SingularAttribute<Productos, Integer> valor;
    public static volatile SingularAttribute<Productos, String> titulo;
    public static volatile SingularAttribute<Productos, Integer> id;
    public static volatile ListAttribute<Productos, Detalles> detallesList;
    public static volatile SingularAttribute<Productos, Integer> cantidadDisponible;

}