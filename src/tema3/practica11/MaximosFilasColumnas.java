package tema3.practica11;

import java.util.Arrays;

/** Práctica 11.3: máximo de cada fila y de cada columna (también en matrices irregulares). */
public class MaximosFilasColumnas {

    static int[] maximoFilas(int[][] m) {
        int[] r = new int[m.length];
        for (int f = 0; f < m.length; f++) {
            int max = Integer.MIN_VALUE;
            for (int v : m[f]) max = Math.max(max, v);
            r[f] = max;
        }
        return r;
    }

    static int[] maximoColumnas(int[][] m) {
        int columnas = 0;                                    // la fila más larga
        for (int[] fila : m) columnas = Math.max(columnas, fila.length);
        int[] r = new int[columnas];
        Arrays.fill(r, Integer.MIN_VALUE);
        for (int[] fila : m) {
            for (int c = 0; c < fila.length; c++) {          // solo las columnas que tiene esta fila
                r[c] = Math.max(r[c], fila[c]);
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[][] m = {{1, 9, 3}, {7, 2}, {4, 5, 6, 8}};
        System.out.println("Máximo de cada fila:    " + Arrays.toString(maximoFilas(m)));     // [9, 7, 8]
        System.out.println("Máximo de cada columna: " + Arrays.toString(maximoColumnas(m)));  // [7, 9, 6, 8]
    }
}
