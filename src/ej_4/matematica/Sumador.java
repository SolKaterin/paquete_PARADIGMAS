package ej_4.matematica;

public class Sumador extends HacedorDeCuenta {

    public Sumador(int n) {
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return this.n + n2;
    }

}
