package ej_4;
//Ejercicio 4//
public class AnimalesObj {

    public static void main(String[] args) {

        Animales gato = new AnimalesGato("Olulet");
        gato.describir();

        Animales pato = new AnimalesPato("Abbondanzieri");
        pato.describir();

        Animales perro = new AnimalesPerro("Roco");
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
