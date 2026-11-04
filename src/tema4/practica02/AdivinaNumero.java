package tema4.practica02;

import java.util.Random;
import java.util.Scanner;

/** Práctica 02.1: juego de adivinar un número del 1 al 100 en 7 intentos. */
public class AdivinaNumero {

    public static void main(String[] args) {
        final int MAX_INTENTOS = 7;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int secreto = r.nextInt(100) + 1;

        System.out.println("He pensado un número del 1 al 100. Tienes " + MAX_INTENTOS + " intentos.");
        boolean acertado = false;
        int intentos = 0;

        while (!acertado && intentos < MAX_INTENTOS) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int numero = sc.nextInt();
            intentos++;
            if (numero == secreto) {
                acertado = true;
            } else if (numero < secreto) {
                System.out.println("El número es MAYOR");
            } else {
                System.out.println("El número es MENOR");
            }
        }

        if (acertado) {
            System.out.println("¡Has ganado en " + intentos + " intentos!");
        } else {
            System.out.println("Has perdido. El número era " + secreto);
        }
        sc.close();
    }
}
