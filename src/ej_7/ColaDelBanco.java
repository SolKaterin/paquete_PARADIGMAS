package ej_7;
//Ejercicio 7//
import java.util.Deque;
import java.util.LinkedList;
public class ColaDelBanco {

    Deque<ColaBancoPersona> colaDelBanco;

    public ColaDelBanco() {
        colaDelBanco = new LinkedList<ColaBancoPersona>();
    }

    public void add(ColaBancoPersona persona) {
        if(!colaDelBanco.contains(persona)) {
            if(persona.edad >= 60) colaDelBanco.addFirst(persona) ;
            else colaDelBanco.add(persona);
        }
    }

    public ColaBancoPersona answer() {

        return ((LinkedList<ColaBancoPersona>) colaDelBanco).poll();

    }

    @Override
    public String toString() {
        for (ColaBancoPersona p : colaDelBanco ) {
            return p.toString();
        }
        return null;
    }

}
