package ejAutos_3;

//Ejercicio 3//
public class AutoObjeto {
    public static void main(String [] args) {

        Auto ford = new Auto("Ford", "Transit", 2007);
        Auto ford2 = new Auto("Ford2", "Transit2", 2009);

        FabricaDeAuto.setAnio(2021);
        FabricaDeAuto fabrica = new FabricaDeAuto("Ford");
        Auto Transit = fabrica.fabricarAuto("Transit");

        System.out.println(Transit.getAnio());

    }

}
