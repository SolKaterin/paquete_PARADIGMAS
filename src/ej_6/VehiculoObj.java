package ej_6;
//Ejercicio 6//
public class VehiculoObj {

    public static void main(String[] args) {
        Vehículo auto = new subClaseAuto();
        Vehículo avion = new subClaseAvion();
        Vehículo helicoptero = new subClaseHelicoptero();
        Vehículo lancha = new subClaseLancha();

        Volador v2;
        //volador = (Volador) auto;
        v2 = (Volador) avion;
        Vehículo.check(avion);
        lancha.hacerVolar(avion);
    }
}
