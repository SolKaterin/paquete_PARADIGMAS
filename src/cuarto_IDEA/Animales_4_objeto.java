package cuarto_IDEA;
//Ejercicio 4//
public class Animales_4_objeto {

    public static void main(String[] args) {

        Animales_4 gato = new Animales_4_gato ("Olulet");
        gato.describir();

        Animales_4 pato = new Animales_4_pato("Abbondanzieri");
        pato.describir();

        Animales_4 perro = new Animales_4_perro("Roco");
        perro.describir();

        Animales_4.agregarAnimal(gato);
        Animales_4.agregarAnimal(pato);
        Animales_4.agregarAnimal(perro);

        Animales_4.escucharTodos(Animales_4.getListaAnimales());

        //Ejercicios_5//

        String olulet = gato.nombre;
        String abbondanzieri = pato.nombre;
        String roco = perro.nombre;
        System.out.println(" gato: " + olulet + " pato: "+ abbondanzieri + " perro: " + roco );

    }

}
