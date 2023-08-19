package Ejercicio3;

public class CuentaCredito extends CuentaBase {

  private double tasaInteres;
  private double cupoMaximo;

  public CuentaCredito(
    String titular,
    String numeroCuenta,
    double saldo,
    double tasaInteres,
    double cupoMaximo
  ) {
    super(titular, numeroCuenta, saldo);
    this.tasaInteres = tasaInteres;
    this.cupoMaximo = cupoMaximo;
  }

  @Override
  public void retirar(double cantidad) {
    if (cantidad > 0 && cantidad <= cupoMaximo - getSaldo()) {
      double nuevoSaldo =
        getSaldo() + cantidad + (cantidad * (tasaInteres / 100));

      setSaldo(nuevoSaldo);
      System.out.println(
        "Retiro de $" +
        cantidad +
        " realizado en la cuenta " +
        getNumeroCuenta()
      );
    
      System.out.println("Cupo disponible: $" + (cupoMaximo - nuevoSaldo));
    } else {
      System.out.println(
        "Retiro de $" + cantidad + " en la cuenta " + getNumeroCuenta()
      );
      System.out.println("Cupo disponible: $" + (cupoMaximo - getSaldo()));
      System.out.println(
        "No se puede retirar una cantidad negativa, mayor al saldo o exceder el cupo."
      );
    }
  }

  @Override
  public void depositar(double cantidad) {
    if (cantidad > 0) {
      setSaldo(getSaldo() - cantidad);
      System.out.println(
        "Deposito de $" +
        cantidad +
        " realizado en la cuenta " +
        getNumeroCuenta()
      );
    } else {
      System.out.println("No se puede depositar una cantidad negativa o cero.");
    }
  }

  public void aplicarInteres() {
    double interes = getSaldo() * tasaInteres / 100;
    super.depositar(interes); // Registro del interés como depósito
    System.out.println("Interés aplicado: $" + interes);
  }

  @Override
  public double consultarSaldo() {
    return getSaldo();
  }

  @Override
  public String toString() {
    return (
      "[titular=" +
      this.getTitular() +
      ", numeroCuenta=" +
      getNumeroCuenta() +
      ", saldo=" +
      getSaldo() +
      "] \n" +
      "[tasaInteres=" +
      tasaInteres +
      ", cupoMaximo=" +
      cupoMaximo +
      "]"
    );
  }
}
