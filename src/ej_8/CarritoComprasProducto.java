package ej_8;
//Ejercicio 8//
import java.util.Objects;
public class CarritoComprasProducto implements Comparable<Producto>{

    String nombre;
    int id;

    public CarritoComprasProducto(String nombre, int id) {
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
        Producto other = (Producto) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int compareTo(Producto o) {
        int diff = (int) (this.id - o.id);
        return diff;
    }

    @Override
    public String toString() {

        return this.nombre ;

    }
}
