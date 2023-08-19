package Ejercicio7;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado...");
    }
}
