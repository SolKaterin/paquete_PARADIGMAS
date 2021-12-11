package ej_11;
//Ejercicio 11//
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class Excepciones {

    public static void main(String[] args) throws IOException {

        try {

            FileInputStream in = new FileInputStream("D:\\fichero1.txt\\No se encontro el archivo");

        } catch(FileNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            FileOutputStream out = new FileOutputStream("D:\\fichero1.txt\\Se produjo un error");
            OutputStreamWriter fileWriter = new OutputStreamWriter(out);
            String string = "¡Buenas! todo bien";
            fileWriter.close();
            fileWriter.write(string);

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}
