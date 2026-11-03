package tema3.practica09;

import java.util.Arrays;

/** Práctica 09.3: eliminar un elemento creando un Array nuevo. */
public class EliminarElemento {

    static int[] eliminar(int[] v, int pos) {
        if (pos < 0 || pos >= v.length) {
            System.out.println("Posición no válida: " + pos);
            return v;
        }
        int[] r = new int[v.length - 1];
        System.arraycopy(v, 0, r, 0, pos);
        System.arraycopy(v, pos + 1, r, pos, v.length - pos - 1);
        return r;
    }

    public static void main(String[] args) {
        int[] v = {10, 20, 30, 40};
        System.out.println(Arrays.toString(eliminar(v, 1)));   // [10, 30, 40]
        System.out.println(Arrays.toString(eliminar(v, 3)));   // [10, 20, 30]
    }
}
