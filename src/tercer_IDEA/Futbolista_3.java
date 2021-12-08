package tercer_IDEA;
//Ejercicio 3//
public class Futbolista_3 {
    private String nombre;
    private String equipo;
    private int cantidadDeGoles;
    private static  Futbolista_3 maximoGoleador = null;

    public Futbolista_3(String nombre, String equipo, int cantidadDeGoles) {
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

    public static Futbolista_3 getMaximoGoleador() {

        return maximoGoleador;

    }

    static void setMaximoGoleador(Futbolista_3 maximoGoleador) {


        Futbolista_3.maximoGoleador = maximoGoleador;

    }

    public void anotarGol() {
        this.cantidadDeGoles++;

        if (this.cantidadDeGoles > Futbolista_3.maximoGoleador.cantidadDeGoles) {
            Futbolista_3.setMaximoGoleador(this);
        }

    }
    public static void main(String[] args) {

    }
}
