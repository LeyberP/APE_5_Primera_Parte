package Parte3;
import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            try {
                archivo.getParentFile().mkdirs(); // crea la carpeta "datos" si no existe
                boolean creado = archivo.createNewFile();
                if (creado) {
                    System.out.println("Archivo creado exitosamente.");
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        System.out.println("Nombre : " + archivo.getName());
        System.out.println("Ruta   : " + archivo.getPath());
    }
}
