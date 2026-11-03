package tema3.practica04;

/** Práctica 04.2: la String más larga de un Array. */
public class StringMasLarga {

    static String masLarga(String[] palabras) {
        String mayor = "";
        for (String p : palabras) {
            if (p.length() > mayor.length()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        String[] palabras = {"sol", "programación", "Java", "array"};
        System.out.println("La más larga es: " + masLarga(palabras));   // programación
    }
}
