package tema4.practica15;

import java.util.Scanner;

/** Práctica 15: menú para usar el Parking (aquí sí se escribe en consola). */
public class AppParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parking parking = new Parking();
        int opcion;
        do {
            System.out.println("\n1. Aparcar  2. Desaparcar  3. Estado  4. Plazas libres  5. Recaudado  0. Salir");
            opcion = Integer.parseInt(sc.nextLine().trim());
            switch (opcion) {
                case 1 -> {
                    System.out.print("Matrícula: ");
                    int plaza = parking.aparcar(sc.nextLine().trim());
                    System.out.println(plaza == 0 ? "Parking lleno" : "Aparcado en la plaza " + plaza);
                }
                case 2 -> {
                    String m = parking.desaparcar();
                    System.out.println(m.isEmpty() ? "El parking está vacío"
                            : "Sale " + m + ". Importe: " + String.format("%.2f €", parking.getUltimoImporte()));
                }
                case 3 -> System.out.print(parking.estado() + "\n");
                case 4 -> System.out.println("Plazas libres: " + parking.plazasLibres());
                case 5 -> System.out.printf("Recaudado: %.2f €%n", parking.getRecaudado());
                case 0 -> System.out.println("Adiós");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
