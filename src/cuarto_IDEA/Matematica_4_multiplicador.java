package cuarto_IDEA;
//Ejercicio 4//
public class Matematica_4_multiplicador extends HacedorDeCuenta_4{

    public Matematica_4_multiplicador(int n) {
        super(n);

    }

    @Override
    public int hacerCuenta(int n2) {
        return n * n2;
    }

}
