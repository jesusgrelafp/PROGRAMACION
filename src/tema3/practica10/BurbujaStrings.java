package tema3.practica10;

import java.util.Arrays;

/** Práctica 10.2: burbuja alfabética sin distinguir mayúsculas. */
public class BurbujaStrings {

    static void ordenar(String[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j].compareToIgnoreCase(v[j + 1]) > 0) {
                    String aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] nombres = {"pedro", "Ana", "luis", "Beatriz", "carlos"};
        ordenar(nombres);
        System.out.println(Arrays.toString(nombres));   // [Ana, Beatriz, carlos, luis, pedro]
    }
}
