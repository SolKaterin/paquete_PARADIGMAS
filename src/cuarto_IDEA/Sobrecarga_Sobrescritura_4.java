package cuarto_IDEA;
//Ejercicio 4//
public class Sobrecarga_Sobrescritura_4 {
    //SOBRESCRITURA
    public void saludar(){
        System.out.println("Hola desde Hijo");
    }

    //SOBRECARGA
    public void saludar(String men){
        System.out.println("Mensaje: "+men);
    }
}
