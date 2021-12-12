package ej_9.Heap;

import ej_9.Stack.Pila;

public class GC {

    public static void main(String[] args) {

        Pila pila1 = new Pila(1);
        Pila pila2 = new Pila(2);
        Pila pila3 = new Pila(3);

        Pila pila = new Pila(0);
        pila1 = pila2;
        pila1 = pila3;
        pila1 = pila;

        pila3 = pila1;
        pila2 = pila1;

        crearRecolectar(1);
        crearMil();
    }

    private static void crearMil() {
        Pila pila = new Pila(0);
        Pila pila2;

        for (int i = 0; i < 1000; i++) {
            pila2 = new Pila(i);
            System.gc();
            System.out.println(pila);
            i++;
        }
    }

    private static Pila crearRecolectar(int numero) {
        Pila b = new Pila(0);
        Pila a = new Pila(numero);
        b = a;
        System.gc();
        return a;
    }

}
