package ej_2.aulas_virtuales;

public class Docente extends Persona{
    private double sueldo;


    public Docente(String nombre, String apellido, int dni, String curso, String division, double sueldo) {
        super(nombre, apellido, dni, curso, division);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
