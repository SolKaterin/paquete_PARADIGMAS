package ej_3.Autos;

public class Auto {

    private String marca;
    private String modelo;
    private int anio;

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {

        return marca;

    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {

        return modelo;

    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {

        return anio;

    }

    private void setAnio(int anio) {
        this.anio = anio;
    }
}
