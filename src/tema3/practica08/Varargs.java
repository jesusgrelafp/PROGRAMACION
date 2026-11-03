package tema3.practica08;

/** Práctica 08.3: métodos con número variable de parámetros. */
public class Varargs {

    static int maximo(int... nums) {
        if (nums.length == 0) {
            System.out.println("maximo(): no se ha pasado ningún número");
            return Integer.MIN_VALUE;
        }
        int max = nums[0];
        for (int n : nums) max = Math.max(max, n);
        return max;
    }

    static double media(double... notas) {
        if (notas.length == 0) {
            System.out.println("media(): no se ha pasado ninguna nota");
            return 0;
        }
        double suma = 0;
        for (double n : notas) suma += n;
        return suma / notas.length;
    }

    public static void main(String[] args) {
        System.out.println(maximo(3, 9, 2, 7));       // 9
        System.out.println(media(5, 6.5, 8, 9.5));    // 7.25
        maximo();
        media();
    }
}
