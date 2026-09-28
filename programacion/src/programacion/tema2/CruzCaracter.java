package programacion.tema2;

/**
 * Cruz con un carácter
 *
 * Crear un programa en JAVA que dibuje una cruz de altura N
 * formada por un carácter C introducido por teclado.
 * La altura introducida debe ser impar.
 *
 * Ejemplo para entrada:
 * altura = 5
 * caracter = O
 *
 * Salida:
 *         O
 *         O
 *     O O O O O
 *         O
 *         O
 *
 * NOTA:
 * Pensad una posible solución para N par.
 */

import java.util.Scanner;

public class CruzCaracter {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la altura de la cruz: ");
        int altura = entrada.nextInt();

        System.out.print("Introduce el carácter: ");
        char caracter = entrada.next().charAt(0);

        // altura --> 5
        // La altura debe ser impar
        //
        // La posición central es:
        // altura / 2 --> 5 / 2 --> 2
        //
        // fila 0 -->       O
        // fila 1 -->       O
        // fila 2 --> O O O O O
        // fila 3 -->       O
        // fila 4 -->       O

        int centro = altura / 2;

        System.out.println();

        // dibujar la cruz
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura; j++) {

                // columna central o fila central
                if (i == centro || j == centro)
                    System.out.print(caracter + " ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        System.out.println();

        entrada.close();
    }
}
