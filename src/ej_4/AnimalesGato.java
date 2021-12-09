package ej_4;
//Ejercicio 4//
public class AnimalesGato extends Animales {

    protected static String especie = "Gato";
    protected String nombre;

    public AnimalesGato(String nombre) {
        super(nombre, AnimalesGato.especie);
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        AnimalesGato.especie = especie;
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
        return "Miau";
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println(" El metodo describir desde la clase Gato: " +
                " Nombre de animal: " + nombre + " Especie: " + especie );
    }

}
