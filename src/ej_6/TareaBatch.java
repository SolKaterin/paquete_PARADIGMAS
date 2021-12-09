package ej_6;
//Ejercicio 6//
import java.util.List;
public class TareaBatch {

    public TareaBatch() {
    }

    public static void procesarBatch(List<Tarea> lista) {
        System.out.println("ejecuta batch");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
            lista.get(i).ejecutar();
        }
        System.out.println("finaliza batch");
    }

}
