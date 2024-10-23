// Clase Pedido: Representa un pedido que contiene productos y está asociado a un cliente.

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente; // Asociación débil (agregación) con un cliente.
    private ArrayList<Producto> productos; // Lista de productos en el pedido.
    private Date fecha; // Fecha del pedido.
    private int numeroTarjetaCredito; // Número de tarjeta de crédito asociado al pago.

    // Constructor que inicializa el cliente y la tarjeta de crédito.

    public Pedido(Cliente cliente, int numeroTarjetaCredito) {

        this.cliente = cliente; // Asociación agregada de un cliente.
        this.productos = new ArrayList<>(); // Inicializa la lista de productos.
        this.fecha = new Date(); // Asigna la fecha actual.
        this.numeroTarjetaCredito = numeroTarjetaCredito; // Asigna el número de tarjeta.
    }

    // Método para agregar productos al pedido.

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para mostrar la información del pedido.

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNombre()); // Muestra el nombre del cliente.
        System.out.println("Fecha del pedido: " + fecha); // Muestra la fecha del pedido.
        System.out.println("Número de tarjeta de crédito: " + numeroTarjetaCredito); // Muestra el número de tarjeta.
        for (Producto producto : productos) {
            
            // Polimorfismo: Llama al método getDescripcion() de diferentes tipos de productos.
            System.out.println("Producto: " + producto.getDescripcion());
        }
    }
}
