package ej_6.animales;

public class Pez extends Animal implements Acuatico{

    public Pez(String nombre) {
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
