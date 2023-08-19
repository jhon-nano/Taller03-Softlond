package Ejercicio10;

public class Circulo extends Figura {

    private double radio;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo en (" + x + ", " + y + ")");
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
