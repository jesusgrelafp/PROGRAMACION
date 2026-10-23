package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Pedimos el dividendo hasta que sea un número entero
        int dividendo = 0;
        boolean correcto = false;
        do {
            System.out.print("Introduce el dividendo: ");
            try {
                dividendo = entrada.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero.");
                entrada.nextLine(); // limpiamos el buffer para no entrar en un bucle infinito
            }
        } while (!correcto);

        // 2. Pedimos el divisor y dividimos hasta que todo sea correcto
        int divisor = 0, cociente = 0, resto = 0;
        correcto = false;
        do {
            System.out.print("Introduce el divisor: ");
            try {
                divisor = entrada.nextInt();
                cociente = dividendo / divisor; // si divisor es 0 se lanza ArithmeticException
                resto = dividendo % divisor;
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Eso no es un número entero.");
                entrada.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero.");
            }
        } while (!correcto);

        System.out.println(dividendo + " / " + divisor + " = " + cociente + " y el resto es " + resto);

        entrada.close();
    }
}
