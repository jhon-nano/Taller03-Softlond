package Ejercicio9;

public class Orquesta {
    public static void hacerTocar(InstrumentoMusical[] instrumentos) {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
