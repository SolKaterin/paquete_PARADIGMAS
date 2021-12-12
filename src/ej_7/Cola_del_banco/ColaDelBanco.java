package ej_7.Cola_del_banco;

import java.util.Deque;
import java.util.LinkedList;
public class ColaDelBanco {

    Deque<Persona> colaDelBanco;

    public ColaDelBanco() {
        colaDelBanco = new LinkedList<Persona>();
    }

    public void add(Persona persona) {
        if(!colaDelBanco.contains(persona)) {
            if(persona.edad >= 60) colaDelBanco.addFirst(persona) ;
            else colaDelBanco.add(persona);
        }
    }

    public Persona answer() {

        return ((LinkedList<Persona>) colaDelBanco).poll();

    }

    @Override
    public String toString() {
        for (Persona p : colaDelBanco ) {
            return p.toString();
        }
        return null;
    }

}
