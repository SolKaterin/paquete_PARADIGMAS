package ej_4;
//Ejercicio 4//
abstract public class HacedorDeCuenta {
    protected int n;

    public HacedorDeCuenta(int n) {

        this.n = n;
    }

    abstract public int hacerCuenta(int n2);

}
