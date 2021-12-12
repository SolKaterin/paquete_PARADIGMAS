package ej_2.aulas_virtuales;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Alumno> alumnos;
    private Docente docente;
    private List<Persona> participantes;

    public Materia(String nombre, List<Alumno> alumnos, Docente docente, List<Persona> participantes) {
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.docente = docente;
        this.participantes = participantes;
    }

    public Materia(String paradigmas, Docente maria) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Persona> participantes) {
        this.participantes = participantes;
    }

    public void registrarAlumno(Alumno alumno ) {

        this.getAlumnos().add(alumno);

    }

    public List<Persona> listaParticipantes() {

        this.getParticipantes().add(docente);
        for(Alumno alumno : this.alumnos ) {
            this.getParticipantes().add(alumno);
        }

        return participantes;
    }

    public void lista1() {
        if (participantes.size() > 0) {
            System.out.println(" Materia: "+ this.getNombre());
            System.out.println(" Participantes: ");
            for (Persona persona : this.participantes) {
                System.out.print(" ");
                System.out.println(persona.getNombre());
            }
        } else {
            System.out.println(" No se puede ver la lista1. ");
        }
    }

    public void lista2() {
        if (participantes.size() > 0) {
            for (Persona persona : this.participantes) {
                persona.describir();
            }
        } else {
            System.out.println(" No se puede ver la lista2. ");
        }
    }

    public static void main(String[] args) {

    }
}
