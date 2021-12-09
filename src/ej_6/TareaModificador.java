package ej_6;
//Ejercicio 6//
public class TareaModificador implements Tarea{

    private String nombre = "Modificador de variable global";

    public TareaModificador() {
        super();
    }

    public static void TareaModificador() {
        TareaGlobal.setN(9);
    }

    @Override
    public void ejecutar() {
        TareaGlobal.setN(9);
        imprimir();
    }

    private void imprimir() {
        System.out.println("Variable: " + TareaGlobal.getN());
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

}
