package ej_8;
//Ejercicio 8//
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Diccionario {
    private static Map<String, String> diccionario = new HashMap<String, String>();

    public static Map<String, String> getDiccionario() {

        return Diccionario.diccionario;

    }

    public static void agregar(String palabra,String definicion) {

        diccionario.put(palabra, definicion);

    }

    public static void cargarDatos() {
        Diccionario.agregar("¡buenas!", "Expresión coloquial con que se saluda.");
        Diccionario.agregar("todo", "Refiriéndose a la totalidad de sus elementos.");
        Diccionario.agregar("bien", "Adverbio del mejor modo posible");
    }

    public static Set<String> retornarDefiniciones(Map<String, String> diccionario, Set<String> oracion) {
        Set<String> conjuntoRetorno = new HashSet<String>();
        for (String a : oracion) {
            if (diccionario.containsKey(a)) {
                String b = diccionario.get(a);
                conjuntoRetorno.add(b);
            }
        }
        return conjuntoRetorno;
    }
}
