package ej_7;
//Ejercicio 7//
import java.util.ArrayList;
import java.util.List;
public class ListaImpl implements Conjunto{

    List<Object> lista;

    public ListaImpl() {

        lista = new ArrayList<Object>();

    }

    public void add(Object o) {

        lista.add(o);

    }

    @Override
    public boolean pertenece(Object o) {
        if(lista.contains(o)) {
            return true;
        }
        else{
            return false;
        }

    }

}
