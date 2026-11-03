package tema3.practica09;

import java.util.Arrays;

/** Práctica 09.1: copia invertida sin modificar el original. */
public class InvertirCopia {

    static int[] invertida(int[] v) {
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            r[i] = v[v.length - 1 - i];
        }
        return r;
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5};
        int[] inv = invertida(v);
        System.out.println(Arrays.toString(v));     // [1, 2, 3, 4, 5]  (sin cambios)
        System.out.println(Arrays.toString(inv));   // [5, 4, 3, 2, 1]
    }
}
