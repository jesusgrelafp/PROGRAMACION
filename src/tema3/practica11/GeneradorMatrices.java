package tema3.practica11;

import java.util.Arrays;
import java.util.Random;

/** Práctica 11.1-11.2: matrices aleatorias cuadradas e irregulares. */
public class GeneradorMatrices {

    static Random random = new Random();

    static int azar(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /** Matriz tamaño x tamaño con valores entre 0 y maximo. */
    static int[][] cuadrada(int tamanyo, int maximo) {
        int[][] m = new int[tamanyo][tamanyo];
        for (int i = 0; i < tamanyo; i++) {
            for (int j = 0; j < tamanyo; j++) {
                m[i][j] = azar(0, maximo);
            }
        }
        return m;
    }

    /** Matriz irregular: número de filas y de columnas de cada fila al azar dentro de los límites. */
    static int[][] irregular(int maximo, int minFilas, int maxFilas, int minCols, int maxCols) {
        int[][] m = new int[azar(minFilas, maxFilas)][];
        for (int i = 0; i < m.length; i++) {
            m[i] = new int[azar(minCols, maxCols)];
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = azar(0, maximo);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(cuadrada(3, 9)));
        System.out.println(Arrays.deepToString(irregular(9, 2, 4, 1, 5)));
    }
}
