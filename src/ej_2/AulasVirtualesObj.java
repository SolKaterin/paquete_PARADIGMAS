package ej_2;
//Ejercicio 2//
public class AulasVirtualesObj {

    public static void main(String [] args) {

        subClaseAlumno alan = new subClaseAlumno("Alan", "Perez",
                12345678,  "1", "a", 1111111);

        subClaseDocente maria = new subClaseDocente("Maria", "Sanchez",
                10000000, "1", "a", 300000);

        subClaseAlumno java = new subClaseAlumno("Java", "Fernandez",
                112223344, "1", "a", 1111112);

        subClaseDocente adam = new subClaseDocente("Adam", "Suarez",
                10000001, "1", "a", 300500);

        Materia paradigmas_de_programacion = new Materia("Paradigmas", (subClaseDocente) maria);

        paradigmas_de_programacion.registrarAlumno(alan);
        paradigmas_de_programacion.registrarAlumno(java);

        paradigmas_de_programacion.listaParticipantes();
        paradigmas_de_programacion.lista1();
        paradigmas_de_programacion.lista2();
        paradigmas_de_programacion.getParticipantes().get(0).describir();
    }

}
