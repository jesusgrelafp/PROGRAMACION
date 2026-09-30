package tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Crea un programa que escriba un triángulo con las letras de una palabra recibida por teclado,
 * mostrando primero la primera letra, luego las dos primeras y así sucesivamente.
 *
 * Ejemplo para entrada: [ Pepe ]
 * Salida:               [ P    ]
 *                       [ Pe   ]
 *                       [ Pep  ]
 *                       [ Pepe ]
 *
 */
public class TrianguloPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        sc.close();

        String linea = "";

        for (int i = 0; i < palabra.length(); i++) {
            linea = linea + palabra.charAt(i);
            System.out.println(linea);
        }
    }
}
