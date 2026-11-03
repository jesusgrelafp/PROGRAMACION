package tema3.practica05;

import java.util.Random;

/** Práctica 05: temperaturas medias de los 12 meses en un Array global. */
public class TemperaturasMeses {

    static int[] temperaturaMeses = new int[12];      // Array global
    static Random random = new Random();

    static void llenar() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = random.nextInt(41);          // 0..40
        }
    }

    /** Versión 2: sin temperaturas repetidas. */
    static void llenarSinRepetidos() {
        int i = 0;
        while (i < temperaturaMeses.length) {
            int t = random.nextInt(41);
            if (!estaEnLosPrimeros(t, i)) {
                temperaturaMeses[i++] = t;
            }
        }
    }

    private static boolean estaEnLosPrimeros(int valor, int n) {
        for (int i = 0; i < n; i++) {
            if (temperaturaMeses[i] == valor) return true;
        }
        return false;
    }

    static void mostrar() {
        for (int t : temperaturaMeses) System.out.print(t + " ");
        System.out.println();
    }

    static void mostrarInverso() {
        for (int i = temperaturaMeses.length - 1; i >= 0; i--) System.out.print(temperaturaMeses[i] + " ");
        System.out.println();
    }

    static double media() {
        int suma = 0;
        for (int t : temperaturaMeses) suma += t;
        return (double) suma / temperaturaMeses.length;
    }

    static void mesesCalurosos() {
        System.out.print("Meses con más de 30 grados:");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > 30) System.out.print(" " + (i + 1));
        }
        System.out.println();
    }

    /** Con return: deja de recorrer en cuanto encuentra uno. */
    static boolean hayMesCaluroso() {
        for (int t : temperaturaMeses) {
            if (t > 30) return true;
        }
        return false;
    }

    /** Sin break ni return dentro del bucle: while con dos condiciones. */
    static boolean hayMesCalurosoSinBreak() {
        int i = 0;
        boolean encontrado = false;
        while (i < temperaturaMeses.length && !encontrado) {
            encontrado = temperaturaMeses[i] > 30;
            i++;
        }
        return encontrado;
    }

    static boolean hayRepetidas() {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            for (int j = i + 1; j < temperaturaMeses.length; j++) {
                if (temperaturaMeses[i] == temperaturaMeses[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        llenar();
        mostrar();
        mostrarInverso();
        System.out.printf("Media anual: %.2f%n", media());
        mesesCalurosos();
        System.out.println("¿Algún mes > 30? " + hayMesCaluroso() + " / " + hayMesCalurosoSinBreak());
        System.out.println("¿Temperaturas repetidas? " + hayRepetidas());

        llenarSinRepetidos();
        mostrar();
        System.out.println("¿Temperaturas repetidas? " + hayRepetidas());   // false
    }
}
