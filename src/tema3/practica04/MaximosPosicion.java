package tema3.practica04;

import java.util.Arrays;

/** Práctica 04.4: máximo de cada posición de dos Arrays (de tamaños posiblemente distintos). */
public class MaximosPosicion {

    static int[] maximos(int[] a, int[] b) {
        int[] largo = a.length >= b.length ? a : b;
        int[] corto = a.length >= b.length ? b : a;
        int[] resultado = new int[largo.length];
        for (int i = 0; i < largo.length; i++) {
            if (i < corto.length) {
                resultado[i] = Math.max(largo[i], corto[i]);
            } else {
                resultado[i] = largo[i];        // solo existe en el más largo
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maximos(new int[]{4, 8, 15, 1}, new int[]{7, 2, 11, 18})));   // [7, 8, 15, 18]
        System.out.println(Arrays.toString(maximos(new int[]{4, 8}, new int[]{7, 2, 11, 18})));          // [7, 8, 11, 18]
    }
}
