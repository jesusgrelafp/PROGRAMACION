package tema3;

import java.util.Scanner;

public class ComprobarBinario {

    public static void main(String[] args) {
        long n = pedirNumero();
        System.out.println("El número " + n + (comprobarBinario(n) ? " es un numero binario" : " NO es un numero binario"));
    }

    // Comprueba si n esta formado unicamente por ceros y unos
    static boolean comprobarBinario(long n) {
        if (n == 0)
            return true;                             // caso base: no quedan digitos por comprobar
        else if (n % 10 > 1)
            return false;                            // el ultimo digito no es 0 ni 1
        else
            return comprobarBinario(n / 10);      // caso general: comprobamos el resto
    }

    // Solicita el numero por teclado
    static long pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        long n = sc.nextLong();
        sc.close();
        return n;
    }
}