package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase creada para gestionar los datos almacenados en archivos .txt.
 */
public class GestorDatos
{
    /**
     * Método para leer archivos ".txt"
     * se debe ingresar un String con el nombre del archivo para leer
     * @param archivoParaLeer archivo .txt que se requiere leer
     * @return una lista de valores [valor1, valor2, valor3, valor4]
     */
    public static List<String> gestorDatos(String archivoParaLeer)
    {
        // Se crea una lista vacía llamada "Líneas"
        List<String> lineas = new ArrayList<>();

        // Se implementa un "Buffered reader" para leer el archivo TXT
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoParaLeer)))
        {
            // Se crea una variable String vacía
            String linea;
            // se implementa un bucle WHILE que lee cada línea del archivo .txt y agrega contenido a la lista "Lineas" mientras no se encuentre vacío el archivo:
            while ((linea = lector.readLine()) != null)
            {
                lineas.add(linea);
            }
            return lineas; // devuelve una lista "Líneas" con los datos almacenados
        }
        // En caso de que no se pueda leer el archivo lanza una excepción:
        catch (IOException e)
        {
            System.err.println("Error al leer el archivo." + e.getMessage());
            return null;
        }
    }
}