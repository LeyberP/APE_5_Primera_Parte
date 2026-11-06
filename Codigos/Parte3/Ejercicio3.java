package Parte3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("materias.txt", true));

            writer.write("Física General");
            writer.newLine();
            writer.write("Estadística y Probabilidad");
            writer.newLine();

            writer.close();
            System.out.println("Asignaturas añadidas al final del archivo.");
        } catch (IOException e) {
            System.out.println("Error al añadir al archivo: " + e.getMessage());
        }
    }
}
