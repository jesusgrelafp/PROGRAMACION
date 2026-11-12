package tema3.practica10;

import java.util.Arrays;

/** Práctica 10.1: notas ordenadas, mínima, máxima y mediana sin modificar el original. */
public class Notas {

    static void resumen(double[] notas) {
        if (notas.length == 0) {
            System.out.println("No hay notas");
            return;
        }
        double[] ordenadas = Arrays.copyOf(notas, notas.length); // copia: el original no cambia
        Arrays.sort(ordenadas);

        int n = ordenadas.length;
        double mediana;
        if (n % 2 == 1) {
            mediana = ordenadas[n / 2];                                  // impar: el central
        } else {
            mediana = (ordenadas[n / 2 - 1] + ordenadas[n / 2]) / 2;     // par: media de los dos centrales
        }
        System.out.println("Ordenadas: " + Arrays.toString(ordenadas));
        System.out.println("Mínima: " + ordenadas[0] + "  Máxima: " + ordenadas[n - 1] + "  Mediana: " + mediana);
    }

    public static void main(String[] args) {
        double[] impar = {7.5, 3, 9, 5, 6};
        double[] par = {4, 8.5, 2, 10, 6, 7};
        resumen(impar);
        System.out.println("Original sin cambios: " + Arrays.toString(impar));
        resumen(par);
    }
}
