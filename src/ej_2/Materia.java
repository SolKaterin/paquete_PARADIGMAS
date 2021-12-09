package ej_2;
//Ejercicio 2//
import java.util.List;

public class Materia {
    private String nombre;
    private List<subClaseAlumno> alumnos;
    private subClaseDocente docente;
    private List<AulasVirtualesPersona> participantes;

    public Materia(String nombre, List<subClaseAlumno> alumnos, subClaseDocente docente, List<AulasVirtualesPersona> participantes) {
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.docente = docente;
        this.participantes = participantes;
    }

    public Materia(String paradigmas, subClaseDocente maria) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<subClaseAlumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<subClaseAlumno> alumnos) {
        this.alumnos = alumnos;
    }

    public subClaseDocente getDocente() {
        return docente;
    }

    public void setDocente(subClaseDocente docente) {
        this.docente = docente;
    }

    public List<AulasVirtualesPersona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<AulasVirtualesPersona> participantes) {
        this.participantes = participantes;
    }

    public void registrarAlumno(subClaseAlumno alumno ) {

        this.getAlumnos().add(alumno);

    }

    public List<AulasVirtualesPersona> listaParticipantes() {

        this.getParticipantes().add(docente);
        for(subClaseAlumno alumno : this.alumnos ) {
            this.getParticipantes().add(alumno);
        }

        return participantes;
    }

    public void lista1() {
        if (participantes.size() > 0) {
            System.out.println(" Materia: "+ this.getNombre());
            System.out.println(" Participantes: ");
            for (AulasVirtualesPersona persona : this.participantes) {
                System.out.print(" ");
                System.out.println(persona.getNombre());
            }
        } else {
            System.out.println(" No se puede ver la lista1. ");
        }
    }

    public void lista2() {
        if (participantes.size() > 0) {
            for (AulasVirtualesPersona persona : this.participantes) {
                persona.describir();
            }
        } else {
            System.out.println(" No se puede ver la lista2. ");
        }
    }

    public static void main(String[] args) {

    }

}
