package ej_8.Diccionario;

import ej_8.Palabras;

abstract public class Buscador {

    public static String buscar(String input) {
        if (Diccionario.getDiccionario().isEmpty()) Diccionario.cargarDatos();
        return 	Diccionario.retornarDefiniciones(Diccionario.getDiccionario(),
                Palabras.separadorOrdenado(input)).toString();
    }

    public static void main(String[] args) {

        String res = Buscador.buscar("¡buenas!");
        System.out.println(res);
    }

}