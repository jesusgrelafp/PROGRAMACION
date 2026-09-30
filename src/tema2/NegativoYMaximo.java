package tema2;

import java.util.Scanner;

/**
 * Iniciación a JAVA
 *
 * Introducir 10 números y decir si alguno ha sido negativo e indicar el valor máximo introducido.
 *
 * Ejemplo para entrada: [ 4 -2 9 0 7 3 -5 1 8 6 ]
 * Salida:               [ Se ha introducido algún número negativo ]
 *                       [ Valor máximo: 9 ]
 *
 */
public class NegativoYMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean hayNegativo = false;
        int maximo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = sc.nextInt();

            if (numero < 0) {
                hayNegativo = true;
            }

            // El primer número es, de momento, el máximo
            if (i == 1 || numero > maximo) {
                maximo = numero;
            }
        }
        sc.close();

        if (hayNegativo) {
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No se ha introducido ningún número negativo");
        }
        System.out.println("Valor máximo: " + maximo);
    }
}