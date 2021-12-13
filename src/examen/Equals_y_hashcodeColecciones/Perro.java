package examen.Equals_y_hashcodeColecciones;

import java.util.*;
import java.util.Objects;

public class Perro implements Comparable{

    protected String nombre;
    protected int cantPulgas;

    public Perro(String nombre, int cantPulgas) {

        this.nombre = nombre;
        this.cantPulgas = cantPulgas;

    }

    public int getCantPulgas() {
        return cantPulgas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals (Object o1) {
        if (this == o1)
            return true;
        if (o1 == null || getClass() != o1.getClass())
            return false;
        Perro perro = (Perro) o1;
        return cantPulgas == perro.cantPulgas && nombre.equals(perro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantPulgas);
    }

    @Override
    public int compareTo(Object o2) {
        Perro dog = (Perro) o2;
        return  nombre.compareTo( dog.nombre);
    }

    @Override
    public String toString() {
        return " El nombre del perro es: " + nombre + " y tiene " + cantPulgas + " pulgas";
    }

    public static void main(String[] args) {

        Perro roco = new Perro(" Roco ", 6);
        Perro balto = new Perro(" Balto ", 3);
        Perro chato = new Perro(" Chato ", 9);

        System.out.println(" ");

        Map<String, Perro> duenio = new HashMap<>();

        duenio.put(" Pedro", roco);
        duenio.put(" Juan", balto);
        duenio.put(" Jacob", chato);

        System.out.println( duenio );

        Set<Perro> myDogs = new HashSet<>();

        myDogs.add(roco);
        myDogs.add(balto);
        myDogs.add(chato);

        System.out.println( "\n" +myDogs);

        Set<Perro> dogsName = new TreeSet<>();

        dogsName.add(roco);
        dogsName.add(balto);
        dogsName.add(chato);

        System.out.println("\n" +dogsName);

        Set<Perro> dogsPulgas = new TreeSet<>(new Comparator<Perro>() {
            @Override
            public int compare(Perro o1, Perro o2) { return o1.getCantPulgas() - o2.getCantPulgas();}});
        dogsPulgas.add(roco);
        dogsPulgas.add(balto);
        dogsPulgas.add(chato);

        System.out.println("\n" + dogsPulgas);

    }

}
