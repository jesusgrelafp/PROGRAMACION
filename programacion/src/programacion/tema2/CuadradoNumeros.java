package programacion.tema2;

/**
 * Cuadrado con patrón de números
 *
 * Crear un programa en JAVA que dibuje un cuadrado
 * siguiendo el siguiente patrón.
 * Se debe pedir la altura N del cuadrado por teclado.
 *
 * Ejemplo para entrada:
 * altura = 5
 *
 * Salida:
 * 1 2 3 4 5
 * 2 2 3 4 5
 * 3 3 3 4 5
 * 4 4 4 4 5
 * 5 5 5 5 5
 */

import java.util.Scanner;

public class CuadradoNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la altura del cuadrado");
        int altura = entrada.nextInt();

        // altura --> 5
        //
        // fila 0 --> 1 2 3 4 5
        // fila 1 --> 2 2 3 4 5
        // fila 2 --> 3 3 3 4 5
        // fila 3 --> 4 4 4 4 5
        // fila 4 --> 5 5 5 5 5

        int base = altura;

        System.out.println();

        // dibujar el cuadrado
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {

                if (j <= i)
                    System.out.print((i + 1) + " ");
                else
                    System.out.print((j + 1) + " ");
            }

            System.out.println();
        }

        System.out.println();

        entrada.close();
    }
}
