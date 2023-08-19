import Ejercicio9.Guitarra;
import Ejercicio9.InstrumentoMusical;
import Ejercicio9.Orquesta;
import Ejercicio9.Piano;
import Ejercicio9.Violin;

public class Ejercicio9 {
    public static void main(String[] args) {
         InstrumentoMusical[] instrumentos = {
            new Guitarra("Guitarra electrica"),
            new Piano("Piano de cola"),
            new Violin("Violin Stradivarius")
        };

        Orquesta.hacerTocar(instrumentos);
    }
}
