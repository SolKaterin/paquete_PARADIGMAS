package ej_5;
//Ejercicio 5//
public class subClasePerro extends EqualsProtectedAnimal {
    private String raza;

    private subClasePerro(String especie, Integer peso, String raza) {
        super(peso, especie);
        this.raza = raza;
    }

    public static subClasePerro crearPerro(String especie, Integer peso, String raza) {
        return new subClasePerro(especie,peso,raza);
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        subClasePerro perro = (subClasePerro) o;
        return this.raza == perro.raza;
    }

}
