package ej_6;
//Ejercicio 6//
public class subclasePez extends Animal implements Acuatico{

    public subclasePez(String nombre) {
        super(nombre);
    }


    @Override
    void describir() {
        System.out.print( "Me llamo: " + this.nombre);
    }

    @Override
    public void nadar() {
        this.describir();
        System.out.println(" y estoy nadando");
    }

    @Override
    public void volar() {

    }
}
