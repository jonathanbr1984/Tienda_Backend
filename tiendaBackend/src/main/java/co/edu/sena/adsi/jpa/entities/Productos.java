/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1261718
 */
@Entity
@Table(name = "productos")

public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private int valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento")
    private int descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidadDisponible")
    private int cantidadDisponible;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productosId")
    private List<Detalles> detallesList;

    public Productos() {
    }

    public Productos(Integer id) {
        this.id = id;
    }

    public Productos(Integer id, String titulo, String marca, int valor, int descuento, int cantidadDisponible) {
        this.id = id;
        this.titulo = titulo;
        this.marca = marca;
        this.valor = valor;
        this.descuento = descuento;
        this.cantidadDisponible = cantidadDisponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
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
        return "co.edu.sena.adsi.jpa.entities.Productos[ id=" + id + " ]";
    }
    
}
