package ej_6;
//Ejercicio 6//
public class SortingPersona implements Ordenable{

    private int dni;
    private boolean sexo;

    public SortingPersona(int dni, boolean sexo) {
        this.dni = dni;
        this.sexo = sexo;
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

    @Override
    public int compareTo(Object o) {
        SortingPersona in = (SortingPersona)o;
        int res=0;
        if (dni < in.dni) {res = -1;}
        if (dni > in.dni) {res = 1;}
        if(dni == in.dni && sexo != in.sexo) {
            if (in.sexo == false) {res = -1;}
        }
        return res;
    }

    @Override
    public String toString() {
        return "Persona con DNI: " + dni + ", sexo=" + sexo;
    }
}
