package ej_3;
//Ejercicio 3//
public class Futbolista {
    private String nombre;
    private String equipo;
    private int cantidadDeGoles;
    private static Futbolista maximoGoleador = null;

    public Futbolista(String nombre, String equipo, int cantidadDeGoles) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.cantidadDeGoles = cantidadDeGoles;
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getEquipo() {

        return equipo;

    }

    public void setEquipo(String equipo) {

        this.equipo = equipo;

    }

    public int getFutbolista_3() {

        return cantidadDeGoles;

    }

    public static Futbolista getMaximoGoleador() {

        return maximoGoleador;

    }

    static void setMaximoGoleador(Futbolista maximoGoleador) {


        Futbolista.maximoGoleador = maximoGoleador;

    }

    public void anotarGol() {
        this.cantidadDeGoles++;

        if (this.cantidadDeGoles > Futbolista.maximoGoleador.cantidadDeGoles) {
            Futbolista.setMaximoGoleador(this);
        }

    }
    public static void main(String[] args) {

    }
}
