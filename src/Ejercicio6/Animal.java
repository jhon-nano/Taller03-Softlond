package Ejercicio6;

public abstract class Animal implements IAnimal {

  String nombre;
  int cant_patas;
  int edad;

  public Animal(String nombre, int cant_patas, int edad) {
    this.nombre = nombre;
    this.cant_patas = cant_patas;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getCant_patas() {
    return cant_patas;
  }

  public int getEdad() {
    return edad;
  }

  @Override
  public String toString() {
    return "Animal [nombre=" + nombre + ", cant_patas=" + cant_patas + ", edad=" + edad + "]";
  }


  
}
