package programacion.tema2;

/**
 * Iniciación en JAVA
 *
 * Crea un programa en JAVA que dado un número, nos muestre dicho número con las cifras invertidas.
 * No se pueden utilizar variables de tipo String.
 *
 * Ejemplo para entrada: [ 12345 ]
 * Salida:               [ 54321 ]
 *
 */

import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        sc.close();

        System.out.print("Número invertido: ");

        if (numero < 0) {
            System.out.print('-');
        }

        if (numero == 0) {
            System.out.print(0);
        }

        // Se extrae la última cifra en cada vuelta y se imprime directamente,
        // de modo que las cifras salen en orden inverso (sin usar Strings).
        while (numero != 0) {
            System.out.print(Math.abs(numero % 10));
            numero = numero / 10;
        }

        System.out.println();
    }
}