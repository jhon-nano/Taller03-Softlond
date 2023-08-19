package Ejercicio10;

public abstract class  Figura implements Dibujable{
    protected int x;
    protected int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}
