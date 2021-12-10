package ej_9;
//Ejercicio 9//
import java.util.LinkedList;
import java.util.List;
public class StackPila {

    private static List<Integer> resultado = new LinkedList<>();
    int num;
    public StackPila pila;

    public StackPila(int num) {
        this.num = num;

    }

    public static void ejecutaLaOperacion(int n1, int n2, String operacion) {
        if(operacion.equals("suma")) {
            suma(n1, n2);
        } else if (operacion.equals("resta")) {
            resta(n1, n2);
        } else {
            System.err.println("Ingresar: Suma o Resta");
        }
    }

    public static int suma(int a, int b) {
        casteo(a);
        casteo(b);
        Integer c = a + b;
        System.out.println(c);
        return c;
    }

    public static int resta(int a, int b) {
        casteo(a);
        casteo(b);
        Integer c = a - b;
        System.out.println(c);
        return c;
    }

    public static Integer casteo(int a) {
        Integer b;
        b = (Integer) a;
        resgistroResultado(b);
        return b;
    }

    public static List<Integer> resgistroResultado(Integer b) {
        if (resultado == null) {
            resultado = new LinkedList<>();
        }
        resultado.add(b);
        return resultado;
    }

    public static void main(String[] args) {
        ejecutaLaOperacion(9,7,"resta");
    }

}
