package ej_8;
//Ejercicio 8//
import java.util.Map;
import java.util.TreeMap;
public class CarritoComprasCarrito {

    private Map<Producto, Integer> orden;

    public CarritoComprasCarrito() {

    }

    public Map<Producto, Integer> getOrden() {

        return orden;
    }

    public void setOrden(Map<Producto, Integer> orden) {

        this.orden = orden;

    }

    public void iniciarOrden() {

        this.orden = new TreeMap<Producto, Integer>();

    }

    public void cargarProducto(Producto producto, Integer cantidad) {

        orden.put(producto, cantidad);

    }

    public static void main(String[] args) {

        Producto krachitos = new Producto("Krachitos", 10001);
        Producto cheetos = new Producto("Cheetos", 10002);
        Producto pehuamar = new Producto("Pehuamar", 10003);

        CarritoComprasCarrito miCarrito = new CarritoComprasCarrito();
        miCarrito.iniciarOrden();
        miCarrito.cargarProducto(krachitos, 1);
        miCarrito.cargarProducto(cheetos, 3);
        miCarrito.cargarProducto(pehuamar, 2);

        System.out.println(miCarrito.orden);

    }

}
