
// Clase Cliente: Representa un cliente con cédula y nombre.

public class Cliente {

    private String cedula; // Atributo que almacena la cédula del cliente.
    private String nombre; // Atributo que almacena el nombre del cliente.

    // Constructor que inicializa los atributos de la clase Cliente.

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Método para obtener la cédula del cliente.
    public String getCedula() {
        return cedula;
    }

     // Método para obtener el nombre del cliente.
    public String getNombre() {
        return nombre;
    }
}

