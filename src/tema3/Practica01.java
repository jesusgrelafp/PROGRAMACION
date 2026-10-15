package tema3;

public class Practica01 {

    // 1. Muestra un saludo (no devuelve ningún valor)
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // 2. Devuelve el cubo de un número entero
    public static int cubo(int n) {
        return n * n * n;
    }

    // 3. Devuelve el producto de dos números enteros
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // 4. Muestra la tabla de multiplicar del 1 al 10 (usa multiplicar)
    public static void tablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + multiplicar(n, i));
        }
    }

    // 5. Devuelve true si el número es par y false en caso contrario
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // 6. Muestra un menú numerado del 1 al N; la opción N es "Salir"
    public static void mostrarMenu(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(i + " - Opción " + i);
        }
        System.out.println(n + " - Salir");
    }

    public static void main(String[] args) {
        // 1
        saludar("Ana");

        // 2
        int numero = 3;
        System.out.println("El cubo de " + numero + " es " + cubo(numero));

        // 3
        System.out.println("4 * 5 = " + multiplicar(4, 5));

        // 4
        tablaMultiplicar(7);

        // 5
        System.out.println("¿8 es par? " + esPar(8));
        System.out.println("¿7 es par? " + esPar(7));

        // 6
        mostrarMenu(4);
    }
}