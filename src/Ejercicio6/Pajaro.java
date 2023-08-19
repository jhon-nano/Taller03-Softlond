package Ejercicio6;

public class Pajaro extends Animal {

    public Pajaro(String nombre, int cant_patas, int edad) {
        super(nombre, cant_patas, edad);

    }

    @Override
    public void hacerSonido() {

        System.out.println("chirp-chirp");
    }

    @Override
    public void caminar() {
      
        System.out.println("El pajaro esta Caminando...");
    }
    
}
