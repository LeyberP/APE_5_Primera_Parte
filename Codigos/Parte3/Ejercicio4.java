package Parte3;
import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        File archivo = new File("datos/temporal.txt");

        if (!archivo.exists()) {
            try {
                archivo.getParentFile().mkdirs(); // crea la carpeta "datos" si no existe
                archivo.createNewFile();
                System.out.println("Archivo creado: datos/temporal.txt");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe.");
        }

        boolean confirmarBorrado = true;

        if (confirmarBorrado) {
            boolean resultado = archivo.delete();
            System.out.println("Resultado de la eliminación: " + resultado);
        }
    }
}
