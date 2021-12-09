package ej_6;
//Ejercicio 6//
public class TareaString implements Tarea {

    String nombre = "pepa";
    String string ;

    public TareaString(String string) {
        super();
        this.string = string;
    }

    @Override
    public void ejecutar() {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
