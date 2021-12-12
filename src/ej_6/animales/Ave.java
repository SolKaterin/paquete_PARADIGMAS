package ej_6.animales;

import ej_6.vehiculos.Volador;

public class Ave extends Animal implements Volador {

    public Ave(String nombre) {

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
