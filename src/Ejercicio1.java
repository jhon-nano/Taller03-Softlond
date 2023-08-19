
import Ejercicio1.IFiguraGeometrica;
import Ejercicio1.Circulo;
import Ejercicio1.Cuadrado;
import Ejercicio1.Rectangulo;
import Ejercicio1.Triangulo;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        IFiguraGeometrica circulo1 = new Circulo("Circulo ", "Rojo", 5);
        IFiguraGeometrica triangulo1 = new Triangulo("Triangulo", "Azul", 5, 2, 3);
        IFiguraGeometrica triangulo2 = new Triangulo("Triangulo Equilatero", "Azul", 5, 5, 5);
        IFiguraGeometrica rectangulo1 = new Rectangulo("Rectangulo Grande", "Verde", 8, 6);
        IFiguraGeometrica cuadrado1 = new Cuadrado("Cuadrado", "verde", 3);

        IFiguraGeometrica[] figuras = { circulo1, triangulo1, triangulo2, rectangulo1, cuadrado1 };

        for (IFiguraGeometrica figura : figuras) {

            figura.dibujar();
            System.out.println(figura);
            System.out.println("area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());

            if (figura instanceof Circulo) {
                Circulo circuloActual = (Circulo) figura;
                System.out.println("Radio: " + circuloActual.getRadio());
            } else if (figura instanceof Triangulo) {
                Triangulo trianguloActual = (Triangulo) figura;
                System.out.println("Es equilatero: " + trianguloActual.esEquilatero());
            } else if (figura instanceof Rectangulo) {
                Rectangulo rectanguloActual = (Rectangulo) figura;
                System.out.println("Base: " + rectanguloActual.getBase());
                System.out.println("Altura: " + rectanguloActual.getAltura());
            } else if (figura instanceof Cuadrado) {
                Cuadrado cuadradoActual = (Cuadrado) figura;
                System.out.println("Lado: " + cuadradoActual.getLado());
            }

            System.out.println();
        }
    }
}
