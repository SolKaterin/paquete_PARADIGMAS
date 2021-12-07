package veterinario_1;
//Ejercicio 1//
public class Veterinario_1_alimento {

    private String especie;
    private float peso;
    private String tipo_de_alimento;

    public String getEspecie() {

        return especie;
    }

    public void setEspecie(String especie) {

        this.especie = especie;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public String getTipo_de_alimento() {
        return tipo_de_alimento;
    }

    public void setTipo_de_alimento(String tipo_de_alimento) {
        this.tipo_de_alimento = tipo_de_alimento;
    }

    public void describir() {
        System.out.println(" La especie: " + especie + " tiene un peso de: "
                + peso + " kg" + " y se alimenta con: "
                + tipo_de_alimento);
    }

    public static void main(String[] args) {

    }
}
