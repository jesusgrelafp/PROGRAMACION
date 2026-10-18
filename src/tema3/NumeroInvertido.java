package tema3;

import java.util.Scanner;

public class NumeroInvertido {

    public static void main(String[] args) {
        int n = pedirNumero();
        System.out.print(n + " invertido es ");
        imprimirInvertido(n);
        System.out.println();
    }

    // Imprime los digitos de n (positivo) en orden inverso
    static void imprimirInvertido(int n) {
        if (n < 10)
            System.out.print(n);              // caso base: un solo digito
        else {
            System.out.print(n % 10);         // caso general: imprimimos el ultimo digito
            imprimirInvertido(n / 10);     // y seguimos con el resto
        }
    }

    // Solicita el numero por teclado
    static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero positivo: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

}
