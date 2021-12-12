package ej_10.Jerarquía_de_excepciones;

public class PersonaYaExisteException extends PersonaException{

    public PersonaYaExisteException() {

        super("La persona ingresada ya existe");
    }

    public PersonaYaExisteException(String m) {

        super(m);
    }

    public void PersonaYaExisteException() {

    }

}
