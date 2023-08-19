package Ejercicio10;

public class Lienzo {
    private Dibujable[] figuras;

    public Lienzo(Dibujable[] figuras) {
        this.figuras = figuras;
    }

    public void dibujarFiguras() {
        for (Dibujable figura : figuras) {
            figura.dibujar();
            if (figura instanceof Figura) {
                Figura figuraGeometrica = (Figura) figura;
                System.out.println("area: " + figuraGeometrica.calcularArea());
            }
        }
    }
}
