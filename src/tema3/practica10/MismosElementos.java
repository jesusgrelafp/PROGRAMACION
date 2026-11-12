package tema3.practica10;

import java.util.Arrays;

/** Práctica 10.4: ¿tienen dos Arrays los mismos elementos aunque estén en distinto orden? */
public class MismosElementos {

    static boolean mismosElementos(int[] a, int[] b) {
        if (a.length != b.length) return false;
        int[] copiaA = Arrays.copyOf(a, a.length); // no modificamos los originales
        int[] copiaB = Arrays.copyOf(b, b.length);
        Arrays.sort(copiaA);
        Arrays.sort(copiaB);
        return Arrays.equals(copiaA, copiaB);
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        int[] b = {2, 3, 1};
        int[] c = {3, 1, 1};
        System.out.println(Arrays.toString(a) + " y " + Arrays.toString(b) + " → " + mismosElementos(a, b));
        System.out.println(Arrays.toString(a) + " y " + Arrays.toString(c) + " → " + mismosElementos(a, c));
        System.out.println("a sigue igual: " + Arrays.toString(a));
        System.out.println("a == b: " + (a == b) + " (compara referencias)");
    }
}
