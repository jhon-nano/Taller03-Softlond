package Ejercicio6;

public class Perro extends Animal {

  public Perro(String nombre, int cant_patas, int edad) {
    super(nombre, cant_patas, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println("guau guau");
    
  }

  @Override
  public void caminar() {
    System.out.println("El perro esta Caminando...");
  }
}
