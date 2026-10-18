import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Altura: ");
            int altura = sc.nextInt();
            sc.close();
            dibujarRelleno(altura);
            System.out.println();
            dibujarHueco(altura);
    }

    // Triángulo rectángulo relleno
    public static void dibujarRelleno(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Triángulo rectángulo sin relleno: primer asterisco, último y la base
    public static void dibujarHueco(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
