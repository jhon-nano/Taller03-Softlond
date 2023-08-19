package Ejercicio6;

public class Gato extends Animal {

  public Gato(String nombre, int cant_patas, int edad) {
    super(nombre, cant_patas, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println("Miau Miau Miau");
  }

  @Override
  public void caminar() {
  System.out.println("El gato esta Caminando.");
  }
}
