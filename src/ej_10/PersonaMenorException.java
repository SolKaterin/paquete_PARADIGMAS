package ej_10;
//Ejercicio 10//
public class PersonaMenorException extends PersonaException {
    public PersonaMenorException() {
        super("La edad de la persona ingresada debe ser > 18");
    }

    public PersonaMenorException(String m) {
        super(m);
    }

    public void getMessage() {
    }

    public void PersonaMenorException() {

    }

}
