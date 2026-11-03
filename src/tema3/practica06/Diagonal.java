package tema3.practica06;

/** Práctica 06.1: matriz n x n con X en la diagonal principal. */
public class Diagonal {

    static char[][] crearMatriz(int n) {
        char[][] m = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i == j) ? 'X' : '-';
            }
        }
        return m;
    }

    static void imprimirMatriz(char[][] m) {
        for (char[] fila : m) {
            for (char c : fila) System.out.print(c + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        imprimirMatriz(crearMatriz(4));
    }
}
