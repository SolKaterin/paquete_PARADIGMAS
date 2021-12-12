package ej_4.animales;

public class Pato extends Animales {

    private static String especie = "Pato";
    private String nombre;

    public Pato(String nombre) {
        super(nombre, Pato.especie);
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Pato.especie = especie;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String hacerRuido() {
        return "Cuak";
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println(" El metodo describir desde la clase Pato: " +
                " Nombre de animal: " + nombre + " Especie: " + especie);
    }

}
