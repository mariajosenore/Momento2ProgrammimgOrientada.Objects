public class Main {
    public static void main(String[] args) {

        // Crear un cliente
        Cliente cliente = new Cliente("123456789", "María José");

        // Crear productos

        Impresion impresion = new Impresion(1, "Color");
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.png");
        impresion.agregarFoto(foto1); // Agregar fotos a la impresión
        impresion.agregarFoto(foto2);

        Camara camara = new Camara(2, "Canon", "EOS Rebel");

        // Crear pedido
         
        Pedido pedido = new Pedido(cliente, 987654321); // Agregar cliente y tarjeta de crédito
        pedido.agregarProducto(impresion); // Agregar impresión al pedido
        pedido.agregarProducto(camara); // Agregar cámara al pedido

        // Mostrar información del pedido
        pedido.mostrarPedido();

        // Imprimir foto individual
        foto1.print();
    }
}
