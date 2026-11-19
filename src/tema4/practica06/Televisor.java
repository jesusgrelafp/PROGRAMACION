package tema4.practica08;

/**
 * Práctica 08: versión final del Televisor (apartados 1 a 6).
 * - Canal: de 0 a 10, cíclico (del 10 se pasa al 0 y del 0 al 10).
 * - Volumen: de 0 a 15, se queda en los extremos.
 * - Color: de 1 a 7, se queda en los extremos.
 * El apartado 2 (no hacer nada con valores negativos o a partir de 100)
 * se sustituye por los rangos de los apartados 4 a 6.
 */
public class Televisor {

    private static final int CANAL_MIN = 0, CANAL_MAX = 10;
    private static final int VOLUMEN_MIN = 0, VOLUMEN_MAX = 15;
    private static final int COLOR_MIN = 1, COLOR_MAX = 7;

    private int canal;
    private int volumen;
    private int color;

    public Televisor() {
        canal = 1;
        volumen = 5;
        color = 7;
    }

    public int getCanal() { return canal; }
    public int getVolumen() { return volumen; }
    public int getColor() { return color; }

    // ---------- canal ----------
    public void setCanal(int valorCanal) {
        if (valorCanal >= CANAL_MIN && valorCanal <= CANAL_MAX) {
            canal = valorCanal;
            System.out.println("Canal: " + canal);
        }
    }

    public void subirCanal() {
        setCanal(canal == CANAL_MAX ? CANAL_MIN : canal + 1);
    }

    public void bajarCanal() {
        setCanal(canal == CANAL_MIN ? CANAL_MAX : canal - 1);
    }

    // ---------- volumen ----------
    public void subirVolumen() {
        if (volumen < VOLUMEN_MAX) {
            volumen++;
        }
        System.out.println("Volumen: " + volumen);
    }

    public void bajarVolumen() {
        if (volumen > VOLUMEN_MIN) {
            volumen--;
        }
        System.out.println("Volumen: " + volumen);
    }

    // ---------- color ----------
    public void subirColor() {
        if (color < COLOR_MAX) {
            color++;
        }
        System.out.println("Color: " + color);
    }

    public void bajarColor() {
        if (color > COLOR_MIN) {
            color--;
        }
        System.out.println("Color: " + color);
    }

    @Override
    public String toString() {
        return "Canal " + canal + ", volumen " + volumen + ", color " + color;
    }
}
