package entity;

import java.math.BigDecimal;

import jakarta.*;

class Plato {
    int id;
    String nombre;
    String descripcion;
    BigDecimal precio;
    boolean disponible;

    public Plato(String nombre, String descripcion, BigDecimal precio, boolean disponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

}