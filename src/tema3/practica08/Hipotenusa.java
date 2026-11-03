package tema3.practica08;

/** Práctica 08.1: hipotenusa a partir de dos argumentos (java Hipotenusa 4 3). */
public class Hipotenusa {

    static boolean esEnteroPositivo(String s) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return Integer.parseInt(s) > 0;
    }

    public static void main(String[] args) {
        if (args.length != 2 || !esEnteroPositivo(args[0]) || !esEnteroPositivo(args[1])) {
            System.out.println("Uso: java Hipotenusa <cateto1> <cateto2> (enteros positivos)");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("Hipotenusa: %.2f%n", Math.sqrt(a * a + b * b));
    }
}
