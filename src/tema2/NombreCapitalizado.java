package tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Crea un programa que te pida tu nombre y escriba la primera letra en mayúsculas y el resto en minúsculas.
 *
 * Ejemplo para entrada: [ cOChe ]
 * Salida:               [ Coche ]
 *
 */
public class NombreCapitalizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine().trim();
        sc.close();

        if (nombre.length() == 0) {
            System.out.println("Error: no has introducido ningún nombre.");
            return;
        }

        String primera = nombre.substring(0, 1).toUpperCase();
        String resto = nombre.substring(1).toLowerCase();

        System.out.println(primera + resto);
    }
}