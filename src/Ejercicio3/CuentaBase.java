package Ejercicio3;

abstract class CuentaBase implements ICuentaBancaria {

  private String titular;
  private String numeroCuenta;
  private double saldo;

  public CuentaBase(String titular, String numeroCuenta, double saldo) {
    this.titular = titular;
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getTitular() {
    return titular;
  }

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public void depositar(double cantidad) {
    if (cantidad > 0) {
      saldo += cantidad;
      System.out.println(
        "Deposito de $" + cantidad + " realizado en la cuenta " + numeroCuenta
      );
    } else {
      System.out.println("No se puede depositar una cantidad negativa o cero.");
    }
  }

  @Override
  public String toString() {
    return (
      "[titular=" +
      titular +
      ", numeroCuenta=" +
      numeroCuenta +
      ", saldo=" +
      saldo +
      "]"
    );
  }
}
