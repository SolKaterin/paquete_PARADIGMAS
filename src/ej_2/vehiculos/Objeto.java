package ej_2.vehiculos;

public class Objeto {

    public static void main(String [] args) {

        Auto ford = new Auto();
        Moto yamaha = new Moto();

        yamaha.setNombre("yamaha");
        yamaha.setRuedas(2);
        yamaha.setCilindrada(250.5f);

        ford.setNombre("ford");
        ford.setRuedas(4);
        ford.setPuertas(4);
    }
}
