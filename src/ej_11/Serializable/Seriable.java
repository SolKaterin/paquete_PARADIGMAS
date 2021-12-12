package ej_11.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import ej_6.tareas.Batch;
import ej_6.tareas.DeString;
import ej_6.tareas.Modificador;
import ej_6.tareas.OperacionList;
import ej_6.tareas.Tarea;

public class Seriable {

    public static void main(DeString[] args) throws IOException, ClassNotFoundException {

        try {

            FileInputStream archivo = new FileInputStream("D:\\fichero1.txt\\fichero.bin");
            ObjectInputStream deserializador = new ObjectInputStream(archivo);
            DeString impresion = (DeString) deserializador.readObject();
            OperacionList o1 = (OperacionList) deserializador.readObject();
            Modificador modificarCount = (Modificador) deserializador.readObject();
            List<Tarea> tareas = (List<Tarea>) deserializador.readObject();
            Batch batch = (Batch) deserializador.readObject();
            deserializador.close();
            batch.procesarBatch(tareas);

        } catch (IOException e) {

            System.err.println(" No se pudo cargar el objeto " + e.getMessage());

        }

    }

}