package ej_3.Matematica;

public class Matemática {

    public static int sumar(int n, int n2) {

        return n + n2;

    }

    public static int multiplicar(int n, int n2) {

        return n * n2;

    }

    public static Multiplicador dameMultiplicador(int n) {

        Multiplicador multiplicador = new Multiplicador(n);
        return multiplicador;

    }

}
