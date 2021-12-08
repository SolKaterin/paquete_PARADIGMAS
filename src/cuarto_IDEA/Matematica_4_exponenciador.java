package cuarto_IDEA;
//Ejercicio 4//
public class Matematica_4_exponenciador extends HacedorDeCuenta_4{

    public Matematica_4_exponenciador(int n) {
        super(n);

    }

    @Override
    public int hacerCuenta(int n2) {
        int resultado = (int) Math.pow(n,n2);

        return resultado ;
    }
}
