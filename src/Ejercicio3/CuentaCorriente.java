package Ejercicio3;

public class CuentaCorriente extends CuentaBase {



  public CuentaCorriente(
    String titular,
    String numeroCuenta,
    double saldo,
    double limiteCredito
  ) {
    super(titular, numeroCuenta, saldo);
   
  }

  @Override
  public void retirar(double cantidad) {
    if (cantidad > 0 && (getSaldo()) >= cantidad) {
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
        "No se puede retirar una cantidad negativa o mayor al saldo disponible."
      );
    }
  }

  @Override
  public double consultarSaldo() {
    return getSaldo();
  }

 
}
