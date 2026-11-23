package entity;

public class Ingrediente {
int id;
String nombre;
boolean esVegetariano;
public Ingrediente(String nombre, boolean esVegetariano) {
    this.nombre = nombre;
    this.esVegetariano = esVegetariano;
}
public int getId() {
    return id;
}
public String getNombre() {
    return nombre;
}
public boolean isEsVegetariano() {
    return esVegetariano;
}

     
}