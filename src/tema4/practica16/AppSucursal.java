package tema4.practica16;

import java.time.LocalDate;
import java.util.Scanner;

/** Práctica 16: menús de la aplicación de la sucursal. */
public class AppSucursal {

    private static Scanner sc = new Scanner(System.in);
    private static Sucursal sucursal = new Sucursal();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1.- Mantenimiento de Clientes");
            System.out.println("2.- Mantenimiento de Cuentas");
            System.out.println("0.- Salir");
            opcion = leerEntero("Opción: ");
            switch (opcion) {
                case 1 -> menuClientes();
                case 2 -> menuCuentas();
                case 0 -> System.out.println("Hasta pronto");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    // ---------------- clientes ----------------
    private static void menuClientes() {
        System.out.println("\nCLIENTES");
        System.out.println("1.- Altas\n2.- Bajas\n3.- Modificaciones\n4.- Listado");
        switch (leerEntero("Opción: ")) {
            case 1 -> {
                String nombre = leerTexto("Nombre: ");
                String apellidos = leerTexto("Apellidos: ");
                String direccion = leerTexto("Dirección: ");
                String localidad = leerTexto("Localidad: ");
                LocalDate fecha = LocalDate.parse(leerTexto("Fecha de nacimiento (aaaa-mm-dd): "));
                if (sucursal.altaCliente(new Cliente(nombre, apellidos, direccion, localidad, fecha))) {
                    System.out.println("Cliente dado de alta");
                }
            }
            case 2 -> {
                if (sucursal.bajaCliente(leerTexto("Nombre: "), leerTexto("Apellidos: "))) {
                    System.out.println("Cliente dado de baja");
                }
            }
            case 3 -> {
                Cliente c = sucursal.buscarCliente(leerTexto("Nombre: "), leerTexto("Apellidos: "));
                if (c == null) {
                    System.out.println("Cliente no encontrado");
                } else {
                    c.setDireccion(leerTexto("Nueva dirección: "));
                    c.setLocalidad(leerTexto("Nueva localidad: "));
                    System.out.println("Cliente modificado");
                }
            }
            case 4 -> sucursal.listarClientes();
            default -> System.out.println("Opción no válida");
        }
    }

    // ---------------- cuentas ----------------
    private static void menuCuentas() {
        Cliente c = sucursal.buscarCliente(leerTexto("Nombre: "), leerTexto("Apellidos: "));
        if (c == null) {
            System.out.println("Cliente no encontrado: primero hay que darlo de alta");
            return;
        }
        Cuenta activa = sucursal.buscarCuentaDe(c);
        if (activa == null) {
            String resp = leerTexto("El cliente no tiene cuenta. ¿Quieres crearla? (s/n): ");
            if (!resp.equalsIgnoreCase("s")) {
                return;
            }
            activa = sucursal.crearCuenta(c);
            if (activa == null) {
                return;
            }
        }
        submenuCuenta(activa);
    }

    private static void submenuCuenta(Cuenta activa) {
        int opcion;
        do {
            System.out.println("\nCUENTA ACTIVA nº " + activa.getNumero());
            System.out.println("1. Ingresar\n2. Hacer reintegro\n3. Ingresar interés mensual\n4. En rojos");
            System.out.println("5. Leer saldo\n6. Datos titular\n7. Listar movimientos\n0. Volver");
            opcion = leerEntero("Opción: ");
            switch (opcion) {
                case 1 -> activa.ingreso(leerCantidad());
                case 2 -> activa.reintegro(leerCantidad());
                case 3 -> activa.ingresoInteresesMes();
                case 4 -> System.out.println(activa.enRojos() ? "La cuenta está en números rojos" : "La cuenta no está en números rojos");
                case 5 -> System.out.println("Saldo: " + activa.leerSaldo() + " €");
                case 6 -> System.out.println(activa.leerTitular());
                case 7 -> activa.listarMovimientos();
                case 0 -> { }
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    // ---------------- lectura de datos ----------------
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine().trim());
    }

    private static float leerCantidad() {
        System.out.print("Cantidad: ");
        return Float.parseFloat(sc.nextLine().trim().replace(',', '.'));
    }

    private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }
}
