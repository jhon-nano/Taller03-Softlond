package Ejercicio3;

public class CuentaAhorro extends CuentaBase {

  public CuentaAhorro(
    String titular,
    String numeroCuenta,
    double saldo
  ) {
    super(titular, numeroCuenta, saldo);
  }

  @Override
  public void retirar(double cantidad) {
    if (cantidad > 0 && getSaldo() >= cantidad) {
      double nuevoSaldo = getSaldo() - cantidad;
      setSaldo(nuevoSaldo);
      System.out.println(
        "Retiro de $" +
        cantidad +
        " realizado en la cuenta " +
        getNumeroCuenta()
      );

    } else {
      System.out.println(
        "No se puede retirar una cantidad negativa o mayor al saldo."
      );
    }
  }

  @Override
  public double consultarSaldo() {
    return getSaldo();
  }




  
}
