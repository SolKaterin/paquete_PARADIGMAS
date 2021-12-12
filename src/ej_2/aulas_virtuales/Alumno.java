package ej_2.aulas_virtuales;

public class Alumno extends Persona {

    private int numero_de_legajo;

    public Alumno(String nombre, String apellido, int dni, String curso, String division, int numero_de_legajo) {
        super(nombre, apellido, dni, curso, division);
        this.numero_de_legajo = numero_de_legajo;
    }

    public int getNumero_de_legajo() {
        return numero_de_legajo;
    }

    public void setNumero_de_legajo(int numero_de_legajo) {
        this.numero_de_legajo = numero_de_legajo;
    }
}
