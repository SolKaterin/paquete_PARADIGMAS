package ej_8.Primos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class NumerosPrimos {

    private static Map<Integer, Boolean> mapaRegistro = new HashMap<Integer, Boolean>();

    public static boolean esPrimo(Integer num) {
        boolean primo = true;
        if (mapaRegistro.containsKey(num)) primo = mapaRegistro.get(num);
        if(num == 0 || num == 1 || num == 2) primo = false;
        else {
            for(int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        mapaRegistro.put(num, primo);
        return primo;
    }

    public static Set<Integer> primosConocidos() {
        Set<Integer> primosConocidos = new TreeSet<Integer>();
        for (Entry<Integer, Boolean> e: mapaRegistro.entrySet()) {
            if((e.getValue()== true)) {
                primosConocidos.add(e.getKey());
            }
        }
        return primosConocidos;
    }

    public static void main(String[] args) {
        boolean r1 = NumerosPrimos.esPrimo(7);
        boolean r3 = NumerosPrimos.esPrimo(4);
        boolean r4 = NumerosPrimos.esPrimo(3);
        boolean r2 = NumerosPrimos.esPrimo(5);
        boolean r5 = NumerosPrimos.esPrimo(6);

        String registro = mapaRegistro.toString();
        System.out.println("Registro: " + registro);

        String conocidos = NumerosPrimos.primosConocidos().toString();
        System.out.println("Primos Conocidos: " + conocidos);
    }
}
