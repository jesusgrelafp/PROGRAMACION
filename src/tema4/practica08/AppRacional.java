package tema4.practica11;

import java.util.Scanner;

/** Práctica 11: menú de operaciones con racionales. */
public class AppRacional {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Racional a = new Racional(0, 1);
        Racional b = new Racional(0, 1);
        int opcion;

        do {
            System.out.println("\nA = " + a + "    B = " + b);
            System.out.println("1. Introduce número A");
            System.out.println("2. Introduce número B");
            System.out.println("3. Suma de A y B");
            System.out.println("4. Resta de A y B");
            System.out.println("5. Multiplicación de A y B");
            System.out.println("6. División de A y B");
            System.out.println("7. Son iguales A y B");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> a = leerRacional();
                case 2 -> b = leerRacional();
                case 3 -> System.out.println(a + " + " + b + " = " + a.sumar(b));
                case 4 -> System.out.println(a + " - " + b + " = " + a.restar(b));
                case 5 -> System.out.println(a + " * " + b + " = " + a.multiplicar(b));
                case 6 -> {
                    Racional r = a.dividir(b);
                    if (r != null) {
                        System.out.println(a + " / " + b + " = " + r);
                    }
                }
                case 7 -> System.out.println(a.esIgual(b) ? "Son iguales" : "No son iguales");
                case 8 -> System.out.println("Racionales creados: " + Racional.getCantidadRacionales());
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 8);
    }

    private static Racional leerRacional() {
        System.out.print("Numerador: ");
        int n = sc.nextInt();
        int d;
        do {
            System.out.print("Denominador (distinto de 0): ");
            d = sc.nextInt();
        } while (d == 0);
        return new Racional(n, d);
    }
}
