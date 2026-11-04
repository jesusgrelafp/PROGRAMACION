package tema4.practica14;

/**
 * Práctica 14: un rectángulo formado por dos objetos Punto.
 * Guarda COPIAS de los puntos recibidos para que nadie de fuera pueda
 * deformar el rectángulo modificando esos puntos.
 */
public class Rectangulo {

    private Punto inferiorIzquierda;
    private Punto superiorDerecha;

    public Rectangulo(Punto inferiorIzquierda, Punto superiorDerecha) {
        // Ordenamos las coordenadas por si los puntos vienen "al revés"
        int x1 = Math.min(inferiorIzquierda.getX(), superiorDerecha.getX());
        int y1 = Math.min(inferiorIzquierda.getY(), superiorDerecha.getY());
        int x2 = Math.max(inferiorIzquierda.getX(), superiorDerecha.getX());
        int y2 = Math.max(inferiorIzquierda.getY(), superiorDerecha.getY());
        this.inferiorIzquierda = new Punto(x1, y1);
        this.superiorDerecha = new Punto(x2, y2);
    }

    public Rectangulo(Punto inferiorIzquierda, int base, int altura) {
        this(inferiorIzquierda,
             new Punto(inferiorIzquierda.getX() + base, inferiorIzquierda.getY() + altura));
    }

    public int getBase() {
        return superiorDerecha.getX() - inferiorIzquierda.getX();
    }

    public int getAltura() {
        return superiorDerecha.getY() - inferiorIzquierda.getY();
    }

    public int area() {
        return getBase() * getAltura();
    }

    public int perimetro() {
        return 2 * (getBase() + getAltura());
    }

    public void desplazar(int dx, int dy) {
        inferiorIzquierda.setX(inferiorIzquierda.getX() + dx);
        inferiorIzquierda.setY(inferiorIzquierda.getY() + dy);
        superiorDerecha.setX(superiorDerecha.getX() + dx);
        superiorDerecha.setY(superiorDerecha.getY() + dy);
    }

    public boolean contiene(Punto p) {
        return p.getX() >= inferiorIzquierda.getX() && p.getX() <= superiorDerecha.getX()
            && p.getY() >= inferiorIzquierda.getY() && p.getY() <= superiorDerecha.getY();
    }

    /** Se solapan si no está uno completamente a un lado del otro. */
    public static boolean seSolapan(Rectangulo a, Rectangulo b) {
        return a.inferiorIzquierda.getX() < b.superiorDerecha.getX()
            && b.inferiorIzquierda.getX() < a.superiorDerecha.getX()
            && a.inferiorIzquierda.getY() < b.superiorDerecha.getY()
            && b.inferiorIzquierda.getY() < a.superiorDerecha.getY();
    }

    @Override
    public String toString() {
        return "Rectángulo [(" + inferiorIzquierda.getX() + ", " + inferiorIzquierda.getY() + ") - ("
                + superiorDerecha.getX() + ", " + superiorDerecha.getY() + ")]";
    }
}
