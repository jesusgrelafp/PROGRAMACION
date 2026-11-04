package tema4.practica16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Práctica 16: movimiento de una cuenta (ingreso 'I' o reintegro 'R'). */
public class Movimiento {

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private LocalDateTime fecha;
    private char tipo;
    private float importe;
    private float saldo;   // saldo de la cuenta después del movimiento

    public Movimiento(char tipo, float importe, float saldo) {
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String t = tipo == 'I' ? "Ingreso  " : "Reintegro";
        return fecha.format(FORMATO) + "  " + t + "  " + importe + " €  -> saldo " + saldo + " €";
    }
}
