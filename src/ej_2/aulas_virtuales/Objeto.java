package ej_2.aulas_virtuales;

public class Objeto {

    public static void main(String [] args) {

        Alumno alan = new Alumno("Alan", "Perez",
                12345678,  "1", "a", 1111111);

        Docente maria = new Docente("Maria", "Sanchez",
                10000000, "1", "a", 300000);

        Alumno java = new Alumno("Java", "Fernandez",
                112223344, "1", "a", 1111112);

        Docente adam = new Docente("Adam", "Suarez",
                10000001, "1", "a", 300500);

        Materia paradigmas_de_programacion = new Materia("Paradigmas", (Docente) maria);

        paradigmas_de_programacion.registrarAlumno(alan);
        paradigmas_de_programacion.registrarAlumno(java);
        paradigmas_de_programacion.listaParticipantes();
        paradigmas_de_programacion.lista1();
        paradigmas_de_programacion.lista2();
        paradigmas_de_programacion.getParticipantes().get(0).describir();

        //Ejercicios_5:
        int dniAlan = alan.dni;
        int dniMaria = maria.dni;
        System.out.println(" Dni de Alan: " + dniAlan + " Dni de Maria: "+ dniMaria );
    }
}
