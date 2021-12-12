package ej_1.Veterinario;

public class Objeto {

    public Objeto(int i) {

    }

    public static void main(String[] args) {

        Animal roco = new Animal();
        Animal balto = new Animal();

        Alimento pollo = new Alimento();
        Alimento carne = new Alimento();

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

    public void setObjeto(int i) {

    }

}
