package ej_6.tareas;

public class Modificador implements Tarea {

    private String nombre = "Modificador de variable global";

    @Override
    public String getNombre() {
        return nombre;
    }

    public Modificador() {

        super();

    }

    public static void Modificador() {

        Global.setN(9);

    }

    @Override
    public void ejecutar() {

        Global.setN(9);
        imprimir();

    }

    private void imprimir() {
        System.out.println("Variable: " + Global.getN());
    }

}
