package ej_10.Runtime_exceptions;

public class RuntimeExceptions {

    public static void main(String[] args) {

        String array [] = new String[3];

        try {

            array[1] = "Manzana";

        } catch(java.lang.ArrayIndexOutOfBoundsException e) {

            System.out.println(e.toString());

        }

        try {
            array [0] = null;
            String arrayBis = array[0];
            System.out.println(array[0].startsWith(arrayBis));

        } catch(java.lang.NullPointerException e) {

            System.out.println(e.toString());

        }

    }

}
