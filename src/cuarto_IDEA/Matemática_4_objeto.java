package cuarto_IDEA;
//Ejercicio 4//
public class Matemática_4_objeto {

    public static void main(String[] args) {

        Matematica_4_multiplicador multiplicador = new Matematica_4_multiplicador(2);
        int multiplica = multiplicador.hacerCuenta(5);
        System.out.println(multiplica);

        Matematica_4_sumador sumando = new Matematica_4_sumador(10);
        int sumaTotal = sumando.hacerCuenta(200);
        System.out.println(sumaTotal);

        Matematica_4_exponenciador basePotencia = new Matematica_4_exponenciador(2);
        int potencia = basePotencia.hacerCuenta(2);
        System.out.println(potencia);

        //Ejercicios_5//
        int nMult = multiplicador.n;
        int nSum = sumando.n;
        int nExp = basePotencia.n;
        System.out.println(" Numero de multiplicador: "+ nMult + " Numero de sumador: " + nSum +
                " Numero de exponenciador: " + nExp);

    }
}
