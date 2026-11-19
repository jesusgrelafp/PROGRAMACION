package tema4.practica11;

/** Práctica 11: números racionales con métodos estáticos. */
public class Racional {

    private static int cantidadRacionales = 0;   // atributo de clase

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("El denominador no puede ser 0. Se usa 1.");
            denominador = 1;
        }
        // El signo siempre en el numerador
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
        int m = mcd(numerador, denominador);
        this.numerador = numerador / m;
        this.denominador = denominador / m;
        cantidadRacionales++;
    }

    /** Máximo común divisor (algoritmo de Euclides). */
    public static int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a == 0 ? 1 : a;
    }

    public static int getCantidadRacionales() {
        return cantidadRacionales;
    }

    public int getNumerador() { return numerador; }
    public int getDenominador() { return denominador; }

    // Cada operación devuelve un Racional nuevo, ya simplificado por el constructor
    public Racional sumar(Racional otro) {
        return new Racional(numerador * otro.denominador + otro.numerador * denominador,
                denominador * otro.denominador);
    }

    public Racional restar(Racional otro) {
        return new Racional(numerador * otro.denominador - otro.numerador * denominador,
                denominador * otro.denominador);
    }

    public Racional multiplicar(Racional otro) {
        return new Racional(numerador * otro.numerador, denominador * otro.denominador);
    }

    public Racional dividir(Racional otro) {
        if (otro.numerador == 0) {
            System.out.println("No se puede dividir entre 0.");
            return null;
        }
        return new Racional(numerador * otro.denominador, denominador * otro.numerador);
    }

    /** 1/2 y 2/4 son iguales: a/b == c/d si a*d == b*c */
    public boolean esIgual(Racional otro) {
        return numerador * otro.denominador == otro.numerador * denominador;
    }

    @Override
    public String toString() {
        return denominador == 1 ? String.valueOf(numerador) : numerador + "/" + denominador;
    }
}
