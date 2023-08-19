package Ejercicio5.Categorias;

import Ejercicio5.CategoriaProducto;
import Ejercicio5.Producto;
import Ejercicio5.Productos.ProductoRopa;

public class Ropa extends CategoriaProducto {

  public Ropa() {
    super("Ropa");
  }

  // Override the crearProducto method with proper access modifier
  @Override
  public Producto crearProducto(String nombre, int cantidad, double precio) {
    return new ProductoRopa(nombre, cantidad, precio);
  }

  @Override
  public double calcularPrecio() {
    return this.calcularPrecio();
  }

  @Override
  public void mostrarDetalles() {
    this.mostrarDetalles();
  }
}
