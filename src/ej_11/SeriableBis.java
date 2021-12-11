package ej_11;
//Ejercicio 11//
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import ej_6.TareaBatch;
import ej_6.TareaString;
import ej_6.TareaModificador;
import ej_6.TareaOperacionList;
import ej_6.Tarea;

public class SeriableBis {

    @SuppressWarnings("static-access")
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //setea objetos para guardar
        List<String> txt= new ArrayList<String>();
        String d = "doc1";
        String d2 = "doc2";
        String d3 = "doc3";
        TareaOperacionList o1 = new TareaOperacionList(txt);
        o1.agregarElemento(d);
        o1.agregarElemento(d2);
        o1.agregarElemento(d3);

        TareaString impresion = new TareaString("String");
        TareaModificador  modificarCount = new TareaModificador();
        List<Tarea> tareas= new ArrayList<Tarea>();
        tareas.add(impresion);
        tareas.add(o1);
        tareas.add(modificarCount);

        TareaBatch batch = new TareaBatch();
        batch.procesarBatch(tareas);


        try {

            File archivo = new File("D:\\fichero1.txt\\fichero.bin");
            FileOutputStream salida = new FileOutputStream(archivo);
            ObjectOutputStream serializador = new ObjectOutputStream(salida);
            serializador.writeObject(impresion);
            serializador.writeObject(o1);
            serializador.writeObject(modificarCount);
            serializador.writeObject(tareas);
            serializador.writeObject(batch);
            serializador.close();

        } catch (IOException e) {

            System.err.println(" No se pudo cargar el objeto " + e.getMessage());

        }

    }

}
