
package tema3;
import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado: ");
        int lado = sc.nextInt();
        sc.close();
        dibujarRelleno(lado);
        System.out.println();
        dibujarHueco(lado);
    }

    // Cuadrado relleno
    public static void dibujarRelleno(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Cuadrado sin relleno (solo el borde)
    public static void dibujarHueco(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
