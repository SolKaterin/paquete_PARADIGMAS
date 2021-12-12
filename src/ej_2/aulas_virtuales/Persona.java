package ej_2.aulas_virtuales;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String curso;
    protected String division;

    public Persona(String nombre, String apellido, int dni, String curso, String division) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void describir() {
        System.out.println(" Nombre: " + nombre + ", Apellido: "+apellido+", Dia: "
                +dni+", Curso: " + curso + ", Division: "+ division);
    }

    public static void main(String[] args) {

    }
}
