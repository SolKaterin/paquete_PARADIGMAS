package cuarto_IDEA;
//Ejercicio 4//
public class Matematica_4_sumador extends HacedorDeCuenta_4{

    public Matematica_4_sumador(int n) {
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return this.n + n2;
    }

}
