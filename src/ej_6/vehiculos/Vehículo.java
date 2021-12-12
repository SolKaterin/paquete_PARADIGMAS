package ej_6.vehiculos;

abstract public class Vehículo {

    public static void check (Vehículo v) {
        if (v instanceof Volador) {
            Volador v2= (Volador)v;
        } else {
            System.out.println("Implementar la interfaz volador");
        }
    }
    private static boolean esVolador(Vehículo v) {
        if (v instanceof Volador) {
            return true;
        } else {
            return false;
        }
    }
    public static void hacerVolar(Vehículo v) {
        if (esVolador(v)) {
            Volador v2 = (Volador)v;
            v2.volar();
        } else {
            System.out.println("este vehiculo no vuela");
        }
    }
}
