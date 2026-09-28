package programacion.tema2;

import java.util.Scanner;

/**
 * Iniciación a JAVA
 *
 * Crea un programa en JAVA que dibuje N-1 cuadrados de lado 2 hasta lado N. Es decir, de pequeño a grande.
 * Los cuadrados estarán formados por el carácter que hace referencia a la longitud del lado.
 * Si N es menor que 2, se mostrará un error.
 *
 * Ejemplo para N=3:
 * Salida:               [ 2 2   ]
 *                       [ 2 2   ]
 *                       [ 3 3 3 ]
 *                       [ 3 3 3 ]
 *                       [ 3 3 3 ]
 *
 */
public class CuadradosCrecientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de N (mínimo 2): ");
        int n = sc.nextInt();
        sc.close();

        if (n < 2) {
            System.out.println("Error: N debe ser mayor o igual que 2.");
            return;
        }

        // Cada vuelta dibuja un cuadrado cuyo lado va desde 2 hasta N
        for (int lado = 2; lado <= n; lado++) {
            for (int fila = 1; fila <= lado; fila++) {
                String linea = "";
                for (int columna = 1; columna <= lado; columna++) {
                    linea = linea + lado;
                    if (columna < lado) {
                        linea = linea + " ";
                    }
                }
                System.out.println(linea);
            }
        }
    }
}