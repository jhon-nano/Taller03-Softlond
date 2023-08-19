import Ejercicio5.CategoriaProducto;
import Ejercicio5.Categorias.Electronica;
import Ejercicio5.Categorias.Ropa;
import Ejercicio5.Producto;

public class Ejercicio5 {

  public static void main(String[] args) {
    CategoriaProducto categoriaElectronica = new Electronica();
    CategoriaProducto categoriaRopa = new Ropa();

    Producto producto1 = categoriaElectronica.crearProducto(
      "Smartphone",
      5,
      599.99
    );

    Producto producto2 = categoriaRopa.crearProducto("Camiseta", 3, 19.99);
    System.out.println("-------------------------");
    producto1.mostrarDetalles();
    System.out.println("Precio Total: $" + producto1.calcularPrecio());
    System.out.println("-------------------------");
    producto2.mostrarDetalles();
    System.out.println("Precio Total: $" + producto2.calcularPrecio());
    System.out.println("-------------------------");
  }
}
