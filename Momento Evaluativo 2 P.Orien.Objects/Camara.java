// Clase Camara: Representa una cámara, hereda de Producto.

public class Camara extends Producto {
    private String marca;  // Atributo que almacena la marca de la cámara.
    private String modelo; // Atributo que almacena el modelo de la cámara.

    // Constructor que inicializa el número de producto, la marca y el modelo.

    public Camara(int numero, String marca, String modelo) {
        super(numero); // Llama al constructor de la clase padre Producto.
        this.marca = marca;
        this.modelo = modelo;
    }

    // Implementación del método abstracto de Producto.
    
    @Override
    public String getDescripcion() {
        return "Cámara " + marca + " modelo " + modelo;
    }
}
