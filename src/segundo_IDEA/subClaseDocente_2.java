package segundo_IDEA;
//Ejercicio 2//
public class subClaseDocente_2 extends AulasV_2_persona{
    private double sueldo;


    public subClaseDocente_2(String nombre, String apellido, int dni, String curso, String division, double sueldo) {
        super(nombre, apellido, dni, curso, division);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
