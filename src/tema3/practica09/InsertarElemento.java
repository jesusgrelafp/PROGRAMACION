package tema3.practica09;

import java.util.Arrays;

/** Práctica 09.2: insertar un elemento creando un Array nuevo con System.arraycopy. */
public class InsertarElemento {

    static int[] insertar(int[] v, int pos, int valor) {
        if (pos < 0 || pos > v.length) {
            System.out.println("Posición no válida: " + pos);
            return v;
        }
        int[] r = new int[v.length + 1];
        System.arraycopy(v, 0, r, 0, pos);                     // los de antes
        r[pos] = valor;                                         // el nuevo
        System.arraycopy(v, pos, r, pos + 1, v.length - pos);  // los de después, desplazados
        return r;
    }

    public static void main(String[] args) {
        int[] v = {10, 20, 30, 40};
        System.out.println(Arrays.toString(insertar(v, 2, 25)));   // [10, 20, 25, 30, 40]
        System.out.println(Arrays.toString(insertar(v, 0, 5)));    // [5, 10, 20, 30, 40]
        System.out.println(Arrays.toString(insertar(v, 4, 50)));   // [10, 20, 30, 40, 50]
    }
}
