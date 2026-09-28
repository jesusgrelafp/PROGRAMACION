package programacion.tema2;

import java.util.Scanner;

public class CuadradoMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura N del cuadrado: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            StringBuilder linea = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                int valor = Math.max(i, j);
                linea.append(valor);
                if (j < n) {
                    linea.append(' ');
                }
            }
            System.out.println(linea);
        }
    }
}