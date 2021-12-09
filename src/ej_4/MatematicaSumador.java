package ej_4;
//Ejercicio 4//
public class MatematicaSumador extends HacedorDeCuenta {

    public MatematicaSumador(int n) {
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return this.n + n2;
    }

}
