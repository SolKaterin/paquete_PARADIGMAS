package segundo_IDEA;
//Ejercicio 2//
public class subClaseAlumno_2 extends AulasV_2_persona{

    private int numero_de_legajo;

    public subClaseAlumno_2(String nombre, String apellido, int dni, String curso, String division, int numero_de_legajo) {
        super(nombre, apellido, dni, curso, division);
        this.numero_de_legajo = numero_de_legajo;
    }

    public int getNumero_de_legajo() {
        return numero_de_legajo;
    }

    public void setNumero_de_legajo(int numero_de_legajo) {
        this.numero_de_legajo = numero_de_legajo;
    }
}
