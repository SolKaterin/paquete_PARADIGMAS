package segundo_IDEA;
//Ejercicio 2//
public class instanciaVehiculos_2 {

    public static void main(String [] args) {

        subClaseAuto_2 ford = new subClaseAuto_2();
        subClaseMoto_2 yamaha = new subClaseMoto_2();

        yamaha.setNombre("yamaha");
        yamaha.setRuedas(2);
        yamaha.setCilindrada(250.5f);

        ford.setNombre("ford");
        ford.setRuedas(4);
        ford.setPuertas(4);
    }
}
