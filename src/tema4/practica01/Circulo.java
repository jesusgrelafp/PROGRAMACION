package tema4.practica01;

/** Práctica 01.1: clase Circulo. */
public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularDiametro() {
        return 2 * radio;
    }
}
