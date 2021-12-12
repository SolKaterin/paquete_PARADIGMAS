package ej_10.Manejo_de_casos_inesperados;

import ej_10.Jerarquía_de_excepciones.PersonaMenorException;
import java.util.HashMap;
import java.util.Map;

public class Persona extends Exception {

    private static Throwable Throwable;
    private String nombre;
    private int dni;
    private int edad;
    private static Map<Integer, Persona> personas = new HashMap<Integer, Persona>();

    public Persona(String nombre, int dni, int edad) {

        super();
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);

    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
    private void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }
    private void setEdad(int edad) {
        this.edad = edad;
    }

    public static Persona creaPersona(String nombre, int dni, int edad) throws IllegalArgumentException {

        if (nombre != null) {

            if (dni > 0) {

                if (edad > 0) {

                    Persona nuevaPersona = new Persona(nombre,edad,dni);
                    try {

                        agregarPersona(nuevaPersona);

                    } catch(Throwable e ) {

                        System.out.println(e.getMessage());
                    }

                    return nuevaPersona;

                } else {
                    IllegalArgumentException e = new IllegalArgumentException(" Ingrese el numero de su edad mayor a cero.");
                    throw e;
                }
            } else  {
                IllegalArgumentException e = new IllegalArgumentException(" Ingrese un numero de dni mayor a cero.");
                throw e;
            }
        } else {
            IllegalArgumentException e = new IllegalArgumentException(" El nombre no puede quedar como espacio vacio.");
            throw e;
        }

    }

    public static void agregarPersona(Persona persona) throws Throwable {

        if (personas.containsKey(persona.dni)) {
            Throwable e = new Throwable();
            throw e;
        } else if (persona.edad < 18) {
            PersonaMenorException e = new PersonaMenorException();
            throw Throwable;
        } else {
            personas.put( persona.dni, persona);
        }

    }

    public static Map<Integer, Persona> getPersonas() {

        return personas;

    }

}
