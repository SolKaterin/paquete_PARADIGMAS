package ej_10;
//Ejercicio 10//
public class PersonaYaExisteException extends PersonaException{
    public PersonaYaExisteException() {
        super("La persona ingresada ya existe");
    }

    public PersonaYaExisteException(String m) {
        super(m);
    }

    public boolean getMessage() {
        return false;
    }

    public void PersonaYaExisteException() {

    }

}
