// Clase Impresion: Representa una impresión, hereda de Producto.

import java.util.ArrayList;

public class Impresion extends Producto {
    private String color; // Atributo que almacena el color de la impresión.
    private ArrayList<Foto> fotos; // Lista de fotos asociadas a la impresión.

    // Constructor que inicializa el número de producto y el color.

    public Impresion(int numero, String color) {
        
        super(numero); // Llama al constructor de la clase padre Producto.
        this.color = color;
        this.fotos = new ArrayList<>(); // Inicializa la lista de fotos.
    }

    // Método para agregar una foto a la lista de fotos.
    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    // Método para obtener la lista de fotos asociadas a la impresión.
    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    // Implementación del método abstracto de Producto.
    @Override
    public String getDescripcion() {
        return "Impresión en color: " + color + " con " + fotos.size() + " fotos.";
    }
}
