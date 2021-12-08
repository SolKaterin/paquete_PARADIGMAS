package tercer_IDEA;
//Ejercicio 3//
public class Matematica_3_objeto {
    public static void main(String[] args) {

        int suma = Matemática_3.sumar(3, 5);
        System.out.println(suma);

        int multiplicacion = Matemática_3.multiplicar(3, 5);
        System.out.println(multiplicacion);


        Multiplicador_3 multiplicador = Matemática_3.dameMultiplicador(14);
        System.out.println(multiplicador.multiplicar(5));
    }
}
