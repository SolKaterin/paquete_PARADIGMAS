package ej_6.sorting;

public class Par implements Ordenable {

    protected int n1;
    protected int n2;

    public Par(int n1, int n2) {
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
        Par in = (Par)o;
        int res=0;
        if (n1 < in.n1 ) {res = -1;}
        if (n1 > in.n1 ) {res = 1;}
        if(n1 == in.n1) {
            if (n2 < in.n2) {res = -1;}
        }

        return res;
    }

    @Override
    public String toString() {
        return "Par numero1: " + n1 + ", numero2: " + n2;
    }
}
