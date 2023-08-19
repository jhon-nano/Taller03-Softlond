package Ejercicio9;

public class Violin extends InstrumentoMusical {

    public Violin(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + " suena como un violin");
    }
    
}
