package entity;

import java.time.LocalDate;



public class Pedido {
int id;
LocalDate fecha;
String estado;
String direccionEntrega;
public Pedido(LocalDate fecha, String estado, String direccionEntrega) {
    this.fecha = fecha;
    this.estado = estado;
    this.direccionEntrega = direccionEntrega;
}
public int getId() {
    return id;
}
public LocalDate getFecha() {
    return fecha;
}
public String getEstado() {
    return estado;
}
public String getDireccionEntrega() {
    return direccionEntrega;
}


    
}