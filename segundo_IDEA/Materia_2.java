package segundo_IDEA;
//Ejercicio 2//
import java.util.List;

public class Materia_2 {
    private String nombre;
    private List<subClaseAlumno_2> alumnos;
    private subClaseDocente_2 docente;
    private List<AulasV_2_persona> participantes;

    public Materia_2(String nombre, List<subClaseAlumno_2> alumnos, subClaseDocente_2 docente, List<AulasV_2_persona> participantes) {
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.docente = docente;
        this.participantes = participantes;
    }

    public Materia_2(String paradigmas, subClaseDocente_2 maria) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<subClaseAlumno_2> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<subClaseAlumno_2> alumnos) {
        this.alumnos = alumnos;
    }

    public subClaseDocente_2 getDocente() {
        return docente;
    }

    public void setDocente(subClaseDocente_2 docente) {
        this.docente = docente;
    }

    public List<AulasV_2_persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<AulasV_2_persona> participantes) {
        this.participantes = participantes;
    }

    public void registrarAlumno(subClaseAlumno_2 alumno ) {

        this.getAlumnos().add(alumno);

    }

    public List<AulasV_2_persona> listaParticipantes() {

        this.getParticipantes().add(docente);
        for(subClaseAlumno_2 alumno : this.alumnos ) {
            this.getParticipantes().add(alumno);
        }

        return participantes;
    }

    public void lista1() {
        if (participantes.size() > 0) {
            System.out.println(" Materia: "+ this.getNombre());
            System.out.println(" Participantes: ");
            for (AulasV_2_persona persona : this.participantes) {
                System.out.print(" ");
                System.out.println(persona.getNombre());
            }
        } else {
            System.out.println(" No se puede ver la lista1. ");
        }
    }

    public void lista2() {
        if (participantes.size() > 0) {
            for (AulasV_2_persona persona : this.participantes) {
                persona.describir();
            }
        } else {
            System.out.println(" No se puede ver la lista2. ");
        }
    }

    public static void main(String[] args) {

    }

}
