package ej_9.Heap;
//Ejercicio 9//
import ej_9.Stack.Pila;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private static Pila creaObjetosSinParar() {
        int i = 0;
        Pila pila = new Pila(i);
        Pila pila2;
        while (true) {
            pila2 = new Pila(i);
            System.out.println(pila);
        }

    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        creaObjetosSinParar();
    }

}
