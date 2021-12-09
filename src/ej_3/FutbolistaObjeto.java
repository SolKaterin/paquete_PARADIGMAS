package ej_3;
//Ejercicio 3//
public class FutbolistaObjeto {

    public static void main(String[] args) {

        Futbolista lampe = new Futbolista("Lampe", "Velez", 0);
        lampe.anotarGol();
        lampe.anotarGol();
        System.out.println(Futbolista.getMaximoGoleador().getNombre());

        Futbolista janson = new Futbolista("Janson", "Velez", 1);
        janson.anotarGol();
        janson.anotarGol();
        System.out.println(Futbolista.getMaximoGoleador().getNombre());

        Futbolista versaci = new Futbolista("Versaci", "Velez", 1);
        versaci.anotarGol();
        versaci.anotarGol();
        System.out.println(Futbolista.getMaximoGoleador().getNombre());

        //Ejercicios_5//
        String Lampe = lampe.nombre;
        String Janson = janson.nombre;
        String Versaci = versaci.nombre;
        System.out.println(" Nombre1: " + Lampe + " Nombre2: "+ Janson + " Nombre3: " + Versaci );

    }

}
