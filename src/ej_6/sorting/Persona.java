package ej_6.sorting;

public class Persona implements Ordenable{

    private int dni;
    private boolean sexo;

    public Persona(int dni, boolean sexo) {

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

        Persona in = (Persona)o;
        int res=0;
        if (dni < in.dni) {

            res = -1;

        }
        if (dni > in.dni) {

            res = 1;

        }
        if(dni == in.dni && sexo != in.sexo) {

            if (in.sexo == false) {

                res = -1;

            }

        }

        return res;

    }

    @Override
    public String toString() {

        return "Persona con DNI: " + dni + ", sexo=" + sexo;

    }

}
