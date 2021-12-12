package ej_5.equals_protected;

public class Perro extends Animal {
    private String raza;

    private Perro(String especie, Integer peso, String raza) {
        super(peso, especie);
        this.raza = raza;
    }

    public static Perro crearPerro(String especie, Integer peso, String raza) {
        return new Perro (especie,peso,raza);
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        Perro perro = (Perro) o;
        return this.raza == perro.raza;
    }

}
