package ej_4;
//Ejercicio 4//
public class MatematicaExponenciador extends HacedorDeCuenta {

    public MatematicaExponenciador(int n) {
        super(n);

    }

    @Override
    public int hacerCuenta(int n2) {
        int resultado = (int) Math.pow(n,n2);

        return resultado ;
    }
}
