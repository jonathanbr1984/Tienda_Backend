/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1261718
 */
@Entity
@Table(name = "factura")

public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private double total;
    @JoinColumn(name = "usuarios_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuariosId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaId")
    private List<Detalles> detallesList;

    public Factura() {
    }

    public Factura(Integer id) {
        this.id = id;
    }

    public Factura(Integer id, Date fecha, double total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Usuarios getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Usuarios usuariosId) {
        this.usuariosId = usuariosId;
    }

    @XmlTransient
    public List<Detalles> getDetallesList() {
        return detallesList;
    }

    public void setDetallesList(List<Detalles> detallesList) {
        this.detallesList = detallesList;
    }

  
    @Override
    public String toString() {
        return "co.edu.sena.adsi.jpa.entities.Factura[ id=" + id + " ]";
    }
    
}
