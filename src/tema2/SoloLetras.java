package tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Escribe un programa que indica si todos los caracteres contenidos en un string
 * corresponden a letras (mayúsculas o minúsculas).
 *
 * Ejemplo para entrada: [ Hola ]
 * Salida:               [ La cadena solo contiene letras ]
 *
 * Ejemplo para entrada: [ Hola123 ]
 * Salida:               [ La cadena no contiene solo letras ]
 */
public class SoloLetras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        boolean todasLetras = texto.length() > 0;

        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isLetter(texto.charAt(i))) {
                todasLetras = false;
                break;
            }
        }

        if (todasLetras) {
            System.out.println("La cadena solo contiene letras");
        } else {
            System.out.println("La cadena no contiene solo letras");
        }

        sc.close();
    }
}