package ej_9;
//Ejercicio 9//
import java.util.ArrayList;
import java.util.List;
public class Heap {

    private static StackPila creaObjetosSinParar() {
        int i = 0;
        StackPila pila = new StackPila(i);
        StackPila pila2;
        while (true) {
            pila2 = new StackPila(i);
            System.out.println(pila);
        }

    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        creaObjetosSinParar();
    }

}
