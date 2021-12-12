package ej_6.sorting;

import java.util.ArrayList;
import java.util.List;

public class Objeto {
    public static void main(String [] args) {

        Ordenable par1 = new Par(1,3);
        Ordenable par2 = new Par(5,7);
        Ordenable par3 = new Par(2,4);
        List<Object> list = new ArrayList<Object>();
        list.add(par1);
        list.add(par2);
        list.add(par3);

        System.out.println("Lista de par desordenados:");
        for (Object p : list) {
            System.out.println(p);
        }

        System.out.println("Lista de par ordenados:");
        Buble.bubbleSort(list);
        for (Object p : list) {
            System.out.println(p);
        }

        Ordenable parSuma1 = new ParSuma(9,7);
        Ordenable parSuma2 = new ParSuma(4,2);
        Ordenable parSuma3 = new ParSuma(7,3);
        List<Object> sumaList = new ArrayList<Object>();
        sumaList.add(parSuma1);
        sumaList.add(parSuma2);
        sumaList.add(parSuma3);

        System.out.println("Lista de par suma desordenado:");
        for (Object p : sumaList) {
            System.out.println(p);
        }

        System.out.println("Lista de par suma ordenado:");
        Buble.bubbleSort(sumaList);
        for (Object p : sumaList) {
            System.out.println(p);
        }

        Ordenable persona1 = new Persona(11223344, true);
        Ordenable persona2 = new Persona(33445566, true);
        Ordenable persona3 = new Persona(22334455, false);
        List<Object> personaList = new ArrayList<Object>();
        personaList.add(persona1);
        personaList.add(persona2);
        personaList.add(persona3);

        System.out.println("Lista de persona desordenado:");
        for (Object p : personaList) {
            System.out.println(p);
        }

        System.out.println("Lista de persona ordenado:");
        Buble.bubbleSort(personaList);
        for (Object p : personaList) {
            System.out.println(p);
        }

    }

}
