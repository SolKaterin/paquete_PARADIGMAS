package ej_6.tareas;

public class Global {

    static int num;

    public Global() {
        Global.setN(Global.getN() + 1);
    }

    public static int getN() {
        return num;
    }

    public static void setN(int n) {
        Global.num = n;
    }

}
