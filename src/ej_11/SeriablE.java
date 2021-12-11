package ej_11;
//Ejercicio 11//
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import ej_6.TareaBatch;
import ej_6.TareaString;
import ej_6.TareaModificador;
import ej_6.TareaOperacionList;
import ej_6.Tarea;

public class SeriablE {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try {

            FileInputStream archivo = new FileInputStream("D:\\fichero1.txt\\fichero.bin");
            ObjectInputStream deserializador = new ObjectInputStream(archivo);
            TareaString impresion = (TareaString) deserializador.readObject();
            TareaOperacionList o1 = (TareaOperacionList) deserializador.readObject();
            TareaModificador modificarCount = (TareaModificador) deserializador.readObject();
            List<Tarea> tareas = (List<Tarea>) deserializador.readObject();
            TareaBatch batch = (TareaBatch) deserializador.readObject();
            deserializador.close();
            batch.procesarBatch(tareas);

        } catch (IOException e) {

            System.err.println(" No se pudo cargar el objeto " + e.getMessage());

        }

    }

}