package tema3.practica11;

import java.util.Arrays;

/** Práctica 11.4: matriz transpuesta. */
public class Transpuesta {

    static int[][] transpuesta(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                t[c][f] = m[f][c];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {6, 7, 8}};
        System.out.println(Arrays.deepToString(transpuesta(a)));   // [[1, 6], [2, 7], [3, 8]]
    }
}
