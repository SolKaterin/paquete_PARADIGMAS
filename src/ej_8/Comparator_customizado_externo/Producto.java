package ej_8.Comparator_customizado_externo;

import java.util.Objects;

public class Producto implements Comparable<Producto>{

    public int id;
    private String nombre;

    public Producto(String nombre, int id) {
        this.setNombre(nombre);
        this.setId(id);
    }

    public String getNombre() {

        return nombre;

    }
    private void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getId() {

        return id;

    }
    private void setId(int id) {

        this.id = id;

    }

    @Override
    public int hashCode() {

        return Objects.hash(id);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Producto))
            return false;
        Producto otro = (Producto) obj;
        return Objects.equals(id, otro.id);
    }

    @Override
    public int compareTo(Producto o) {
        int p = (int) (this.id - o.id);
        return p;
    }

    @Override
    public String toString() {

        return this.nombre;

    }

}
