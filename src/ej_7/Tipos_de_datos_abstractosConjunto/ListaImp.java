package ej_7.Tipos_de_datos_abstractosConjunto;

import java.util.ArrayList;
import java.util.List;
public class ListaImp implements Conjunto{

    List<Object> lista;

    public ListaImp() {

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
