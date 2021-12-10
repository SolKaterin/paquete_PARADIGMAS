package ej_7;
//Ejercicio 7//
import java.util.Objects;
public class ColaBancoPersona {

    String nombre;
    int dni;
    int edad;

    public ColaBancoPersona( String nombre, int dni, int edad )  {

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getDni() {

        return dni;

    }

    public void setDni(int dni) {

        this.dni = dni;

    }

    public int getEdad() {

        return edad;

    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p== null || getClass() != p.getClass()) return false;
        ColaBancoPersona persona= (ColaBancoPersona) p;
        return Objects.equals(this.dni, persona.dni);
    }
    @Override
    public String toString() {

        return "nombre: " + nombre + ", dni: " + dni + ", edad: " + edad;

    }

}
