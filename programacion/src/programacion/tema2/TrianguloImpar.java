package programacion.tema2;
import java.util.Scanner;

public class TrianguloImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra de longitud impar: ");
        String palabra = sc.nextLine();
        sc.close();

        int longitud = palabra.length();

        if (longitud % 2 == 0) {
            System.out.println("Error: la longitud de la cadena debe ser impar.");
            return;
        }

        String palabraMayus = palabra.toUpperCase();
        int centro = longitud / 2;

        for (int nivel = 0; nivel <= centro; nivel++) {
            StringBuilder linea = new StringBuilder();

            int espacios = (centro - nivel) * 2;
            for (int e = 0; e < espacios; e++) {
                linea.append(' ');
            }

            for (int i = centro - nivel; i <= centro + nivel; i++) {
                linea.append(palabraMayus.charAt(i));
                if (i < centro + nivel) {
                    linea.append(' ');
                }
            }

            System.out.println(linea);
        }
    }
}
