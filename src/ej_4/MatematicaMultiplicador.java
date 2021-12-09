package ej_4;
//Ejercicio 4//
public class MatematicaMultiplicador extends HacedorDeCuenta {

    public MatematicaMultiplicador(int n) {
        super(n);

    }

    @Override
    public int hacerCuenta(int n2) {
        return n * n2;
    }

}
