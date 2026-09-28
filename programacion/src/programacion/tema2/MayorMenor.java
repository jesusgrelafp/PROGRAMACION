package programacion.tema2;



import java.util.Scanner;

/**
 * Iniciación a JAVA
 *
 * Leer una cantidad 'N' y luego introducir 'N' números enteros.
 * Se pide imprimir el mayor y el menor y las veces que aparece cada uno.
 *
 * Ejemplo para entrada: [ N = 6 ] [ 4 9 2 9 2 7 ]
 * Salida:               [ Mayor: 9 (aparece 2 veces) ]
 *                       [ Menor: 2 (aparece 2 veces) ]
 *
 */
public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad N de números: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: N debe ser mayor que 0.");
            sc.close();
            return;
        }

        int mayor = 0;
        int menor = 0;
        int vecesMayor = 0;
        int vecesMenor = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = sc.nextInt();

            if (i == 1) {
                // El primer número es, de momento, el mayor y el menor
                mayor = numero;
                menor = numero;
                vecesMayor = 1;
                vecesMenor = 1;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                    vecesMayor = 1;
                } else if (numero == mayor) {
                    vecesMayor++;
                }

                if (numero < menor) {
                    menor = numero;
                    vecesMenor = 1;
                } else if (numero == menor) {
                    vecesMenor++;
                }
            }
        }
        sc.close();

        System.out.println("Mayor: " + mayor + " (aparece " + vecesMayor + " veces)");
        System.out.println("Menor: " + menor + " (aparece " + vecesMenor + " veces)");
    }
}