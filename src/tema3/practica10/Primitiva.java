package tema3.practica10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/** Práctica 10.4: sorteo de la Primitiva con Arrays.sort y Arrays.binarySearch. */
public class Primitiva {

    static int[] sorteo() {
        Random r = new Random();
        int[] numeros = new int[6];
        int i = 0;
        while (i < numeros.length) {
            int n = r.nextInt(49) + 1;
            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (numeros[j] == n) repetido = true;
            }
            if (!repetido) numeros[i++] = n;
        }
        Arrays.sort(numeros);
        return numeros;
    }

    /** El sorteo debe estar ordenado para usar binarySearch. */
    static int aciertos(int[] sorteo, int[] boleto) {
        int aciertos = 0;
        for (int n : boleto) {
            if (Arrays.binarySearch(sorteo, n) >= 0) aciertos++;
        }
        return aciertos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] boleto = new int[6];
        System.out.println("Introduce los 6 números de tu boleto (1-49):");
        for (int i = 0; i < 6; i++) boleto[i] = sc.nextInt();

        int[] premiados = sorteo();
        System.out.println("Combinación ganadora: " + Arrays.toString(premiados));
        System.out.println("Has acertado " + aciertos(premiados, boleto) + " números");
        sc.close();
    }
}
