package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baraja {

  private List<CartaPoker> cartas;

  public Baraja() {
    cartas = new ArrayList<>();
    inicializarBaraja();
  }

  private void inicializarBaraja() {
    for (Palo palo : Palo.values()) {
      for (int valor = 2; valor <= 10; valor++) {
        cartas.add(
          new CartaPoker(
            obtenerColorPalo(palo.toString()),
            String.valueOf(valor),
            palo
          )
        );
      }
      cartas.add(new CartaPoker(obtenerColorPalo(palo.toString()), "J", palo));
      cartas.add(new CartaPoker(obtenerColorPalo(palo.toString()), "Q", palo));
      cartas.add(new CartaPoker(obtenerColorPalo(palo.toString()), "K", palo));
      cartas.add(new CartaPoker(obtenerColorPalo(palo.toString()), "A", palo));
    }
  }

  private String obtenerColorPalo(String string) {
    return null;
  }

  public void barajar() {
    Random rand = new Random();
    for (int i = 0; i < cartas.size(); i++) {
      int j = rand.nextInt(cartas.size());
      CartaPoker temp = cartas.get(i);
      cartas.set(i, cartas.get(j));
      cartas.set(j, temp);
    }
  }

  public CartaPoker repartirCarta() {
    if (!cartas.isEmpty()) {
      return cartas.remove(0);
    }
    return null;
  }

  public int cantidadDeCartas() {
    return cartas.size();
  }

  @Override
  public String toString() {
    return "" + cartas ;
  }
}
