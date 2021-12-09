package ej_2;
//Ejercicio 2//
public class subClaseMedico extends profesionalDeLaSalud {

    private int matricula;
    private String especializacion;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
