package Ejercicio7;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo...");
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}