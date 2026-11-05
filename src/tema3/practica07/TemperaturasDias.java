package tema3.practica07;

import java.util.Arrays;
import java.util.Random;

/** Práctica 07: temperaturas de 12 meses x 30 días en una matriz. */
public class TemperaturasDias {

    static int[][] temperaturaDia = new int[12][30];
    static Random random = new Random();

    static int azar(int min, int max) {
        return random.nextInt(min, max+1);
    }

    static void llenar() {
        for (int mes = 0; mes < 12; mes++) {
            boolean frio = mes <= 2 || mes >= 10;    // ene, feb, mar, nov, dic
            for (int dia = 0; dia < 30; dia++) {
                if ( frio )
                    temperaturaDia[mes][dia] = azar(-10, 20); // ene, feb, mar, nov, dic
                else
                    temperaturaDia[mes][dia] = azar(10, 35);  // abr, may, jun, jul, ago, sep, oct
            }
        }
    }

    static void mostrarTabla() {
        for (int mes = 0; mes < 12; mes++) {
            System.out.printf("Mes %2d:", mes + 1);  // Imprime el número de mes (1-12) alineado con un ancho de 2 caracteres
            for (int t : temperaturaDia[mes]) {
                System.out.printf(" %+3d", t);   // Formato: espacio para el signo y ancho fijo de 3 posiciones
            }
            System.out.println();
        }
    }

    static double mediaAnual() {
        int suma = 0;
        for (int[] mes : temperaturaDia) {
            for (int t : mes) suma += t;
        }
        return suma / 360.0;
    }

    static double[] mediaPorMes() {
        double[] medias = new double[12];
        for (int mes = 0; mes < 12; mes++) {
            int suma = 0;
            for (int t : temperaturaDia[mes])
                suma += t;
            medias[mes] = (double) suma / temperaturaDia[mes].length;
        }
        return medias;
    }

    static int[] minimaPorMes() {
        int[] minimas = new int[12];
        for (int mes = 0; mes < 12; mes++) {
            int min = temperaturaDia[mes][0];
            for (int t : temperaturaDia[mes])
                min = Math.min(min, t);
            minimas[mes] = min;
        }
        return minimas;
    }

    public static void main(String[] args) {
        llenar();
        mostrarTabla();
        System.out.printf("Media anual: %.2f%n", mediaAnual());   // Imprime la media con 2 decimales y salto de línea
        System.out.println("Media de cada mes: " + Arrays.toString(mediaPorMes()));
        System.out.println("Mínima de cada mes: " + Arrays.toString(minimaPorMes()));
    }
}
