package Ejercicio7;

abstract class Figura implements IFiguraGeometrica{

    private String nombre;
    private String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Color: " + color;
    }
    
}
