package tema4.practica09;

/** Práctica 09: constructores encadenados con this(...). */
public class Cafetera {

    private int capacidadMaxima;   // c.c.
    private int cantidadActual;    // c.c.

    /** 1000 c.c. y vacía. */
    public Cafetera() {
        this(1000, 0);
    }

    /** Capacidad indicada y llena. */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, capacidadMaxima);
    }

    /** Si la cantidad supera la capacidad, se ajusta al máximo. */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = Math.max(capacidadMaxima, 0);
        this.cantidadActual = Math.min(Math.max(cantidadActual, 0), this.capacidadMaxima);
    }

    public int getCapacidadMaxima() { return capacidadMaxima; }
    public int getCantidadActual() { return cantidadActual; }

    public void llenar() {
        cantidadActual = capacidadMaxima;
    }

    public void vaciar() {
        cantidadActual = 0;
    }

    /** Sirve una taza; si no hay suficiente, sirve lo que quede. */
    public int servirTaza(int cc) {
        int servido = Math.min(cc, cantidadActual);
        cantidadActual -= servido;
        return servido;
    }

    public void agregarCafe(int cc) {
        cantidadActual = Math.min(cantidadActual + cc, capacidadMaxima);
    }

    @Override
    public String toString() {
        return "Cafetera " + cantidadActual + "/" + capacidadMaxima + " c.c.";
    }
}
