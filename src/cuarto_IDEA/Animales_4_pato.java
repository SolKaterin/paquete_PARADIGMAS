package cuarto_IDEA;
//Ejercicio 4//
public class Animales_4_pato extends Animales_4{

    private static String especie = "Pato";
    private String nombre;

    public Animales_4_pato(String nombre) {
        super(nombre, Animales_4_pato.especie);
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Animales_4_pato.especie = especie;
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
