package Ejercicio5.Productos;

import Ejercicio5.Producto;

public class ProductoElectronico implements Producto {

  String nombre;
  int cantidad;
  double precio;

  public ProductoElectronico(String nombre, int cantidad, double precio) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
  }

  @Override
  public double calcularPrecio() {
    return precio * cantidad;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("Categoria: Electronica");
    System.out.println("-------------------------");
    System.out.println("Nombre: " + nombre);
    System.out.println("Cantidad: " + cantidad);
    System.out.println("Precio: $" + precio);
  }
}
