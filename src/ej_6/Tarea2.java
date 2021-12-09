package ej_6;
//Ejercicio 6//
import java.util.ArrayList;
import java.util.List;
public class Tarea2 {

    public static void main(String[] args) {

        TareaString impresion = new TareaString("String");
        impresion.ejecutar();

        List<String> txt= new ArrayList<String>();
        String doc1 = "un doc";
        String doc2 = "otro doc";
        String doc3 = "y un tercer doc";
        TareaOperacionList o1 = new TareaOperacionList(txt);
        o1.agregarElemento(doc1);
        o1.agregarElemento(doc2);
        o1.agregarElemento(doc3);
        o1.ejecutar();


        System.out.println(TareaGlobal.getN());
        TareaModificador  modificaN = new TareaModificador();
        modificaN.ejecutar();


        List<Tarea> tareas= new ArrayList<Tarea>();
        tareas.add(impresion);
        tareas.add(o1);
        tareas.add(modificaN);

        TareaBatch.procesarBatch(tareas);
    }

}
