package tema4.practica14;

/** La clase Punto completa de la diapositiva «La clase Punto completa». */
public class Punto {
    private int x;
    private int y;
    private static int cantidadPuntos = 0;

    public Punto() { this(0, 0); }
    public Punto(int a) { this(a, a); }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        cantidadPuntos++;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public double calcularDistanciaCentro() {
        return Math.sqrt(x * x + y * y);
    }

    public void mostrarDatos() {
        System.out.println("Punto (" + x + ", " + y + ")");
    }

    public static int getPuntos() { return cantidadPuntos; }
}
