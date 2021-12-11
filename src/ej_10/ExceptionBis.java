package ej_10;
//Ejercicio 10//
public class ExceptionBis {

    public ExceptionBis(String m) {
    }

    public ExceptionBis() {

    }

    public static void main(String[] args) throws Exception {

        try {

            boolean impar =impar(1);
            System.out.println(impar);

        } catch(Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public static boolean impar(int n) throws Exception {

        if (n == 0)  {

            Exception e = new Exception("Se ha producido un error");
            throw e;

        } else if (n % 2 == 1) {

            return true;

        } else {

            return false;

        }

    }

}
