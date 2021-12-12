package ej_6.animales;

public class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {

    }

    @Override
    void describir() {
        System.out.print( " Descripcion: " + this.nombre );
    }

    @Override
    public void volar() {

    }


}
