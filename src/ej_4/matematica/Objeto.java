package ej_4.matematica;

public class Objeto {

    public static void main(String[] args) {

        Multiplicador multiplicador = new Multiplicador(2);
        int multiplica = multiplicador.hacerCuenta(5);
        System.out.println(multiplica);

        Sumador sumando = new Sumador(10);
        int sumaTotal = sumando.hacerCuenta(200);
        System.out.println(sumaTotal);

        Exponenciador basePotencia = new Exponenciador(2);
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
