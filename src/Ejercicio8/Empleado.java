package Ejercicio8;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + "]";
    }

    
}
