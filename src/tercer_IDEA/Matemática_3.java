package tercer_IDEA;
//Ejercicio 3//
public class Matemática_3 {

    public static int sumar(int n, int n2) {
        return n + n2;
    }

    public static int multiplicar(int n, int n2) {
        return n * n2;
    }

    public static Multiplicador_3 dameMultiplicador(int n) {
        Multiplicador_3 multiplicador = new Multiplicador_3(n);
        return multiplicador;
    }

    public static void main(String[] args) {

    }
}
