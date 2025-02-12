package modelo;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto() {}

    public Producto(int id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    
}
