package Ejercicio8;

public class CalculadoraSalario {
    public static double calcularSalarioTotal(Empleado[] empleados) {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            salarioTotal += empleado.calcularSalario();
        }
        return salarioTotal;
    }
}
