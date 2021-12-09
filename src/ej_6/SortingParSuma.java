package ej_6;
//Ejercicio 6//
public class SortingParSuma implements Ordenable {
    private int n1;
    private int n2;

    public SortingParSuma(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    @Override
    public int compareTo(Object o) {
        SortingParSuma in = (SortingParSuma)o;
        int sumaPar = n1 + n2;
        int sumaIn = in.n1 + in.n2;

        int res=0;
        if (sumaPar < sumaIn) {res = -1;}
        if (sumaPar > sumaIn) {res = 1;}

        return res;
    }

    @Override
    public String toString() {
        return "ParSuma numero1: " + n1 + ", numero2: " + n2;
    }
}
