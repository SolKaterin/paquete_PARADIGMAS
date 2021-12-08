package autos_3;
//Ejercicio 3//
public class Auto_3_objeto {
    public static void main(String [] args) {

        //comparten el mismo paquete
        Auto_3 ford = new Auto_3("Ford", "Transit", 2007);

        //se setea setAnio para hacer getAnio sino devuelve NullPointerException
        FabricaDeAuto_3.setAnio(2021);
        FabricaDeAuto_3 fabrica = new FabricaDeAuto_3("Ford");
        Auto_3 Transit = fabrica.fabricarAuto("Transit");

        System.out.println(Transit.getAnio());

    }

}
