package ej_6.tareas;

import java.util.ArrayList;
import java.util.List;

public class Objeto {

    public static void main(java.lang.String[] args) {

        DeString impresion = new DeString("String");
        impresion.ejecutar();

        List<String> txt= new ArrayList<String>();
        String doc1 = "un doc";
        String doc2 = "otro doc";
        String doc3 = "y un tercer doc";
        OperacionList o1 = new OperacionList(txt);
        o1.agregarElemento(doc1);
        o1.agregarElemento(doc2);
        o1.agregarElemento(doc3);
        o1.ejecutar();


        System.out.println(Global.getN());
        Modificador  modificaN = new Modificador();
        modificaN.ejecutar();


        List<Tarea> tareas= new ArrayList<Tarea>();
        tareas.add(impresion);
        tareas.add(o1);
        tareas.add(modificaN);

        Batch.procesarBatch(tareas);
    }

}
