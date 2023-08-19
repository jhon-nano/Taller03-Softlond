package Ejercicio4;

enum Palo {
  CORAZONES,
  DIAMANTES,
  PICAS,
  TREBOLES,
}

public class CartaPoker extends Carta {

  Palo palo;

  public CartaPoker(String color, String valor, Palo palo) {
    super(color, valor);
    this.palo = palo;
  }

  @Override
  public String obtenerSimboloPalo(Palo palo) {
 
    switch (palo.toString()) {
      case "CORAZONES":
        return "\u2665"; // Simbolo de corazon
      case "DIAMANTES":
        return "\u2666"; // Simbolo de diamante
      case "PICAS":
        return "\u2660"; // Simbolo de pica
      case "TREBOLES":
        return "\u2663"; // Simbolo de trebol
      default:
        return "";
    }
  }

  @Override
  public String obtenerColorPalo(Palo palo) {
    switch (palo.toString()) {
      case "CORAZONES":
        return "red"; // Simbolo de corazon
      case "DIAMANTES":
        return "red"; // Simbolo de diamante
      case "PICAS":
        return "black"; // Simbolo de pica
      case "TREBOLES":
        return "black"; // Simbolo de trebol
      default:
        return "";
    }
  }

  public Palo getPalo() {
    return palo;
  }

  public void setPalo(Palo palo) {
    this.palo = palo;
  }

  @Override
  public int valorNumerico() {
    // Implementa la logica para asignar un valor numerico a la carta si es necesario
    return 0;
  }

  @Override
  public String mostrarCarta() {
    String simboloPalo = obtenerSimboloPalo(this.palo);

    return (getValor() + " " + simboloPalo);
  }

  @Override
  public String toString() {
    return "[" + obtenerSimboloPalo(palo) + this.getValor() + "]";
  }
}
