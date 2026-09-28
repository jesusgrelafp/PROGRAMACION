package programacion.tema2;

/**
 * Cuadrado sin relleno alternando dos dígitos
 *
 * Crear un programa en JAVA que dibuje un cuadrado sin relleno
 * formado por dos dígitos que se van alternando.
 * Se debe pedir la altura del cuadrado por teclado.
 * Además, se deben pedir los dos dígitos que se utilizarán
 * para dibujar el cuadrado.
 *
 * Ejemplo para entrada:
 * altura = 5
 * digito1 = 3
 * digito2 = 2
 *
 * Salida:
 * 3 2 3 2 3
 * 2       2
 * 3       3
 * 2       2
 * 3 2 3 2 3
 */

import java.util.Scanner;

public class CuadradoDigitos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la altura del cuadrado: ");
        int altura = entrada.nextInt();

        System.out.print("Introduce el primer dígito: ");
        int digito1 = entrada.nextInt();

        System.out.print("Introduce el segundo dígito: ");
        int digito2 = entrada.nextInt();

        int base = altura;

        System.out.println();

        // cuadrado sin relleno
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {

                // primera fila o última fila
                if (i == 0 || i == altura - 1) {

                    if (j % 2 == 0)
                        System.out.print(digito1 + " ");
                    else
                        System.out.print(digito2 + " ");

                    // primera columna o última columna
                } else if (j == 0 || j == base - 1) {

                    if (i % 2 == 0)
                        System.out.print(digito1 + " ");
                    else
                        System.out.print(digito2 + " ");

                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();

        entrada.close();
    }
}
