package tema3.practica04;

/** Práctica 04.1: cuántas veces aparece un valor en un Array. */
public class ContarApariciones {

    static int contar(int[] v, int valor) {
        int veces = 0;
        for (int n : v) {
            if (n == valor) {
                veces++;
            }
        }
        return veces;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 7, 3, 1, 9, 3, 7};
        System.out.println("El 3 aparece " + contar(numeros, 3) + " veces");   // 3
        System.out.println("El 5 aparece " + contar(numeros, 5) + " veces");   // 0
    }
}
