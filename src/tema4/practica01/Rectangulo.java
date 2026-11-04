package tema4.practica01;

/** Práctica 01.2: clase Rectangulo (base y altura). */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularDiagonal() {
        return Math.sqrt(base * base + altura * altura);   // Pitágoras
    }
}
