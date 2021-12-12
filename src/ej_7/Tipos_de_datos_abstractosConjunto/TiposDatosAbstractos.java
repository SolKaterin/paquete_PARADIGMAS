package ej_7.Tipos_de_datos_abstractosConjunto;

public class TiposDatosAbstractos {

    public static void main(String[] args) {

        Integer enteroPar;
        enteroPar = 10;
        Integer enteroImpar;
        enteroImpar = 7;
        Float decimal;
        decimal = 7.5f;

        Conjunto conjunto = new IntegerImp();
        boolean unEnteroPar = conjunto.pertenece(enteroPar);
        boolean unEnteroImpar = conjunto.pertenece(enteroImpar);
        boolean unDecimal = conjunto.pertenece(decimal);

        System.out.println(unEnteroPar);
        System.out.println(unEnteroImpar);
        System.out.println(unDecimal);

        String string = "un string";
        Integer ent;
        ent = 1;
        Character character;
        character = 'c';
        Boolean booleano;
        booleano = Boolean.TRUE;

        ListaImp conjunto2 = new ListaImp();
        conjunto2.add(string);
        conjunto2.add(ent);
        conjunto2.add(booleano);

        System.out.println(conjunto2.lista.contains(string));
        System.out.println(conjunto2.lista.contains(booleano));
        System.out.println(conjunto2.lista.contains(character));

    }

}