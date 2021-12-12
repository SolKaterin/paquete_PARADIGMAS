package ej_6.animales;

import ej_6.vehiculos.Volador;
import java.util.ArrayList;
import java.util.List;

abstract public class Animal {

    protected String nombre;
    protected static List<Animal> animales = new ArrayList<Animal>();

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String  getNombre() {
        return nombre;
    }

    public abstract void nadar();

    abstract void describir();

    public static List<Animal> dameAcuatico(List<Animal> animales) {
        List<Animal> acuatico = new ArrayList<Animal>();
        if ( animales.size()> 0 ) {
            for (Animal animal : animales) {
                if (animal instanceof Acuatico) {
                    acuatico.add(animal);
                }
            }
        }

        return acuatico;
    }

    public static void showDeAnimales(List<Animal> animales) {
        for (Animal animal : animales) {
            if (animal instanceof Acuatico) {
                ((Acuatico) animal).nadar();
            }	else if (animal instanceof Volador) {
                ((Volador) animal).volar();
            } else {
                System.out.println("El animal: " + animal.getNombre() + " no hace nada");
            }
        }
    }

    @Override
    public String toString() {
        return nombre;
    }

    public abstract void volar();
}
