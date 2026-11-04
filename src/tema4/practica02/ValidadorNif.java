package tema4.practica02;

import java.util.Scanner;

/** Práctica 02.2: validación de un NIF con métodos de String. */
public class ValidadorNif {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static boolean esValido(String nif) {
        nif = nif.trim().toUpperCase();          // acepta la letra en minúscula
        if (nif.length() != 9) {
            return false;
        }
        String digitos = nif.substring(0, 8);
        for (int i = 0; i < digitos.length(); i++) {
            if (!Character.isDigit(digitos.charAt(i))) {
                return false;
            }
        }
        int numero = Integer.parseInt(digitos);
        char letraCorrecta = LETRAS.charAt(numero % 23);
        return nif.charAt(8) == letraCorrecta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un NIF: ");
        String nif = sc.nextLine();
        System.out.println(esValido(nif) ? "NIF correcto" : "NIF incorrecto");
        sc.close();
    }
}
