package ej_10;
//Ejercicio 10//
import java.util.ArrayList;
import java.util.List;
public class Error {

    public static class OOMObject {
    }

    public static void main(String[] args) {

        try {
            List<Error.OOMObject> list=new ArrayList<Error.OOMObject>();
            while(true){
                list.add(new Error.OOMObject());
            }
        } catch(OutOfMemoryError e) {

        }
    }
}





