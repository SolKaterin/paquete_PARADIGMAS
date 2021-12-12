package ej_11.Carácteres;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Carácteres {

    public static void main(String[] args) throws IOException{

        FileOutputStream out = new FileOutputStream("D:\\fichero1.txt");

        out.write(22);
        out.write(44);
        out.write(77);
        out.close();

        FileInputStream in = new FileInputStream("D:\\fichero1.txt");
        StringBuilder builder = new StringBuilder();

        while (true) {

            int pepe  = in.read();
            char pepa= (char) pepe;
            if (pepe == -1) break;
            builder.append(pepa);

        }
        in.close();
        System.out.println(builder);

    }

}
