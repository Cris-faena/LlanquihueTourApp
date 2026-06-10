package ui;

import model.Tour;
import java.util.List;
import data.GestorDatos;


/**
 * Clase "Main" para ejecutar el programa
 */
public class Main
{
    public static void main(String[] args)
    {
        // Se crea una lista que lee la información del archivo, utilizando el método "gestorDatos"
        List<String> toursDisponibles = GestorDatos.gestorDatos("src/resources/ListaDeTours.txt");

        // Se implementa una variable contador para añadir al inicio de cada iteración del bucle FOREACH:
        int contador = 0;

        // Se implementa un bucle FOREACH para recorrer el contenido de la lista "Tours Disponibles":
        for(String tour : toursDisponibles)
        {
            // añade un numero al contador:
            contador++;
            // crea un "Array" llamado "partes" con cada elemento de la lista "Tours disponibles":
            String[] partes = tour.split(";");
            // Se crea un nuevo objeto por cada una de las líneas que conforman la lista "TourDisponible", utilizando para ello las partes del arreglo
            Tour tours = new Tour(partes[0], partes[1], Double.parseDouble(partes[2]), Double.parseDouble(partes[3]));

            // Se aplican filtros según requerimientos, utilizando los métodos "getters" (ID, nombre, distancia o precio)
            // Se imprimen los nombres de los diferentes tours disponibles:
            System.out.println(contador + "." + tours.getNombre());
        }
    }
}