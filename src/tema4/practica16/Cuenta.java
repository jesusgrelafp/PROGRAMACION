package tema4.practica16;

/** Práctica 16: cuenta bancaria con un array de movimientos. */
public class Cuenta {

    public static final int MAX_MOVIMIENTOS = 100;
    private static long siguienteNumero = 1;   // números de cuenta correlativos

    private long numero;
    private float saldo;
    private float interesAnual;
    private Cliente titular;
    private Movimiento[] movimientos;
    private int numMov;

    public Cuenta(Cliente titular) {
        this.numero = siguienteNumero++;
        this.saldo = 0;
        this.interesAnual = 1;     // 1 %
        this.titular = titular;
        this.movimientos = new Movimiento[MAX_MOVIMIENTOS];
        this.numMov = 0;
    }

    public long getNumero() { return numero; }

    private void registrar(char tipo, float cantidad) {
        if (numMov < MAX_MOVIMIENTOS) {
            movimientos[numMov++] = new Movimiento(tipo, cantidad, saldo);
        } else {
            System.out.println("Aviso: se ha alcanzado el máximo de movimientos registrados");
        }
    }

    public void ingreso(float cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }
        saldo += cantidad;
        registrar('I', cantidad);
    }

    public void reintegro(float cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }
        saldo -= cantidad;          // se permite quedar en números rojos
        registrar('R', cantidad);
    }

    public void ingresoInteresesMes() {
        if (saldo > 0) {
            ingreso(interesAnual * saldo / 1200);   // interés anual en % / 12 meses
        } else {
            System.out.println("No se generan intereses con saldo negativo o 0");
        }
    }

    public boolean enRojos() {
        return saldo < 0;
    }

    public float leerSaldo() {
        return saldo;
    }

    public Cliente leerTitular() {
        return titular;
    }

    public void listarMovimientos() {
        if (numMov == 0) {
            System.out.println("No hay movimientos");
        }
        for (int i = 0; i < numMov; i++) {
            System.out.println(movimientos[i]);
        }
    }
}
