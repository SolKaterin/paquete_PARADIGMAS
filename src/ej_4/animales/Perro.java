package ej_4.animales;

public class Perro extends Animales {

    protected static String especie = "Guau";
    protected String nombre;

    public Perro(String nombre) {
        super(nombre, Perro.especie);
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Perro.especie = especie;
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
        return "Guau";
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println(" El metodo describir desde la clase Perro: " +
                " Nombre de animal: " + nombre + " Especie: " + especie );
    }

}
