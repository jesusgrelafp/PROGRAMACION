package tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Crear un programa en JAVA que lea por teclado una frase e indique la letra
 * que aparece con más frecuencia y las veces que ha aparecido.
 *
 * Las letras mayúsculas y minúsculas se consideran la misma letra.
 *
 * Ejemplo para entrada: [ Hola mundo ]
 * Salida:               [ La letra que más aparece es 'o' y aparece 2 veces. ]
 *
 * Ejemplo para entrada: [ Programacion ]
 * Salida:               [ La letra que más aparece es 'r' y aparece 2 veces. ]
 */
public class LetraMasFrecuente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        char letraMasFrecuente = ' ';
        int mayorFrecuencia = 0;

        for (int i = 0; i < frase.length(); i++) {

            char letra = Character.toLowerCase(frase.charAt(i));

            // Solo contamos letras.
            if (Character.isLetter(letra)) {

                int frecuencia = 0;

                // Contamos cuántas veces aparece esta letra.
                for (int j = 0; j < frase.length(); j++) {
                    char otraLetra = Character.toLowerCase(frase.charAt(j));

                    if (letra == otraLetra) {
                        frecuencia++;
                    }
                }

                // Comprobamos si es la letra más frecuente encontrada.
                if (frecuencia > mayorFrecuencia) {
                    mayorFrecuencia = frecuencia;
                    letraMasFrecuente = letra;
                }
            }
        }

        if (mayorFrecuencia > 0) {
            System.out.println("La letra que más aparece es '"
                    + letraMasFrecuente + "' y aparece "
                    + mayorFrecuencia + " veces.");
        } else {
            System.out.println("La frase no contiene ninguna letra.");
        }

        sc.close();
    }
}