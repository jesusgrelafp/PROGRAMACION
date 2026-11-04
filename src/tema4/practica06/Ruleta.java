package tema4.practica06;

import java.util.Random;

/** Práctica 06.2: ruleta con apuestas a par o impar. */
public class Ruleta {

    private final Random random = new Random();
    private int ultimoNumero = -1;

    /** Gira la ruleta: número del 0 al 36. */
    public int girar() {
        ultimoNumero = random.nextInt(37);
        return ultimoNumero;
    }

    public int getUltimoNumero() {
        return ultimoNumero;
    }

    /** Gira y devuelve lo ganado (+cantidad) o lo perdido (-cantidad). */
    public int apostarPar(int cantidad) {
        int n = girar();
        return (n != 0 && n % 2 == 0) ? cantidad : -cantidad;
    }

    public int apostarImpar(int cantidad) {
        int n = girar();
        return (n % 2 == 1) ? cantidad : -cantidad;   // el 0 es par: pierde
    }
}
