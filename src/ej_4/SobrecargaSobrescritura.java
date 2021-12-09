package ej_4;
//Ejercicio 4//
public class SobrecargaSobrescritura {
    //SOBRESCRITURA
    public void saludar(){
        System.out.println("Hola desde Hijo");
    }

    //SOBRECARGA
    public void saludar(String men){
        System.out.println("Mensaje: "+men);
    }
}
