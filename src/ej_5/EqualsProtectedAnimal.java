package ej_5;
//Ejercicio 5//
public class EqualsProtectedAnimal {

    protected Integer peso;
    protected String especie;
    private static int contador;

    public EqualsProtectedAnimal(Integer peso, String especie) {
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
        EqualsProtectedAnimal.contador = contador;
    }

    public void alimentar(Integer peso) {
        this.contador++;
        this.peso  = this.peso + peso;
        System.out.println(this.especie + ": comio y su peso es: " + this.peso);
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        EqualsProtectedAnimal animal = (EqualsProtectedAnimal) o;
        return this.peso == animal.peso && this.especie == animal.especie;
    }

    public static void main(String[] args) {
        EqualsProtectedAnimal animal = new EqualsProtectedAnimal(5, "Ave");
        EqualsProtectedAnimal animal2 = new EqualsProtectedAnimal(5, "Ave");
        animal.alimentar(2);
        System.out.println("contador: " + EqualsProtectedAnimal.contador);
        System.out.println("equals de animal: "  + animal.equals(animal2));
        subClasePerro perro = subClasePerro.crearPerro("Mamifro", 10, "Roco");
        subClasePerro perro2 = subClasePerro.crearPerro("Mamifero", 10, "Balto");
        System.out.println("equals de perro: " + perro.equals(perro2));
        perro.alimentar(2);
        System.out.println("contador: " + EqualsProtectedAnimal.contador);
    }
}
