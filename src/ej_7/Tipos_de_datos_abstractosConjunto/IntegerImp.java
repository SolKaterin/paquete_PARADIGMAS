package ej_7.Tipos_de_datos_abstractosConjunto;
//Ejercicio 7//
import java.util.ArrayList;
import java.util.List;
public class IntegerImp implements Conjunto{

    List<Object> lista;

    public IntegerImp() {

        lista = new ArrayList<Object>();

    }

    public void add(Object o) {

        lista.add(o);

    }

    @Override
    public boolean pertenece(Object o) {
        if(lista.contains(o)) {return true;}
        else return false;
    }

}
