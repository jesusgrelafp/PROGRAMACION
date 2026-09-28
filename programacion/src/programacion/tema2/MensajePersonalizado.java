package programacion.tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Crea un programa en JAVA que reciba datos por teclado y escriba un mensaje
 * personalizado.
 *
 * El mensaje debe ser una única String que se deberá imprimir por pantalla.
 *
 * Se deben pedir los siguientes datos:
 * - Nombre.
 * - Apellidos.
 * - Edad a partir del año de nacimiento (mostramos la edad y pedimos
 *   el año de nacimiento).
 * - Ciudad de residencia.
 *
 * Ejemplo:
 *
 * Introduce tu nombre: Ana
 * Introduce tus apellidos: García López
 * Introduce tu año de nacimiento: 2000
 * Introduce tu ciudad de residencia: A Coruña
 *
 * Mensaje:
 * Hola Ana García López, tienes 26 años y resides en A Coruña.
 */
public class MensajePersonalizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Introduce tu año de nacimiento: ");
        int anhoNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce tu ciudad de residencia: ");
        String ciudad = sc.nextLine();

        int anhoActual = 2026;
        int edad = anhoActual - anhoNacimiento;

        String mensaje = "Hola " + nombre + " " + apellidos
                + ", tienes " + edad + " años y resides en " + ciudad + ".";

        System.out.println(mensaje);

        sc.close();
    }
}
