package tema3;

import java.util.Scanner;

public class ConversorBinario {

    public static void main(String[] args) {
        int n = pedirNumero();
        System.out.println(n + " en binario es " + aBinario(n));
    }

    // Devuelve la representación binaria de n (n >= 0)
    static String aBinario(int n) {
        if (n < 2)
            return String.valueOf(n);                // caso base: 0 o 1
        else {
            return aBinario(n / 2) + (n % 2);     // caso general: cociente + resto
        }
    }

    // Solicita el número por teclado
    static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }
}
