package tema3.practica07;

import java.util.Arrays;
import java.util.Random;

/** Práctica 07: temperaturas de 12 meses x 30 días en una matriz. */
public class TemperaturasDias {

    static int[][] temperaturaDia = new int[12][30];
    static Random random = new Random();

    static int azar(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    static void llenar() {
        for (int mes = 0; mes < 12; mes++) {
            boolean frio = mes <= 2 || mes >= 10;    // ene, feb, mar, nov, dic
            for (int dia = 0; dia < 30; dia++) {
                temperaturaDia[mes][dia] = frio ? azar(-10, 20) : azar(10, 35);
            }
        }
    }

    static void mostrarTabla() {
        for (int mes = 0; mes < 12; mes++) {
            System.out.printf("Mes %2d:", mes + 1);
            for (int t : temperaturaDia[mes]) {
                System.out.printf(" %+3d", t);
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
            for (int t : temperaturaDia[mes]) suma += t;
            medias[mes] = (double) suma / temperaturaDia[mes].length;
        }
        return medias;
    }

    static int[] minimaPorMes() {
        int[] minimas = new int[12];
        for (int mes = 0; mes < 12; mes++) {
            int min = temperaturaDia[mes][0];
            for (int t : temperaturaDia[mes]) min = Math.min(min, t);
            minimas[mes] = min;
        }
        return minimas;
    }

    public static void main(String[] args) {
        llenar();
        mostrarTabla();
        System.out.printf("Media anual: %.2f%n", mediaAnual());
        System.out.println("Media de cada mes: " + Arrays.toString(mediaPorMes()));
        System.out.println("Mínima de cada mes: " + Arrays.toString(minimaPorMes()));
    }
}
