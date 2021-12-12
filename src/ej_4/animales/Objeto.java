package ej_4.animales;

public class Objeto {

    public static void main(String[] args) {

        Animales gato = new Gato("Olulet");
        gato.describir();

        Animales pato = new Pato("Abbondanzieri");
        pato.describir();

        Animales perro = new Perro("Roco");
        perro.describir();

        Animales.agregarAnimal(gato);
        Animales.agregarAnimal(pato);
        Animales.agregarAnimal(perro);

        Animales.escucharTodos(Animales.getListaAnimales());

        //Ejercicios_5//
        String olulet = gato.nombre;
        String abbondanzieri = pato.nombre;
        String roco = perro.nombre;
        System.out.println(" gato: " + olulet + " pato: "+ abbondanzieri + " perro: " + roco );

    }

}
