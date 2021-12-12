package ej_6.tareas;

public class DeString implements Tarea {

    String nombre = "pepa";
    String string ;

    public DeString(String string) {
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
