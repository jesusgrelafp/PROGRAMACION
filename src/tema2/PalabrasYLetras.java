package tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Crea un programa en JAVA que lea por teclado una cadena de texto e indique la cantidad de palabras
 * y la cantidad de letras que tiene. Los espacios y los signos de puntuación no cuentan como letras.
 *
 * Ejemplo para entrada: [ Hoy es viernes ]
 * Salida:               [ La frase tiene 3 palabras y 12 letras ]
 *
 */
public class PalabrasYLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();
        sc.close();

        int palabras = 0;
        int letras = 0;

        for (int i = 0; i < texto.length(); i++) {
            char actual = texto.charAt(i);

            if (Character.isLetter(actual)) {
                letras++;
            }

            // Una palabra empieza cuando hay un carácter que no es espacio
            // y el anterior es un espacio (o estamos al principio del texto)
            boolean esEspacio = Character.isWhitespace(actual);
            if (!esEspacio && (i == 0 || Character.isWhitespace(texto.charAt(i - 1)))) {
                palabras++;
            }
        }

        System.out.println("La frase tiene " + palabras + " palabras y " + letras + " letras");
    }
}