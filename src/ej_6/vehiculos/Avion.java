package ej_6.vehiculos;

public class Avion extends Vehículo implements Volador{


    @Override
    public void volar() {
        System.out.println("Tipo de Vehiculo: avion, puede volar");
    }
}
