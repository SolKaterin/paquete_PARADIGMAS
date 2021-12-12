package ej_6.animales;

import java.util.List;
public class Objeto {

    public static void main(String[] args) {

        Animal Pez = new Pez("Dory");
        Animal Ave = new Ave("Poly");
        Animal Gato = new Gato("Olulet");

        Animal.animales.add(Ave);
        Animal.animales.add(Gato);
        Animal.animales.add(Pez);

        List<Animal> animalAcuatico = Animal.dameAcuatico(Animal.animales);

        for (Animal animal : animalAcuatico) {

            System.out.println(animal);
        }

        Animal.showDeAnimales(Animal.animales);

    }

}
