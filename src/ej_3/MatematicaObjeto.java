package ej_3;
//Ejercicio 3//
public class MatematicaObjeto {
    public static void main(String[] args) {

        int suma = Matemática.sumar(3, 5);
        System.out.println(suma);

        int multiplicacion = Matemática.multiplicar(3, 5);
        System.out.println(multiplicacion);


        Multiplicador multiplicador = Matemática.dameMultiplicador(14);
        System.out.println(multiplicador.multiplicar(5));
    }
}
