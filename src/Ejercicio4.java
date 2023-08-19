import Ejercicio4.Baraja;
import Ejercicio4.CartaPoker;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;




public class Ejercicio4 {

  public static void main(String[] args) {
    try {
      System.setOut(new PrintStream(System.out, true, "UTF-8"));

      Baraja baraja = new Baraja();
      baraja.barajar();

      System.out.println("Cartas en la baraja: " + baraja.cantidadDeCartas());
      System.out.println(baraja);
      CartaPoker carta1 = baraja.repartirCarta();
      System.out.println("Repartiendo Carta 1: " + carta1);

      CartaPoker carta2 = baraja.repartirCarta();
      System.out.println("Repartiendo Carta 2: " + carta2);

      System.out.println(
        "Cartas en la baraja despues de repartir: " + baraja.cantidadDeCartas()
      );
    } catch (UnsupportedEncodingException e) {
      System.err.println(
        "No se pudo cambiar la codificacion de la consola a UTF-8"
      );
    }
  }
}
