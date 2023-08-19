package Ejercicio9;

public class Piano extends InstrumentoMusical {

    public Piano(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println(nombre + " suena como un piano");
    }
    
}
