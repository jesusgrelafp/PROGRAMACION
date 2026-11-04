package tema4.practica04;

import java.util.Scanner;

/** Práctica 04: array de 5 contraseñas y su fortaleza. */
public class AppPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Longitud de las contraseñas: ");
        int longitud = sc.nextInt();

        Password[] passwords = new Password[5];
        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(longitud);
        }

        for (Password p : passwords) {
            System.out.println(p.getContrasena() + "  ->  " + (p.esFuerte() ? "fuerte" : "débil"));
        }
        // passwords[0].contrasena = "1234";     // ERROR: atributo private
        // passwords[0].generarPassword();       // ERROR: método private
        sc.close();
    }
}
