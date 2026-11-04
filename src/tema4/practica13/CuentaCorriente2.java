package tema4.practica13;

/** Práctica 13 (versión b): la comisión es común a todas las cuentas (static). */
public class CuentaCorriente2 {

    private static final float REGALO = 0.7f;

    public String iban;
    private float saldo;
    private int ingresosSeguidos;
    private static float porcentajeComision = 0;   // una sola para todas las cuentas

    public CuentaCorriente2(String iban) {
        this.iban = iban;
        this.saldo = 0;
    }

    public void ingresar(float importe) {
        if (importe <= 0) {
            return;
        }
        saldo += importe;
        ingresosSeguidos++;
        if (ingresosSeguidos == 3) {     // regalo por 3 ingresos seguidos
            saldo += REGALO;
            ingresosSeguidos = 0;
        }
    }

    public boolean retirar(float importe) {
        float total = importe + importe * porcentajeComision / 100;
        if (importe <= 0 || total > saldo) {
            return false;
        }
        saldo -= total;
        ingresosSeguidos = 0;
        return true;
    }

    public float getSaldo() { return saldo; }
    public static void setComision(float porcentaje) { porcentajeComision = porcentaje; }
    public static float getPorcentajeComision() { return porcentajeComision; }
}
