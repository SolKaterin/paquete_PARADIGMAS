package ej_4;
//Ejercicio 4//
public class MatemáticaObjeto {

    public static void main(String[] args) {

        MatematicaMultiplicador multiplicador = new MatematicaMultiplicador(2);
        int multiplica = multiplicador.hacerCuenta(5);
        System.out.println(multiplica);

        MatematicaSumador sumando = new MatematicaSumador(10);
        int sumaTotal = sumando.hacerCuenta(200);
        System.out.println(sumaTotal);

        MatematicaExponenciador basePotencia = new MatematicaExponenciador(2);
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
