package ej_7;
//Ejercicio 7//
public class BancoObjeto {

    public static void main(String[] args) {

        ColaBancoPersona pedro = new ColaBancoPersona("Pedro", 11223345, 20);
        ColaBancoPersona juan = new ColaBancoPersona("Juan", 11223346, 25);
        ColaBancoPersona jacob = new ColaBancoPersona("Jacob", 11223347, 30);
        ColaDelBanco colaDelBanco = new ColaDelBanco();

        colaDelBanco.add(pedro);
        colaDelBanco.add(juan);
        colaDelBanco.add(jacob);

        System.out.println(colaDelBanco.colaDelBanco.toString());
        System.out.println(colaDelBanco.answer());
        System.out.println(colaDelBanco.colaDelBanco.toString());

    }

}
