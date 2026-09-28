package programacion.tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Escribe un programa Java que valide la hora representada en un String h
 * con formato HH:MM.
 *
 * Se considera que una hora es válida cuando su longitud es 5 y contiene
 * dos dígitos correctos seguidos de ':' y dos dígitos correctos más.
 *
 * Ejemplo para entrada: [ 14:30 ]
 * Salida:               [ La hora es válida ]
 *
 * Ejemplo para entrada: [ 8:30 ]
 * Salida:               [ La hora no es válida ]
 *
 * Ejemplo para entrada: [ 14.30 ]
 * Salida:               [ La hora no es válida ]
 */
public class ValidarHora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una hora con formato HH:MM: ");
        String h = sc.nextLine();

        boolean horaValida = true;

        // La cadena debe tener exactamente 5 caracteres.
        if (h.length() != 5) {
            horaValida = false;
        } else {
            // Los caracteres de las posiciones 0 y 1 deben ser dígitos.
            if (!Character.isDigit(h.charAt(0))
                    || !Character.isDigit(h.charAt(1))) {
                horaValida = false;
            }

            // El carácter de la posición 2 debe ser ':'.
            if (h.charAt(2) != ':') {
                horaValida = false;
            }

            // Los caracteres de las posiciones 3 y 4 deben ser dígitos.
            if (!Character.isDigit(h.charAt(3))
                    || !Character.isDigit(h.charAt(4))) {
                horaValida = false;
            }
        }

        if (horaValida) {
            System.out.println("La hora es válida");
        } else {
            System.out.println("La hora no es válida");
        }

        sc.close();
    }
}