package veterinario_1;
//Ejercicio 1//
public class Veterinario_1_animal {

    private String especie;
    private float peso;
    private float altura;
    private int edad;
    @SuppressWarnings("unused")
    private Veterinario_1_alimento alimento;

    public String getEspecie() {

        return especie;
    }

    public void setEspecie(String especie) {

        this.especie = especie;
    }

    public float getAltura() {

        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public Veterinario_1_alimento getAlimento() {

        return alimento;
    }

    public void setAlimento(Veterinario_1_alimento alimento) {

        this.alimento = alimento;
    }

    public void describirAnimal() {
        System.out.println(" La especie: " + especie + ", pesa: " + peso + " kg" + ", tiene una altura de: "
                + altura + " cm" + " y actualmente tiene: " + edad +" años perrunos");
    }

    public void comer( Veterinario_1_alimento alimento) {
        if (alimento.getEspecie().equals(this.getEspecie())) {
            float pesoAlimento = peso + alimento.getPeso();

            System.out.println(" La especie: " + especie + ", puede comer: " + alimento.getPeso()
                    + " kg de " + alimento.getEspecie() +  ", por lo que ahora pesa: "
                    + pesoAlimento + " kg.");
        } else {
            System.out.println(" La especie: " + especie + " no puede comer: " + alimento.getEspecie());
        }
    }

    public static void main(String[] args) {

    }
}
