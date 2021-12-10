package ej_7;
//Ejercicio 7//
import java.util.LinkedList;
import java.util.List;
public class ListaDeStrings {

    public static void main(String[] args) {

        List<String> lista = new LinkedList<String>();
        addToList(lista, "Pedro");
        addToList(lista,"Juan","Jacob","Lucia","Raquel");

        classicFor(lista);
        collectionsFor(lista);

        setList(lista, "Esmeralda", 0);
        setList(lista, "Anastacia", 1);
        setList(lista, "Flora", 2);
        collectionsFor(lista);

        lista.remove(0);
        lista.remove(1);
        collectionsFor(lista);

        setList(lista, "Raquel", 0);
        collectionsFor(lista);
        lista.remove("Raquel");
        collectionsFor(lista);

        System.out.println(lista.contains("Raquel")); System.out.println();

        addToList(lista,"Anastacia","Anastacia","Anastacia","Maria");
        collectionsFor(lista);

        deleteAll(lista,"Anastacia");
        classicFor(lista);

        System.out.println(lista.contains("Anastacia"));

    }

    private static void addToList(List<String> lista,String elemento) {
        lista.add(elemento);
    }
    private static void addToList(List<String> lista,String elemento1,String elemento2,String elemento3,String elemento4) {
        lista.add(elemento1);
        lista.add(elemento2);
        lista.add(elemento3);
        lista.add(elemento4);
    }

    private static void setList(List<String> lista, String reemplazo, int indice) {
        lista.set(indice, reemplazo);
    }

    private static void classicFor(List<String> lista) {
        for(int i = 0; i < lista.size(); i ++) {
            System.out.println(lista.get(i));
        } System.out.println();
    }

    private static void collectionsFor(List<String> lista) {
        for (String persona : lista) {
            System.out.println(persona);
        } System.out.println();
    }

    private static void deleteAll(List<String> lista, String nombre) {
        for (int i = 0; i < lista.size(); i ++) {
            if(lista.contains(nombre)) {
                if (lista.get(i).equals(nombre)) {
                    lista.remove(i);
                }
            }
        }
        if(lista.contains(nombre)) {
            lista.remove(nombre);
        }

    }

}
