package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Factura;
import co.edu.sena.adsi.jpa.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-09T16:34:56")
@StaticMetamodel(Detalles.class)
public class Detalles_ { 

    public static volatile SingularAttribute<Detalles, Factura> facturaId;
    public static volatile SingularAttribute<Detalles, Double> subtotal;
    public static volatile SingularAttribute<Detalles, Integer> id;
    public static volatile SingularAttribute<Detalles, Double> cantidad;
    public static volatile SingularAttribute<Detalles, Productos> productosId;

}