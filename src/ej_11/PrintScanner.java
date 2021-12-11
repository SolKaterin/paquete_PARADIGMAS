package ej_11;
//Ejercicio 11//
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PrintScanner {

    public static void main(String[] args) throws IOException{

        FileWriter pepa = new FileWriter("D:\\fichero2.txt");
        PrintWriter pepa2 = new PrintWriter(pepa);
        String s = "¡Buenas!";
        pepa2.println(1);
        pepa2.println(s);
        pepa2.println("Adios");
        pepa2.flush();

        FileReader pepe = new FileReader("D:\\fichero2.txt");
        Scanner in = new Scanner(pepe);
        StringBuilder builder = new StringBuilder();
        int contador = 0;

        while(true) {

            if(!in.hasNext()) break;
            String lin = in.nextLine() ;
            builder.append(lin + "\n");
            contador++;

        }
        System.out.println(builder);
        System.out.println("Numero de lineas: " + contador);

    }

}
