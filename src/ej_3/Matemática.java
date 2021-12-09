package ej_3;
//Ejercicio 3//
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

    public static void main(String[] args) {

    }
}
