package ej_2;
//Ejercicio 2//
public class subClaseDocente extends AulasVirtualesPersona {
    private double sueldo;


    public subClaseDocente(String nombre, String apellido, int dni, String curso, String division, double sueldo) {
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
