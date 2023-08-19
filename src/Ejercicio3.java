import Ejercicio3.CuentaAhorro;
import Ejercicio3.CuentaCorriente;
import Ejercicio3.CuentaCredito;
import Ejercicio3.ICuentaBancaria;

public class Ejercicio3 {

  public static void main(String[] args) {
    ICuentaBancaria cuentaAhorro = new CuentaAhorro(
      "Jhon Sanchez",
      "123456",
      1000
    );
    ICuentaBancaria cuentaCorriente = new CuentaCorriente(
      "Juan Rodriguez",
      "654321",
      500,
      1000
    );
    ICuentaBancaria cuentaCredito = new CuentaCredito(
      "Federico Giraldo",
      "78678987",
      500,
      1.5,
      500
    );
    ICuentaBancaria cuentaCredito1 = new CuentaCredito(
      "Maria Herrera",
      "4563442",
      500,
      1.5,
      2000
    );
    System.out.println(
      "------------------------------------------------------------------"
    );
    System.out.println("Cuenta Ahorros.");
    operarCuenta(cuentaAhorro, 200);
    System.out.println("Cuenta Corriente.");
    operarCuenta(cuentaCorriente, 700);
    System.out.println("Cuenta Credito.");
    operarCuenta(cuentaCredito, 200);
      System.out.println("Cuenta Credito.");
    operarCuenta(cuentaCredito1, 200);
  }

  public static void operarCuenta(ICuentaBancaria cuenta, double cantidad) {
    System.out.println(cuenta);
    System.out.println(
      "------------------------------------------------------------------"
    );
    cuenta.depositar(cantidad);
    System.out.println("\u2022 Saldo: " + cuenta.consultarSaldo());
    cuenta.retirar(300);
    System.out.println("\u2022 Saldo: " + cuenta.consultarSaldo());
    System.out.println(
      "------------------------------------------------------------------"
    );
  }
}
