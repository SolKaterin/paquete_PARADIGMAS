package ej_7.Cola_del_banco;

public class Objeto {

    public static void main(String[] args) {

        Persona pedro = new Persona("Pedro", 11223345, 20);
        Persona juan = new Persona("Juan", 11223346, 25);
        Persona jacob = new Persona("Jacob", 11223347, 30);
        ColaDelBanco colaDelBanco = new ColaDelBanco();

        colaDelBanco.add(pedro);
        colaDelBanco.add(juan);
        colaDelBanco.add(jacob);

        System.out.println(colaDelBanco.colaDelBanco.toString());
        System.out.println(colaDelBanco.answer());
        System.out.println(colaDelBanco.colaDelBanco.toString());

    }

}
