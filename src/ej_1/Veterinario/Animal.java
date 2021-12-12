package ej_1.Veterinario;

public class Animal {

    private String especie;
    private float peso;
    private float altura;
    private int edad;
    private Alimento alimento;

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

    public Alimento getAlimento() {

        return alimento;
    }

    public void setAlimento(Alimento alimento) {

        this.alimento = alimento;
    }

    public void describirAnimal() {
        System.out.println(" La especie: " + especie + ", pesa: " + peso + " kg" + ", tiene una altura de: "
                + altura + " cm" + " y actualmente tiene: " + edad +" años perrunos");
    }

    public void comer( Alimento alimento) {

        if (alimento.getEspecie().equals(this.getEspecie())) {

            float pesoAlimento = peso + alimento.getPeso();

            System.out.println(" La especie: " + especie + ", puede comer: " + alimento.getPeso()
                    + " kg de " + alimento.getEspecie() +  ", por lo que ahora pesa: "
                    + pesoAlimento + " kg.");

        } else {

            System.out.println(" La especie: " + especie + " no puede comer: " + alimento.getEspecie());

        }

    }

}
