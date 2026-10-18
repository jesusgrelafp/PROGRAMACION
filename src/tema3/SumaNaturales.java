package tema3;

import java.util.Scanner;

public class SumaNaturales {

    public static void main(String[] args) {
        int n = pedirNumero();
        int resultado = suma(n);
        System.out.println(" = " + resultado);
    }

    // Suma los naturales de 1 a n (n > 0) e imprime la cadena 1+2+...+n
    static int suma(int n) {
        if (n == 1) {
            System.out.print("1");              // caso base: empezamos la cadena en 1
            return 1;
        } else {
            int anterior = suma(n - 1);      // caso general: primero 1+2+...+(n-1)
            System.out.print("+" + n);          // despues anadimos +n
            return anterior + n;
        }
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