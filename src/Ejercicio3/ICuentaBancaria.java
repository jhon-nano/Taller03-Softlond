package Ejercicio3;

public interface ICuentaBancaria {

    void depositar(double cantidad);

    void retirar(double cantidad);

    double consultarSaldo();

    String getNumeroCuenta();
}
