package Parte3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("materias.txt"));

            writer.write("Programación Orientada a Objetos");
            writer.newLine();
            writer.write("Cálculo Diferencial");
            writer.newLine();
            writer.write("Metodología de la Investigación");
            writer.newLine();
            writer.write("Álgebra Lineal");
            writer.newLine();
            writer.write("Inglés Técnico");
            writer.newLine();

            writer.close();
            System.out.println("Archivo materias.txt creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
