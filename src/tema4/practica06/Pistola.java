package tema4.practica06;

import java.util.Random;

/** Práctica 06.1: pistola de la ruleta rusa (6 huecos, 1 bala). */
public class Pistola {

    private static final int HUECOS = 6;
    private final Random random = new Random();
    private int posicionBala;    // 1..6
    private int posicionActual;  // hueco que se dispara a continuación

    public Pistola() {
        cargar();
    }

    /** Coloca la bala en una posición al azar y vuelve al primer hueco. */
    public void cargar() {
        posicionBala = random.nextInt(HUECOS) + 1;
        posicionActual = 1;
    }

    /** Dispara el hueco actual: devuelve true si estaba la bala. */
    public boolean disparar() {
        boolean bala = posicionActual == posicionBala;
        posicionActual++;
        return bala;
    }
}
