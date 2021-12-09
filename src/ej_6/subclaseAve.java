package ej_6;
//Ejercicio 6//
public class subclaseAve extends Animal implements Volador{

    public subclaseAve(String nombre) {

        super(nombre);
    }

    @Override
    public void nadar() {

    }

    @Override
    void describir() {

        System.out.print( " Descripcion:  " + this.nombre);
    }

    @Override
    public void volar() {

    }

}
