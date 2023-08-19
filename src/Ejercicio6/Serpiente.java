package Ejercicio6;

public class Serpiente extends Animal {

    public Serpiente(String nombre, int cant_patas, int edad) {
        super(nombre, cant_patas, edad);
      
    }

    @Override
    public void hacerSonido() {
    
        System.out.println("ssssssssssss");
    }

    @Override
    public void caminar() {
 
        System.out.println("La serpiente se esta deslizando...");
    }
    
}
