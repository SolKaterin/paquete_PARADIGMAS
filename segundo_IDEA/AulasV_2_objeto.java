package segundo_IDEA;
//Ejercicio 2//
public class AulasV_2_objeto {

    public static void main(String [] args) {

        subClaseAlumno_2 alan = new subClaseAlumno_2("Alan", "Perez",
                12345678,  "1", "a", 1111111);

        subClaseDocente_2 maria = new subClaseDocente_2("Maria", "Sanchez",
                10000000, "1", "a", 300000);

        subClaseAlumno_2 java = new subClaseAlumno_2("Java", "Fernandez",
                112223344, "1", "a", 1111112);

        subClaseDocente_2 adam = new subClaseDocente_2("Adam", "Suarez",
                10000001, "1", "a", 300500);

        Materia_2 paradigmas_de_programacion = new Materia_2("Paradigmas", (subClaseDocente_2) maria);

        paradigmas_de_programacion.registrarAlumno(alan);
        paradigmas_de_programacion.registrarAlumno(java);

        paradigmas_de_programacion.listaParticipantes();
        paradigmas_de_programacion.lista1();
        paradigmas_de_programacion.lista2();
        paradigmas_de_programacion.getParticipantes().get(0).describir();
    }

}
