package tema3;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base (mayor que 0): ");
        int base = sc.nextInt();
        System.out.print("Introduce el exponente (mayor que 0): ");
        int exponente = sc.nextInt();
        sc.close();

        System.out.println(base + " elevado a " + exponente + " es " + potencia(base, exponente));
    }

    // Devuelve base elevado a exponente (ambos positivos)
    static long potencia(int base, int exponente) {
        if (exponente == 1)
            return base;                                            // caso base: base elevado a 1
        else
            return base * potencia(base, exponente - 1);  // caso general: base * base^(exponente-1)
    }

}