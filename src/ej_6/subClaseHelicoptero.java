package ej_6;
//Ejercicio 6//
public class subClaseHelicoptero extends Vehículo implements Volador{


    @Override
    public void volar() {
        System.out.println("Tipo de Vehiculo: helicoptero, puede volar");
    }
}
