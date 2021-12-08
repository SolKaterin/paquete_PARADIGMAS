package tercer_IDEA;
//Ejercicio 3//
public class Futbolista_3_objeto {

    public static void main(String[] args) {

        Futbolista_3 lampe = new Futbolista_3("Lampe", "Velez", 0);
        lampe.anotarGol();
        lampe.anotarGol();
        System.out.println(Futbolista_3.getMaximoGoleador().getNombre());

        Futbolista_3 janson = new Futbolista_3("Janson", "Velez", 1);
        janson.anotarGol();
        janson.anotarGol();
        System.out.println(Futbolista_3.getMaximoGoleador().getNombre());

        Futbolista_3 versaci = new Futbolista_3("Versaci", "Velez", 1);
        versaci.anotarGol();
        versaci.anotarGol();
        System.out.println(Futbolista_3.getMaximoGoleador().getNombre());

    }

}
