package tema2;

import java.util.Scanner;

/**
 *
 * Escribe un programa en Java que solicite un valor entero al usuario.
 * A continuación muestra un mensaje indicando si es par o impar.
 */
public class ParImparTernario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un valor entero: ");
        int numero = scanner.nextInt();

        // Uso del operador ternario para determinar si es par o impar
        String resultado = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("El número " + numero + " es " + resultado + ".");

        // Cerrar el scanner
        scanner.close();
    }
}
