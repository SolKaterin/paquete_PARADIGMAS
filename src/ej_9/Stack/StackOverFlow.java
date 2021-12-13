package ej_9.Stack;

public class StackOverFlow {

    public static void main(String[] args) {

        creaObjeto();
    }

    public static Pila creaObjeto () {

        Pila pepa = new Pila(1);
        creaObjeto ();

        return pepa;

    }

}

