package Ejercicio5;

public abstract class CategoriaProducto implements Producto {
    String nombre;

    public CategoriaProducto(String nombre) {
        this.nombre = nombre;
    }

    public abstract Producto crearProducto(String nombre,int cantidad, double precio);
}