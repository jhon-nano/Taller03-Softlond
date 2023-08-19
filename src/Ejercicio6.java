import Ejercicio6.Gato;
import Ejercicio6.IAnimal;
import Ejercicio6.Pajaro;
import Ejercicio6.Perro;
import Ejercicio6.Serpiente;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

  public static void main(String[] args) {
    List<IAnimal> animales = new ArrayList<>();

    animales.add(new Gato("gato1", 4, 2));
    animales.add(new Pajaro("pajaro", 2, 1));
    animales.add(new Perro("perro", 4, 3));
    animales.add(new Serpiente("serpiente", 0, 1));
    
    System.out.println("Lista de Animales:");
    System.out.println(animales);
    for (IAnimal animal : animales) {
      System.out.println(animal);
      animal.hacerSonido();
      animal.caminar();
    }
    System.out.println("-----------------------------------------");


  }
}
