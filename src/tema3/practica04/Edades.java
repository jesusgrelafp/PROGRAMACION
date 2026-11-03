package tema3.practica04;

import java.util.Arrays;

/** Práctica 04.5: edad media y Array con los mayores de edad. */
public class Edades {

    static double media(int[] edades) {
        int suma = 0;
        for (int e : edades) {
            suma += e;
        }
        return edades.length == 0 ? 0 : (double) suma / edades.length;
    }

    static int[] mayoresDeEdad(int[] edades) {
        int cuantos = 0;                     // 1ª pasada: contar para saber el tamaño
        for (int e : edades) {
            if (e >= 18) cuantos++;
        }
        int[] mayores = new int[cuantos];
        int j = 0;                           // 2ª pasada: copiar
        for (int e : edades) {
            if (e >= 18) mayores[j++] = e;
        }
        return mayores;
    }

    public static void main(String[] args) {
        int[] edades = {17, 19, 18, 22, 16, 30};
        System.out.printf("Edad media: %.2f%n", media(edades));                  // 20,33
        System.out.println("Mayores de edad: " + Arrays.toString(mayoresDeEdad(edades)));   // [19, 18, 22, 30]
    }
}
