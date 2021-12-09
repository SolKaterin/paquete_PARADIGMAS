package ejAutos_3;
//Ejercicio 3//
public class FabricaDeAuto {

    private static int anio;
    private String marca;

    public FabricaDeAuto(String marca) {
        this.marca = marca;
    }

    public static int getAnio() {

        return anio;

    }

    public static void setAnio(int anio) {

        FabricaDeAuto.anio = anio;

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    public Auto fabricarAuto(String modelo)  {
        if(anio == 0) {
            return null;
        }
        Auto auto = new Auto(this.marca, modelo, FabricaDeAuto.anio);
        return auto;
    }
}
