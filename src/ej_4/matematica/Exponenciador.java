package ej_4.matematica;

public class Exponenciador extends HacedorDeCuenta {

    public Exponenciador(int n) {
        super(n);

    }

    @Override
    public int hacerCuenta(int n2) {
        int resultado = (int) Math.pow(n,n2);

        return resultado ;
    }
}
