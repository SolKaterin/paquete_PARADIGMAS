package ej_4;
//Ejercicio 4//
import java.util.ArrayList;
import java.util.List;
abstract public class Animales {
    protected String nombre;
    protected String especie;
    protected static List<Animales> listaAnimales = new ArrayList<Animales>();

    public Animales(String nombre, String especie){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Animales> getListaAnimales() {
        return listaAnimales;
    }

    public static void setListaAnimales(List<Animales> listaAnimales) {
        Animales.listaAnimales = listaAnimales;
    }

    abstract public String hacerRuido();

    public void describir(){

        System.out.println(" Descripción de un animal");

    }

    public static void agregarAnimal(Animales animal){

        Animales.getListaAnimales().add(animal);

    }

    public static void  escucharTodos(List<Animales> listaAnimales) {
        listaAnimales = Animales.getListaAnimales();

        for (Animales animal : listaAnimales) {
            System.out.println((animal.getNombre() + " hace: " + animal.hacerRuido()));
        }
    }
}
