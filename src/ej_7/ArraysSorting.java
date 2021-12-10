package ej_7;
//Ejercicio 7//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArraysSorting {

    public static void main(String[] args) {

        int [] enteros = new int[5];

        enteros[0] = 1;
        enteros[1] = 4;
        enteros[2] = 5;
        enteros[3] = 3;
        enteros[4] = 2;

        Integer [] entero = new Integer[5];
        for(int i = 0; i < enteros.length; i++) {
            entero[i] = enteros[i];
        }

        List<Integer>listEntero = Arrays.asList(entero);
        Arrays.sort(entero);
        System.out.println("El array en la listEntero: " + listEntero);

        List<Integer> listInteger = new ArrayList<Integer>();

        listInteger.add(0, 10 );
        listInteger.add(1, 14);
        listInteger.add(2, 12);
        listInteger.add(3, 13);
        listInteger.add(4, 11);

        System.out.println("Lista ordenada de enteros: ");
        Collections.sort(listInteger);
        for(Integer i : listInteger) {
            System.out.print(i + " ");
        }

        System.out.println("Array ordenado de objetos:");
        Object[] arrayDeInts = listInteger.toArray();
        for (Object i : arrayDeInts) {
            System.out.print(i + " ");
        }

    }

}
