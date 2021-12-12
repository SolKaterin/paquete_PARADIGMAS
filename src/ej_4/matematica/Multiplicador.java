package ej_4.matematica;

public class Multiplicador extends HacedorDeCuenta {

    public Multiplicador(int n) {
        super(n);

    }

    @Override
    public int hacerCuenta(int n2) {
        return n * n2;
    }

}
