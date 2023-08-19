package Ejercicio8;

public class EmpleadoPorHoras extends Empleado {

  private double tarifaPorHora;
  private int horasTrabajadas;

  public EmpleadoPorHoras(
    String nombre,
    double tarifaPorHora,
    int horasTrabajadas
  ) {
    super(nombre);
    this.tarifaPorHora = tarifaPorHora;
    this.horasTrabajadas = horasTrabajadas;
  }

  @Override
  public double calcularSalario() {
    return tarifaPorHora * horasTrabajadas;
  }

  @Override
  public String toString() {
    return (
      "EmpleadoPorHoras [" +
      nombre +
      "=" +
      tarifaPorHora +
      ", horasTrabajadas=" +
      horasTrabajadas +
      "] Total: " +
      calcularSalario()
    );
  }
}
