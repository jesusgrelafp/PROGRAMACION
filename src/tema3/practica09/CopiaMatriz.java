package tema3.practica09;

import java.util.Arrays;

/** Práctica 09.4: clone() en matrices es una copia superficial. */
public class CopiaMatriz {

    static int[][] copiaProfunda(int[][] m) {
        int[][] copia = new int[m.length][];
        for (int i = 0; i < m.length; i++) {
            copia[i] = m[i].clone();          // cada fila es un Array nuevo
        }
        return copia;
    }

    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3, 4}};

        int[][] superficial = original.clone();
        superficial[0][0] = 99;
        // clone() solo copia el Array de filas: las filas son las mismas, así que el original también cambia
        System.out.println("Original:    " + Arrays.deepToString(original));      // [[99, 2], [3, 4]]
        System.out.println("Superficial: " + Arrays.deepToString(superficial));   // [[99, 2], [3, 4]]

        int[][] profunda = copiaProfunda(original);
        profunda[1][1] = 0;
        System.out.println("Original:    " + Arrays.deepToString(original));      // [[99, 2], [3, 4]]
        System.out.println("Profunda:    " + Arrays.deepToString(profunda));      // [[99, 2], [3, 0]]
    }
}
