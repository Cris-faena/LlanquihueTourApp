package model;

/**
 * Se crea una Clase "Tour" que representa la oferta de viajes de Llanquihue Tour.
 * Esta contiene un ID del tour, el nombre del recorrido, la distancia del recorrido, y su precio en pesos.
 */
public class Tour
{
    private String ID;                  // Atributo "ID" de la clase.
    private String nombre;              // Atributo "nombre" de la clase.
    private double distancia;           // Atributo "distancia" de la clase.
    private double precio;              // Atributo "precio" de la clase.

    // Se implementa un constructor sin parámetros(por defecto):
    public Tour()
    {
        this.ID = "Sin información";
        this.nombre = "Sin nombre";
        this.distancia = 0;
        this.precio = 0;
    }

    // Se implementa un constructor con parámetros:
    public Tour(String ID, String nombre, double distancia, double precio)
    {
        this.ID = ID;
        this.nombre = nombre;
        this.distancia = distancia;
        this.precio = precio;
    }

    // Se implementan los métodos "Getters":

    /**
     * Método que devuelve el "ID" de un objeto creado.
     * @return "ID" del objeto creado.
     */
    public String getID() {return ID;}

    /**
     * Método que devuelve el "nombre" de un objeto creado.
     * @return "nombre" del objeto creado.
     */
    public String getNombre() {return nombre;}

    /**
     * Método que devuelve la "distancia" de un objeto creado.
     * @return "distancia" del objeto creado.
     */
    public double getDistancia() {return distancia;}

    /**
     * Método que devuelve el "precio" de un objeto creado.
     * @return "precio" o valor del objeto creado.
     */
    public double getPrecio() {return precio;}

    // Se implementan los métodos "Setters":

    /**
     * Método que modifica el valor asignado a la variable "ID".
     * @param nuevoID nuevo valor que se quiere asignar a "ID".
     */
    public void setID(String nuevoID) {this.ID = nuevoID;}

    /**
     * Método que modifica el valor asignado a la variable "nombre".
     * @param nuevoNombre nuevo valor que se quiere asignar a "nombre".
     */
    public void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}

    /**
     * Método que modifica el valor asignado a la variable "distancia".
     * @param nuevaDistancia nuevo valor que se quiere asignar a "distancia".
     */
    public void setDistancia(double nuevaDistancia) {this.distancia = nuevaDistancia;}

    /**
     * Método que modifica el valor asignado a la variable "precio".
     * @param nuevoPrecio nuevo valor que se quiere asignar a "precio".
     */
    public void setPrecio(double nuevoPrecio) {this.precio = nuevoPrecio;}

    // Se implementa un Método "toString" para mostrar información relevante del objeto:

    /**
     * Método que devuelve información del objeto creado en forma de cadena de texto.
     * @return ID, nombre, distancia y precio del Tour.
     */
    @Override
    public String toString()
    {
        String descripcionTour = String.format("Detalle del Tour: ID del Tour: %s | Nombre del recorrido: %s | Distancia del recorrido: %.2f Kms. | Precio: $ %.2f", ID, nombre, distancia, precio);
        return descripcionTour;
    }
}
