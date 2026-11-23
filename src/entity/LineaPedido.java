package entity;

import java.math.BigDecimal;

public class LineaPedido {
int id;
int cantidad;
BigDecimal precioUnitario;
public LineaPedido(int cantidad, BigDecimal precioUnitario) {
    this.cantidad = cantidad;
    this.precioUnitario = precioUnitario;
}
public int getId() {
    return id;
}
public int getCantidad() {
    return cantidad;
}
public BigDecimal getPrecioUnitario() {
    return precioUnitario;
}
    
}