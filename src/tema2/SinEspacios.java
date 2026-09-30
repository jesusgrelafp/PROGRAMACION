package tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Escribe un programa que devuelve una cadena sin caracteres de espacio
 * en blanco a partir de la cadena indicada como parámetro.
 *
 * Ejemplo para entrada: [ Hola mundo ]
 * Salida:               [ Holamundo ]
 *
 * Ejemplo para entrada: [ Hola, ¿qué tal? ]
 * Salida:               [ Hola,¿quétal? ]
 */
public class SinEspacios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            // En lugar de comprobar solamente " ", se usa isWhitespace() ya que esta función también detecta tabuladores,
            // saltos de línea y otros caracteres considerados espacios en blanco.
            if (!Character.isWhitespace(texto.charAt(i))) {
                resultado += texto.charAt(i);
            }
        }

        System.out.println("Cadena sin espacios en blanco: " + resultado);

        sc.close();
    }
}