package ej_8.Comparator_customizado_externo;

import java.util.Map;
import java.util.TreeMap;

public class CarritoExterno {

    private Map<Producto, Integer> orden;

    public CarritoExterno() {

    }

    public void iniciarOrden() {

        this.orden = new TreeMap<Producto, Integer>(new Nombre());

    }

    public void cargarProducto(Producto producto, Integer cantidad) {

        orden.put(producto, cantidad);

    }

    public Map<Producto, Integer> getPedido() {

        return orden;

    }
    public void setPedido(Map<Producto, Integer> pedido) {

        this.orden = pedido;

    }

    public static void main(String[] args) {
        Producto krachitos = new Producto("Krachitos", 10001);
        Producto cheetos = new Producto("Cheetos", 10002);
        Producto pehuamar = new Producto("Pehuamar", 10003);

        CarritoExterno miCarrito = new CarritoExterno();
        miCarrito.iniciarOrden();
        miCarrito.cargarProducto(krachitos, 1);
        miCarrito.cargarProducto(cheetos, 3);
        miCarrito.cargarProducto(pehuamar, 2);
        System.out.println(miCarrito.orden);
    }

}
