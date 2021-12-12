package ej_10.Jerarquía_de_excepciones;

public class PersonaMenorException extends PersonaException{

    public PersonaMenorException() {

        super("La edad de la persona ingresada debe ser > 18");
    }

    public PersonaMenorException(String m) {

        super(m);
    }

    public void PersonaMenorException() {

    }

}
