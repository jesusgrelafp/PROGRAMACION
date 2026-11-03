package tema3.practica06;

import java.util.Arrays;

/** Práctica 06.3: máximo posición a posición de dos matrices de las mismas dimensiones. */
public class MaximoMatrices {

    static boolean mismasDimensiones(int[][] a, int[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
        }
        return true;
    }

    static int[][] maximo(int[][] a, int[][] b) {
        int[][] m = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            m[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                m[i][j] = Math.max(a[i][j], b[i][j]);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {6, 7, 8}, {10, 8, 15}};
        int[][] b = {{5, 1, 4}, {7, 3, 11}, {11, 12, 13}};
        if (mismasDimensiones(a, b)) {
            System.out.println(Arrays.deepToString(maximo(a, b)));   // [[5, 2, 4], [7, 7, 11], [11, 12, 15]]
        } else {
            System.out.println("Las matrices no se pueden comparar");
        }
        int[][] c = {{1, 2}, {3}};
        System.out.println(mismasDimensiones(a, c) ? "Comparables" : "Las matrices no se pueden comparar");
    }
}
