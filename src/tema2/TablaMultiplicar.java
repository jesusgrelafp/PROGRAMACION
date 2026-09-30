package tema2;
import java.util.Scanner;

/**
 * Iniciación a JAVA
 *
 * Introducir un número del 1 al 10 y mostrar su tabla de multiplicar.
 * Si el número no está comprendido entre 1 y 10, se mostrará un error.
 *
 * Ejemplo para entrada: [ 3 ]
 * Salida:               [ 3 x 1 = 3 ]
 *                       [ 3 x 2 = 6 ]
 *                       [ ... ]
 *                       [ 3 x 10 = 30 ]
 *
 */

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 10: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero < 1 || numero > 10) {
            System.out.println("Error: el número debe estar entre 1 y 10.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

