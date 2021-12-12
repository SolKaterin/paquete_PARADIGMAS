package ej_5.equals_protected;

public class Animal {

    protected Integer peso;
    protected String especie;
    private static int contador;

    public Animal(Integer peso, String especie) {
        this.peso = peso;
        this.especie = especie;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Animal.contador = contador;
    }

    public void alimentar(Integer peso) {

        this.contador++;
        this.peso  = this.peso + peso;
        System.out.println(this.especie + ": comio y su peso es: " + this.peso);

    }

    public boolean equals(Object o) {

        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.peso == animal.peso && this.especie == animal.especie;

    }

    public static void main(String[] args) {

        Animal animal = new Animal(5, "Ave");
        Animal animal2 = new Animal(5, "Ave");
        animal.alimentar(2);
        System.out.println("contador: " + Animal.contador);
        System.out.println("equals de animal: "  + animal.equals(animal2));
        Perro perro = Perro.crearPerro("Mamifro", 10, "Roco");
        Perro perro2 = Perro.crearPerro("Mamifero", 10, "Balto");
        System.out.println("equals de perro: " + perro.equals(perro2));
        perro.alimentar(2);
        System.out.println("contador: " + Animal.contador);

    }

}
