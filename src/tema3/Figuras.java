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
                    Cuadrado.dibujarRelleno(pedirNumero(sc, "Lado: "));
                    break;
                case 2:
                    Cuadrado.dibujarHueco(pedirNumero(sc, "Lado: "));
                    break;
                case 3:
                    Triangulo.dibujarRelleno(pedirNumero(sc, "Altura: "));
                    break;
                case 4:
                    Triangulo.dibujarHueco(pedirNumero(sc, "Altura: "));
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
}
