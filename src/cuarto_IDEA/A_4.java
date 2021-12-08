package cuarto_IDEA;
//Ejercicio 4//
public class A_4 {

    protected int num;

    public A_4(int num) {
        this.num = num;
        System.out.println("Estoy construyendo el número: " + num + "con A");
    }

    public int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }

    public void hola() {
        System.out.println("Hola en A");
    }
}
