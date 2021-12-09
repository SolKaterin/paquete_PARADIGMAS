package ej_2;
//Ejercicio 2//
public class VehiculosObj {

    public static void main(String [] args) {

        subClaseAuto ford = new subClaseAuto();
        subClaseMoto yamaha = new subClaseMoto();

        yamaha.setNombre("yamaha");
        yamaha.setRuedas(2);
        yamaha.setCilindrada(250.5f);

        ford.setNombre("ford");
        ford.setRuedas(4);
        ford.setPuertas(4);
    }
}
