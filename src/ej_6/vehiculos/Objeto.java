package ej_6.vehiculos;

public class Objeto {

    public static void main(String[] args) {
        Vehículo auto = new Auto();
        Vehículo avion = new Avion();
        Vehículo helicoptero = new Helicoptero();
        Vehículo lancha = new Lancha();

        Volador v2;
        //volador = (Volador) auto;
        v2 = (Volador) avion;
        Vehículo.check(avion);
        lancha.hacerVolar(avion);
    }
}
