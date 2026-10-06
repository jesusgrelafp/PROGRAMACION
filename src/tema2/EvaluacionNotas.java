package tema2;

import java.util.Scanner;

/**
 * Escribe un programa en Java que solicite al alumno/a el valor de sus notas en la UD1 y UD2 (float).
 * A continuación, muestra un mensaje indicando “aprobado” o “suspenso” a partir de lo siguiente:
 *     - Si la UD1 o la UD2 tienen una menor de 4, mostrará “suspenso”
 *     - Si ambas superan el 4, entonces si la media de ambas notas supera el 5 mostrará “aprobado”, en caso contrario mostrará “suspenso”.
 *
 * Utiliza el operador ternario para realizar el ejercicio.
 */
public class EvaluacionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar notas al usuario (tipo float)
        System.out.print("Introduce la nota de la UD1: ");
        float ud1 = scanner.nextFloat();

        System.out.print("Introduce la nota de la UD2: ");
        float ud2 = scanner.nextFloat();

        // Aplicación de la lógica mediante operadores ternarios anidados
        // 1. Si UD1 < 4 o UD2 < 4, entonces "suspenso".
        // 2. Si no, calculamos la media y si es >= 5 es "aprobado", en caso contrario "suspenso".
        String resultado = (ud1 < 4.0f || ud2 < 4.0f)
                ? "suspenso"
                : (((ud1 + ud2) / 2.0f >= 5.0f) ? "aprobado" : "suspenso");

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
