package ej_8;
//Ejercicio 8//
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