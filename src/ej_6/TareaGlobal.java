package ej_6;
//Ejercicio 6//
public class TareaGlobal {

    static int num;

    public TareaGlobal() {
        TareaGlobal.setN(TareaGlobal.getN() + 1);
    }

    public static int getN() {
        return num;
    }

    public static void setN(int n) {
        TareaGlobal.num = n;
    }

}
