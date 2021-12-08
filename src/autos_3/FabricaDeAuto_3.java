package autos_3;
//Ejercicio 3//
public class FabricaDeAuto_3 {

    private static int anio;
    private String marca;

    public FabricaDeAuto_3(String marca) {
        this.marca = marca;
    }

    public static int getAnio() {

        return anio;

    }

    public static void setAnio(int anio) {

        FabricaDeAuto_3.anio = anio;

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    public Auto_3 fabricarAuto(String modelo)  {
        if(anio == 0) {
            return null;
        }
        Auto_3 auto = new Auto_3(this.marca, modelo, FabricaDeAuto_3.anio);
        return auto;
    }
}
