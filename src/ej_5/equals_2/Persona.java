package ej_5.equals_2;

public class Persona {
    private int dni;
    private boolean sexo;
    private String nombre;

    public Persona(int dni, boolean sexo, String nombre) {
        this.dni = dni;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Persona persona = (Persona)p;
        return dni == persona.dni && sexo == persona.sexo;
    }

    public static void main(String [] args) {
        Persona pepita = new Persona(11335577, true, "Pepita");
        Persona pepita2 = new Persona(11335577, true, "Pepi");

        System.out.println(pepita.equals(pepita2)); // true
        System.out.println(pepita == pepita2); // false
    }

}