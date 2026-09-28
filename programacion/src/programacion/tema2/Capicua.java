package programacion.tema2;

import java.util.Scanner;

/**
 * Iniciacion a JAVA
 *
 * Escribir un programa en java para introducir un número entero y obtener como resultado si es o no capicúa.
 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
 * No se pueden utilizar ni variables ni funciones de tipo String.
 *
 * Ejemplo para entrada: [ 12321 ]
 * Salida:               [ El número 12321 es capicúa ]
 *
 * Ejemplo para entrada: [ 12345 ]
 * Salida:               [ El número 12345 no es capicúa ]
 *
 */
public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        sc.close();

        // Se invierte el número (en valor absoluto) extrayendo sus cifras de una en una
        long resto = Math.abs(numero);
        long invertido = 0;
        while (resto != 0) {
            invertido = invertido * 10 + resto % 10;
            resto = resto / 10;
        }

        if (invertido == Math.abs(numero)) {
            System.out.println("El número " + numero + " es capicúa");
        } else {
            System.out.println("El número " + numero + " no es capicúa");
        }
    }
}