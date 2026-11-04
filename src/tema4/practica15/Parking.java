package tema4.practica15;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Práctica 15: parking en fila (el último en entrar es el primero en salir).
 * La clase no escribe nada en consola: solo devuelve datos.
 */
public class Parking {

    public static final int PLAZAS = 20;
    private static final double EUROS_MINUTO = 0.02;
    private static final double MAXIMO = 10;

    private String[] matriculas = new String[PLAZAS];
    private LocalDateTime[] entradas = new LocalDateTime[PLAZAS];   // ampliación
    private int siguiente = 0;            // posición en la que aparcará el próximo coche
    private double recaudado = 0;
    private double ultimoImporte = 0;

    /** Devuelve la plaza ocupada (1 = la del fondo) o 0 si está lleno. */
    public int aparcar(String matricula) {
        if (siguiente == PLAZAS) {
            return 0;
        }
        matriculas[siguiente] = matricula;
        entradas[siguiente] = LocalDateTime.now();
        siguiente++;
        return siguiente;
    }

    /** No necesita parámetros: siempre sale el último que entró. */
    public String desaparcar() {
        if (siguiente == 0) {
            ultimoImporte = 0;
            return "";
        }
        siguiente--;
        String matricula = matriculas[siguiente];
        long minutos = Duration.between(entradas[siguiente], LocalDateTime.now()).toMinutes();
        ultimoImporte = Math.min(minutos * EUROS_MINUTO, MAXIMO);
        recaudado += ultimoImporte;
        matriculas[siguiente] = null;
        entradas[siguiente] = null;
        return matricula;
    }

    public int plazasLibres() {
        return PLAZAS - siguiente;
    }

    public String estado() {
        if (siguiente == 0) {
            return "Parking vacío";
        }
        String s = "";
        for (int i = 0; i < siguiente; i++) {
            s += "Plaza " + (i + 1) + ": " + matriculas[i] + "\n";
        }
        return s;
    }

    public double getUltimoImporte() { return ultimoImporte; }
    public double getRecaudado() { return recaudado; }
}
