package ejAutos_3;
//Ejercicio 3//
public class AutoObjeto {
    public static void main(String [] args) {

        //comparten el mismo paquete
        Auto ford = new Auto("Ford", "Transit", 2007);

        //se setea setAnio para hacer getAnio sino devuelve NullPointerException
        FabricaDeAuto.setAnio(2021);
        FabricaDeAuto fabrica = new FabricaDeAuto("Ford");
        Auto Transit = fabrica.fabricarAuto("Transit");

        System.out.println(Transit.getAnio());

    }

}
