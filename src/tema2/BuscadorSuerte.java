package tema2;

public class BuscadorSuerte {
    public static void main(String[] args) {
        System.out.println("Buscando el primer número divisible por 7 y por 13 entre 1 y 100...");

        for (int i = 1; i <= 100; i++) {
            // Comprobamos si es divisible por 7 y por 13 a la vez
            if (i % 7 == 0 && i % 13 == 0) {
                System.out.println("¡Encontrado! El número es: " + i);
                break; // Rompe el bucle inmediatamente al encontrarlo
            }
            System.out.println("Revisando número: " + i);
        }

        System.out.println("Fin del programa.");
    }
}