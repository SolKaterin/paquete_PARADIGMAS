package ej_11.Bytes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes {

    public static void main(String[] args) throws IOException{

        FileOutputStream out = new FileOutputStream("D:\\salida.txt");
        String string = "¡Buenas! todo bien";
        byte[] pepe = new byte[10];
        pepe = string.getBytes();
        out.write(pepe);

        FileOutputStream out2 = new FileOutputStream("D:\\salida2.txt");
        DataOutputStream dataOut = new DataOutputStream(out2);
        dataOut.writeFloat(5.5f);
        dataOut.writeDouble(1111111);
        dataOut.writeBoolean(true);
        dataOut.flush();

        FileInputStream in = new FileInputStream("D:\\salida2.txt");
        DataInputStream dataIn = new DataInputStream(in);

        float pepa =  dataIn.readFloat();
        System.out.println(pepa);
        double pepa2 = dataIn.readDouble();
        System.out.println(pepa2);
        boolean pepa3 = dataIn.readBoolean();
        System.out.println(pepa3);
        long l= dataIn.readLong();
        System.out.println(l);

    }

}
