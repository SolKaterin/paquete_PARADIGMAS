package veterinario_1;
//Ejercicio 1//
public class Veterinario_1_objeto {

    public static void main(String[] args) {

        Veterinario_1_animal roco = new Veterinario_1_animal();
        Veterinario_1_animal balto = new Veterinario_1_animal();

        Veterinario_1_alimento pollo = new Veterinario_1_alimento();
        Veterinario_1_alimento carne = new Veterinario_1_alimento();

        pollo.setPeso(2.5f);
        pollo.setEspecie("perro");
        pollo.setTipo_de_alimento("pollo");
        pollo.describir();

        carne.setPeso(1.5f);
        carne.setEspecie("perro");
        carne.setTipo_de_alimento("carne");
        carne.describir();

        roco.setEspecie("perro");
        roco.setAltura(75.5f);
        roco.setPeso(40.5f);
        roco.setEdad(2);
        roco.describirAnimal();
        roco.comer(pollo);
        roco.comer(carne);

        balto.setEspecie("perro");
        balto.setAltura(35.5f);
        balto.setPeso(20.5f);
        balto.setEdad(1);
        balto.describirAnimal();
        balto.comer(pollo);
        balto.comer(carne);
    }
}
