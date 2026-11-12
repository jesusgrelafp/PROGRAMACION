package tema3.practica10;

import java.util.Arrays;

/** Práctica 10.2: ordenar nombres sin distinguir mayúsculas y mostrar los 3 primeros y los 3 últimos. */
public class Ranking {

    static void ranking(String[] nombres) {
        String[] ordenados = Arrays.copyOf(nombres, nombres.length);
        Arrays.sort(ordenados, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Ordenados: " + Arrays.toString(ordenados));

        int cuantos = Math.min(3, ordenados.length); // por si hay menos de 3 nombres
        System.out.println("Primeros: " + Arrays.toString(Arrays.copyOfRange(ordenados, 0, cuantos)));
        System.out.println("Últimos: " + Arrays.toString(
                Arrays.copyOfRange(ordenados, ordenados.length - cuantos, ordenados.length)));
    }

    public static void main(String[] args) {
        String[] nombres = {"luis", "Ana", "zoe", "Carlos", "beatriz", "Marta", "pedro"};
        ranking(nombres);
        System.out.println("Con Arrays.sort sin más: ");
        String[] copia = nombres.clone();
        Arrays.sort(copia);
        System.out.println(Arrays.toString(copia)); // las mayúsculas van primero
    }
}
