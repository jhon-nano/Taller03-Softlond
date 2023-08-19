package Ejercicio8;

public class EmpleadoAsalariado extends Empleado {

  private double salarioMensual;

  public EmpleadoAsalariado(String nombre, double salarioMensual) {
    super(nombre);
    this.salarioMensual = salarioMensual;
  }

  @Override
  public double calcularSalario() {
    return salarioMensual;
  }

  @Override
  public String toString() {
    return (
      "EmpleadoAsalariado [" +
      nombre +
      "=" +
      salarioMensual +
      "]" +
      calcularSalario()
    );
  }
}
