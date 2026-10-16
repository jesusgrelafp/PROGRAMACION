package tema2;

import java.util.Scanner;

public class CadenasCaracteres {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = entrada.nextInt();
        int cifras = 0;

        if (num < 0) {
            System.out.println("No se pueden introducir números negativos");
        } else {
            while (num > 0) {
                num /= 10;
                cifras++;
            }
            System.out.println("El número introducido tiene " + cifras + " " + (cifras == 1 ? "cifra" : "cifras"));
        }
        entrada.close();
    }
}