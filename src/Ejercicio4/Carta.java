package Ejercicio4;

abstract class Carta implements ICarta {

  private String color;
  private String valor;

  public Carta(String color, String valor) {
    this.color = color;
    this.valor = valor;
  }

  public abstract String mostrarCarta();

  public abstract int valorNumerico();

  public String getColor() {
    return color;
  }

  public String getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return "[" + valor + "]";
  }
}
