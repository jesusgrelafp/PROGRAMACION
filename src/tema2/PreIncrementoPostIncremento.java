package tema2;

/**
 * HOJA DE ESTUDIO: Pre-incremento vs Post-incremento en Java
 * ----------------------------------------------------------
 * Regla mnemotécnica:
 *  - ++a (Pre)  -> "Primero SUMO en memoria, luego USO el valor".
 *  - a++ (Post) -> "Primero USO el valor actual, luego SUMO en memoria".
 */

public class PreIncrementoPostIncremento {
    public static void main(String[] args) {
        System.out.println("=== CASO 1: EL PRE-INCREMENTO (++a) ===");
        int a = 5;
        System.out.println("Valor inicial de a: " + a); // Imprime 5

        // Explicación: Incrementa a 6 en memoria, luego imprime 6
        System.out.println("Ejecutando (++a): " + (++a)); // Imprime 6
        System.out.println("Valor final en memoria: " + a); // Imprime 6

        System.out.println("\n=== CASO 2: EL POST-INCREMENTO (a++) ===");
        int b = 5;
        System.out.println("Valor inicial de b: " + b); // Imprime 5

        // Explicación: Imprime el valor actual (5), luego b sube a 6 en memoria
        System.out.println("Ejecutando (b++): " + (b++)); // Imprime 5
        System.out.println("Valor final en memoria: " + b); // Imprime 6

        System.out.println("\n=== CASO 3: Combinando ambas ===");
        int x = 10;
        // Paso 1: x++ devuelve 10 (y x pasa a valer 11 en memoria)
        // Paso 2: ++x incrementa x de 11 a 12 en memoria, y devuelve 12
        // Operación final: 10 + 12 = 22
        int resultado = (x++) + (++x);

        System.out.println("Para x = 10 -> (x++) + (++x)");
        System.out.println("Resultado de la operación: " + resultado); // Imprime 22
        System.out.println("Valor final de x en memoria: " + x);     // Imprime 12
    }
}
