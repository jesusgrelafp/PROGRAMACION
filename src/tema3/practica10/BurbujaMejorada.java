package tema3.practica10;

import java.util.Arrays;

/** Práctica 10.1: burbuja de mayor a menor que para si no hay intercambios. */
public class BurbujaMejorada {

    /** Ordena v de mayor a menor y devuelve el número de pasadas. */
    static int burbujaDescendente(int[] v) {
        int pasadas = 0;
        boolean hayCambios = true;
        for (int i = 0; i < v.length - 1 && hayCambios; i++) {
            hayCambios = false;
            pasadas++;
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] < v[j + 1]) {            // < para orden descendente
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    hayCambios = true;
                }
            }
        }
        return pasadas;
    }

    public static void main(String[] args) {
        int[] v = {3, 6, 9, 0, 1, 2, 3};
        int p = burbujaDescendente(v);
        System.out.println(Arrays.toString(v) + " en " + p + " pasadas");
        int[] yaOrdenado = {9, 7, 5, 3};
        System.out.println("Ya ordenado: " + burbujaDescendente(yaOrdenado) + " pasada");   // 1
    }
}
