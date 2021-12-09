package ej_2;
//Ejercicio 2//
public class Vehículos {
    private String nombre;
    private int ruedas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void describirVehiculo() {
        System.out.println("  Este vehiculo es un/a: " + nombre +
                ", \n  y tiene " + ruedas + " ruedas.");
    }
    public static void main(String[] args) {

    }
}
