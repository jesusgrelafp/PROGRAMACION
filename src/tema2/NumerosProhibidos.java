package tema2;

import java.util.Scanner;

public class NumerosProhibidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo N: ");
        int n = entrada.nextInt();

        System.out.println("\nImprimiendo números del 1 al " + n + " (saltando múltiplos de 3 y de 5):");

        for (int i = 1; i <= n; i++) {
            // Si el número es múltiplo de 3 o múltiplo de 5, lo ignoramos
            if (i % 3 == 0 || i % 5 == 0) {
                continue; // Salta a la siguiente iteración sin imprimir
            }

            System.out.println(i);
        }

        entrada.close();
    }
}