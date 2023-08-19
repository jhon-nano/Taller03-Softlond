import Ejercicio10.Circulo;
import Ejercicio10.Dibujable;
import Ejercicio10.Lienzo;
import Ejercicio10.Rectangulo;

public class Ejercicio10 {

  public static void main(String[] args) {
    Dibujable[] figuras = {
      new Circulo(10, 10, 5.0),
      new Rectangulo(20, 30, 8, 12),
    };

    Lienzo lienzo = new Lienzo(figuras);
    lienzo.dibujarFiguras();
  }
}
