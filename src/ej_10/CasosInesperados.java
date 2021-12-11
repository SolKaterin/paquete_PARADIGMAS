package ej_10;
//Ejercicio 10//
import java.util.ArrayList;
import java.util.List;

public class CasosInesperados {

    public static void main(String[] args) throws IllegalArgumentException{
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        try {
            System.out.println(mDiez(lista));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Persona.creaPersona("Maria", 23, 12312312);
            Persona.creaPersona("Maria", 23, 12312312);
            Persona.creaPersona("Jose", 20, 11223344);
            Persona.creaPersona("Leon", 22, 11223346);
            Persona.creaPersona("Pedro", 33, 11441155);

        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static Integer mDiez(List<Integer> lista) throws IllegalArgumentException{
        int res = 0;
        for (Integer i : lista) {
            if (i > 10) {
                if (res == 0) {
                    res = i;
                    return res;
                }
            }
        }
        if (res == 0) {
            IllegalArgumentException e = new IllegalArgumentException("debe ser mayor a 10");
            throw e;
        }
        return res;
    }
}
