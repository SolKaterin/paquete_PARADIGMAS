package ej_8;
//Ejercicio 8//
import java.util.Objects;
public class ComparatorExternoProducto {
    private String nombre;
    private Long id;

    public ComparatorExternoProducto(String nombre, Long id) {

        this.setNombre(nombre);
        this.setId(id);

    }

    public String getNombre() {

        return nombre;

    }
    private void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public Long getId() {

        return id;

    }
    private void setId(Long id) {

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
    public String toString() {

        return this.nombre ;

    }

    public int compareTo(Producto o){

        int p = (int) (this.id - o.id);
        return p;

    }

}
