package Ejercicio5.Categorias;

import Ejercicio5.CategoriaProducto;
import Ejercicio5.Producto;
import Ejercicio5.Productos.ProductoElectronico;

public class Electronica extends CategoriaProducto {

  public Electronica() {
    super("Electronica");
  }

  @Override
  public Producto crearProducto(String nombre, int cantidad, double precio) {
    return new ProductoElectronico(nombre, cantidad, precio);
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
