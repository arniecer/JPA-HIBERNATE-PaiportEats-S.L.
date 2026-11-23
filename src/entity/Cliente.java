package entity;


public class Cliente {
    int id;
    String nombre;
    String email;
    int telefono;
    String direccion;
    public Cliente(String nombre, String email, int telefono, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    

    
}