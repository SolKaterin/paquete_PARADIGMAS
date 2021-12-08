package cuarto_IDEA;
//Ejercicio 4//
public class C_4 extends B_4{

    public C_4(int num) {
        super(num);
        System.out.println("Estoy construyendo el numero: " + num);
    }

    @Override
    public void hola() {
        super.hola();
        System.out.println("Hola en C");
    }

}
