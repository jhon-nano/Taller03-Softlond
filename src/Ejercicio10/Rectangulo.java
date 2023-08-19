package Ejercicio10;

public class Rectangulo extends Figura {

  private int ancho;
  private int alto;

  public Rectangulo(int x, int y, int ancho, int alto) {
    super(x, y);
    this.ancho = ancho;
    this.alto = alto;
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando un rectangulo en (" + x + ", " + y + ")");
  }

  @Override
  public double calcularArea() {
    return ancho * alto;
  }
}
