package tema4.practica13;

import java.util.Scanner;

/** Práctica 13: dos cuentas y una referencia cuentaActiva. */
public class AppCuentaCorriente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCorriente cuenta1 = new CuentaCorriente("ES010001", 1.5f);
        CuentaCorriente cuenta2 = new CuentaCorriente("ES020002", 0.5f);
        CuentaCorriente cuentaActiva = cuenta1;    // sin new: solo apunta a cuenta1

        int opcion;
        do {
            System.out.println("\nCuenta activa: " + cuentaActiva.iban);
            System.out.println("1. Ingresar  2. Retirar  3. Consultar saldo  4. Cambiar cuenta activa  0. Salir");
            opcion = Integer.parseInt(sc.nextLine().trim());
            switch (opcion) {
                case 1 -> {
                    System.out.print("Importe: ");
                    cuentaActiva.ingresar(Float.parseFloat(sc.nextLine()));
                }
                case 2 -> {
                    System.out.print("Importe: ");
                    boolean ok = cuentaActiva.retirar(Float.parseFloat(sc.nextLine()));
                    System.out.println(ok ? "Retirada hecha (comisión " + cuentaActiva.getPorcentajeComision() + " %)"
                                          : "Saldo insuficiente");
                }
                case 3 -> System.out.printf("Saldo: %.2f €%n", cuentaActiva.getSaldo());
                case 4 -> cuentaActiva = (cuentaActiva == cuenta1) ? cuenta2 : cuenta1;
                case 0 -> System.out.println("Adiós");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }
}
