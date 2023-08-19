import Ejercicio8.CalculadoraSalario;
import Ejercicio8.Empleado;
import Ejercicio8.EmpleadoAsalariado;
import Ejercicio8.EmpleadoPorHoras;

public class Ejercicio8 {

  public static void main(String[] args) {
    Empleado[] empleados = {
      new EmpleadoAsalariado("Juan", 5000),
        new EmpleadoAsalariado("Juan", 3000),
      new EmpleadoPorHoras("Maria", 15, 40),
      new EmpleadoPorHoras("Carlos", 20, 40),
    };

    double salarioTotal = CalculadoraSalario.calcularSalarioTotal(empleados);
    System.out.println(
      "Salario total de todos los empleados: $" + salarioTotal
    );
  }
}
