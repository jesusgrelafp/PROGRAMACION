package tema3;

import java.util.Scanner;

public class PalabraOrdenada {

    public static void main(String[] args) {
        String palabra = pedirPalabra();
        if (estaOrdenada(palabra))
            System.out.println(palabra + " esta ordenada alfabeticamente");
        else
            System.out.println(palabra + " NO esta ordenada alfabeticamente");
    }

    // Comprueba si las letras de la palabra estan en orden alfabetico
    static boolean estaOrdenada(String palabra) {
        if (palabra.length() <= 1)
            return true;                                             // caso base: 0 o 1 letras
        else if (palabra.charAt(0) > palabra.charAt(1))
            return false;                                            // dos letras seguidas desordenadas
        else
            return estaOrdenada(palabra.substring(1));     // caso general: comprobamos el resto
    }

    // Solicita la palabra por teclado
    static String pedirPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.next().toLowerCase();
        sc.close();
        return palabra;
    }
}
