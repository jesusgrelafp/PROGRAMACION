package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PosicionLetraSegura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = entrada.nextLine();

        // Pedimos la posición hasta que sea un entero válido dentro de la palabra
        boolean correcto = false;
        do {
            System.out.print("Introduce una posición: ");
            try {
                int posicion = entrada.nextInt();
                char letra = palabra.charAt(posicion); // puede lanzar StringIndexOutOfBoundsException
                System.out.println("En la posición " + posicion + " está la letra '" + letra + "'");
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero.");
                entrada.nextLine(); // limpiamos el buffer para no entrar en un bucle infinito
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("La posición no existe. Debe estar entre 0 y " + (palabra.length() - 1) + ".");
            }
        } while (!correcto);

        entrada.close();
    }
}
