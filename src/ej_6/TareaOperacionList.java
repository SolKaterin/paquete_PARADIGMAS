package ej_6;
//Ejercicio 6//
import java.util.ArrayList;
import java.util.List;
public class TareaOperacionList implements Tarea{

    private List<String> texto= new ArrayList<String>();
    private String nombre = "TareaOperacionList";

    public TareaOperacionList(List<String> texto){
        super();
        this.texto = texto;
    }

    public  void agregarElemento(String elemento) {

        texto.add(elemento);
    }

    public void operacioninLine() {
        String archivo = "pepe";
        for (String documento : texto) {
            System.out.println(documento + archivo);
        }
    }

    @Override
    public void ejecutar() {

        operacioninLine();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
