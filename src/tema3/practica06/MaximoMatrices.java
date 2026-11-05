package tema3.practica06;

import java.util.Arrays;

/** Práctica 06.3: máximo posición a posición de dos matrices de las mismas dimensiones. */
public class MaximoMatrices {

    public static void main(String[] args) {

        int[][] a = {{1,2,1},{4,5,6},{7,8}};
        int[][] b = {{5,6,3},{7,5,2},{1,8}};

        mostrarMatrizMaxima(a, b);
    }

    static void mostrarMatrizMaxima(int[][] a, int[][] b) {

        int[][] c = matrizMaxima(a, b);
        if(c != null) {

            for (int[] fila : c) {
                System.out.println(Arrays.toString(fila));
            }
        }
        else System.out.println("ERROR: las matrices no son iguales");
    }

    static int[][] matrizMaxima(int[][] a, int[][] b) {

        if (mismasDimensiones(a, b)) {

            // Creamos una matriz "c" de las mismas dimensiones
            int[][] c = new int[a.length][];
            for (int i = 0; i < a.length; i++) {
                c[i] = new int[a[i].length];
            }

            // Recorremos los elementos comparando valor a valor
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {

                    if(a[i][j] > b[i][j])
                        c[i][j] = a[i][j];
                    else
                        c[i][j] = b[i][j];

                    // También se podría hacer:     c[i][j] = Math.max(a[i][j], b[i][j]);
                }
            }
            return c;
        }
        return null;
    }

    static boolean mismasDimensiones(int[][] a, int[][] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i].length != b[i].length)
                    return false;
            }
            return true;
        }
        return false;
    }

}
