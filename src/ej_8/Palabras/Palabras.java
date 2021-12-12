package ej_8.Palabras;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Palabras {

    public static Set<String> separador(String oracion) {
        Set<String> conjuntoRetorno = new HashSet<String>();
        String[] splitArray = oracion.split(" ");
        for (String i : splitArray) conjuntoRetorno.add(i);
        return conjuntoRetorno;
    }

    public static Set<String> separadorOrdenado(String oracion) {
        Set<String> conjunto = new TreeSet<String>();
        String[] splitArray = oracion.split(" ");
        for (String i : splitArray) conjunto.add(i);
        return conjunto;
    }

    public static Map<String, Integer> cuentador(String oracion) {
        Map<String, Integer> mapaRetorno =  new TreeMap<String, Integer>();
        String[] splitArray = oracion.split(" ");
        for (String i  : splitArray) mapaRetorno.put(i, mapaRetorno.getOrDefault(i, 0) + 1);
        return mapaRetorno;
    }

    public static void main(String[] args) {
        String resultadoHashSet = Palabras.separador("¡buenas! todo bien").toString();
        System.out.println("HashSet: " + resultadoHashSet);
        String resultadoTreeSet = Palabras.separadorOrdenado("¡buenas! todo bien").toString();
        System.out.println("TreeSet: " + resultadoTreeSet);
        String resultadoHashMap = Palabras.cuentador("¡buenas! todo bien").toString();
        System.out.println("HashMap: " + resultadoHashMap);
    }
}
