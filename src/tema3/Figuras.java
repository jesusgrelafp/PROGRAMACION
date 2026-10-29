import java.util.Scanner;

public class Figuras {

    static void mostrarMenu() {
        System.out.println("\n---- MENÚ ----");
        System.out.println("1 - Cuadrado relleno");
        System.out.println("2 - Cuadrado sin relleno");
        System.out.println("3 - Triángulo relleno");
        System.out.println("4 - Triángulo sin relleno");
        System.out.println("5 - Salir");
        System.out.print("Elige una opción: ");
    }

    static int pedirNumero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    dibujarCuadradoRelleno(pedirNumero(sc, "Lado: "));
                    break;
                case 2:
                    dibujarCuadradoHueco(pedirNumero(sc, "Lado: "));
                    break;
                case 3:
                    dibujarTrianguloRelleno(pedirNumero(sc, "Altura: "));
                    break;
                case 4:
                    dibujarTrianguloHueco(pedirNumero(sc, "Altura: "));
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        sc.close();
    }

    // Cuadrado relleno
    public static void dibujarCuadradoRelleno(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Cuadrado sin relleno (solo el borde)
    public static void dibujarCuadradoHueco(int lado) {
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

    // Triángulo rectángulo relleno
    public static void dibujarTrianguloRelleno(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Triángulo rectángulo sin relleno: primer asterisco, último y la base
    public static void dibujarTrianguloHueco(int altura) {
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
