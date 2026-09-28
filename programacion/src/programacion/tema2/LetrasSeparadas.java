package programacion.tema2;

import java.util.Scanner;

/**
 * Strings en JAVA
 *
 * Crea un programa que te pida un nombre y escriba las letras separadas por espacios.
 *
 * Ejemplo para entrada: [ Pepe ]
 * Salida:               [ P e p e  ]
 *
 */
public class LetrasSeparadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();
        sc.close();

        String resultado = "";

        for (int i = 0; i < nombre.length(); i++) {
            resultado = resultado + nombre.charAt(i) + " ";
        }

        System.out.println(resultado);
    }
}