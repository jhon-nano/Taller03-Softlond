package Ejercicio9;

public class Guitarra extends InstrumentoMusical {

    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + " suena como una guitarra");
    }
}
