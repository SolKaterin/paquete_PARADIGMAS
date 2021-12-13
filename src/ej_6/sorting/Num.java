package ej_6.sorting;

public class Num implements Ordenable {

    protected int num;

    public Num(int num){
        this.num = num;
    }

    @Override
    public boolean esMayor(Ordenable o) {
        Num n = (Num) o;
        return this.num > n.num;
    }


    public boolean esIgual(Ordenable o){
        Num n = (Num) o;
        return this.num == n.num;
    }
}