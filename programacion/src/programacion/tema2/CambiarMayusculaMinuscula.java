package programacion.tema2;

import java.util.Scanner;

/**
 * Iniciacion a JAVA
 *
 * Crea un programa que reciba un carácter. Si el carácter está en minúsculas, debe imprimir en pantalla
 * el mismo carácter en mayúsculas, y viceversa.
 * La única función de la clase String que se puede utilizar es charAt().
 *
 * Ejemplo para entrada: [ a ]
 * Salida:               [ A ]
 *
 * Ejemplo para entrada: [ G ]
 * Salida:               [ g ]
 *
 */
public class CambiarMayusculaMinuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        char caracter = sc.next().charAt(0);
        sc.close();

        char resultado = caracter;

        // En la tabla ASCII, las mayúsculas y las minúsculas se diferencian en 32 posiciones
        if (caracter >= 'a' && caracter <= 'z') {
            resultado = (char) (caracter - 32);
        } else if (caracter >= 'A' && caracter <= 'Z') {
            resultado = (char) (caracter + 32);
        }

        System.out.println(resultado);
    }
}