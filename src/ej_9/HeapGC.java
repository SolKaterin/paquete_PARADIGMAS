package ej_9;
//Ejercicio 9//
public class HeapGC {

    public static void main(String[] args) {

        StackPila pila1 = new StackPila(1);
        StackPila pila2 = new StackPila(2);
        StackPila pila3 = new StackPila(3);

        StackPila pila = new StackPila(0);
        pila1 = pila2;
        pila1 = pila3;
        pila1 = pila;

        pila3 = pila1;
        pila2 = pila1;

        crearRecolectar(1);
        crearMil();
    }

    private static void crearMil() {
        StackPila pila = new StackPila(0);
        StackPila pila2;

        for (int i = 0; i < 1000; i++) {
            pila2 = new StackPila(i);
            System.gc();
            System.out.println(pila);
            i++;
        }
    }

    private static StackPila crearRecolectar(int numero) {
        StackPila b = new StackPila(0);
        StackPila a = new StackPila(numero);
        b = a;
        System.gc();
        return a;
    }

}
