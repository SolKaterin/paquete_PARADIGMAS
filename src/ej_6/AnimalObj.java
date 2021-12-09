package ej_6;
//Ejercicio 6//
import java.util.List;
public class AnimalObj {

    public static void main(String[] args) {

        Animal subclasePez = new subclasePez("Dory");
        Animal subclaseAve = new subclaseAve("Poly");
        Animal subclaseGato = new subclaseGato("Olulet");

        Animal.animales.add(subclaseAve);
        Animal.animales.add(subclaseGato);
        Animal.animales.add(subclasePez);

        List<Animal> animalAcuatico = Animal.dameAcuatico(Animal.animales);

        for (Animal animal : animalAcuatico) {

            System.out.println(animal);
        }

        Animal.showDeAnimales(Animal.animales);

    }

}
