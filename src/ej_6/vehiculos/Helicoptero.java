package ej_6.vehiculos;

public class Helicoptero extends Vehículo implements Volador{


    @Override
    public void volar() {
        System.out.println("Tipo de Vehiculo: helicoptero, puede volar");
    }
}
