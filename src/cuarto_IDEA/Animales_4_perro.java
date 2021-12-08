package cuarto_IDEA;
//Ejercicio 4//
public class Animales_4_perro extends Animales_4 {

    protected static String especie = "Guau";
    protected String nombre;

    public Animales_4_perro(String nombre) {
        super(nombre, Animales_4_perro.especie);
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Animales_4_perro.especie = especie;
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
