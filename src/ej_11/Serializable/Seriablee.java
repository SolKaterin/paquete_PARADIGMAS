package ej_11.Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import ej_6.tareas.Batch;
import ej_6.tareas.DeString;
import ej_6.tareas.Modificador;
import ej_6.tareas.OperacionList;
import ej_6.tareas.Tarea;

public class Seriablee {

    @SuppressWarnings("static-access")
    public static void main(DeString[] args) throws IOException, ClassNotFoundException {

        //setea objetos para guardar
        List<String> txt= new ArrayList<String>();
        String d = "doc1";
        String d2 = "doc2";
        String d3 = "doc3";
        OperacionList o1 = new OperacionList(txt);
        o1.agregarElemento(d);
        o1.agregarElemento(d2);
        o1.agregarElemento(d3);

        DeString impresion = new DeString("String");
        Modificador  modificarCount = new Modificador();
        List<Tarea> tareas= new ArrayList<Tarea>();
        tareas.add(impresion);
        tareas.add(o1);
        tareas.add(modificarCount);

        Batch batch = new Batch();
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