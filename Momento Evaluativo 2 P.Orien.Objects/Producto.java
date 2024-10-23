// Clase abstracta Producto: Base para los productos como cámaras o impresiones.

public abstract class Producto {

    protected int numero; // Atributo que almacena el número del producto.

    // Constructor que inicializa el número del producto.

    public Producto(int numero) {
        this.numero = numero;
    }

    // Método para obtener el número del producto.

    public int getNumero() {
        return numero;
    }

    // Método abstracto que obliga a las subclases a implementar una descripción específica.
      
    public abstract String getDescripcion();
}
