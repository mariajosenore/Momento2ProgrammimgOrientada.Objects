// Clase Foto: Representa una foto con un fichero.

public class Foto {
    private String fichero; // Atributo que almacena la ubicación del fichero de la foto.

    // Constructor que inicializa el fichero de la foto.

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Método para obtener el fichero de la foto.

    public String getFichero() {
        return fichero;
    }

    // Método para simular la impresión de la foto.
    
    public void print() {
        System.out.println("Imprimiendo foto del fichero: " + fichero);
    }
}
