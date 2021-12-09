package ej_6;
//Ejercicio 6//
public class subClaseAvion extends Vehículo implements Volador{


    @Override
    public void volar() {
        System.out.println("Tipo de Vehiculo: avion, puede volar");
    }
}
