package tema3;

import java.util.Scanner;

public class CantidadDigitos {

    public static void main(String[] args) {
        int n = pedirNumero();
        System.out.println(n + " tiene " + contarDigitos(n) + " digitos");
    }

    // Devuelve la cantidad de digitos de n (n > 0)
    static int contarDigitos(int n) {
        if (n < 10)
            return 1;                             // caso base: un solo digito
        else
            return 1 + contarDigitos(n / 10);  // caso general: contamos el ultimo y seguimos con el resto
    }

    // Solicita el numero por teclado
    static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero mayor que 0: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }
}