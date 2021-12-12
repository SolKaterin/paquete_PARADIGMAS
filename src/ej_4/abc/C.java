package ej_4.abc;

public class C extends B {

    public C(int num) {
        super(num);
        System.out.println("Estoy construyendo el numero: " + num);
    }

    @Override
    public void hola() {
        super.hola();
        System.out.println("Hola en C");
    }

}
