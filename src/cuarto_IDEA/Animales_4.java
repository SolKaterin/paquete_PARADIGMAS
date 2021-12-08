package cuarto_IDEA;
//Ejercicio 4//
import java.util.ArrayList;
import java.util.List;
abstract public class Animales_4 {
    protected String nombre;
    protected String especie;
    protected static List<Animales_4> listaAnimales = new ArrayList<Animales_4>();

    public Animales_4 (String nombre, String especie){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Animales_4> getListaAnimales() {
        return listaAnimales;
    }

    public static void setListaAnimales(List<Animales_4> listaAnimales) {
        Animales_4.listaAnimales = listaAnimales;
    }

    abstract public String hacerRuido();

    public void describir(){

        System.out.println(" Descripción de un animal");

    }

    public static void agregarAnimal(Animales_4 animal){

        Animales_4.getListaAnimales().add(animal);

    }

    public static void  escucharTodos(List<Animales_4> listaAnimales) {
        listaAnimales = Animales_4.getListaAnimales();

        for (Animales_4 animal : listaAnimales) {
            System.out.println((animal.getNombre() + " hace: " + animal.hacerRuido()));
        }
    }
}
