package tema4.practica13;

/** Práctica 13: cuenta corriente con comisión propia de cada cuenta. */
public class CuentaCorriente {

    private static final float REGALO = 0.7f;

    public String iban;
    private float saldo;
    private int ingresosSeguidos;
    private float porcentajeComision;

    public CuentaCorriente(String iban, float porcentajeComision) {
        this.iban = iban;
        this.porcentajeComision = porcentajeComision;
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
    public void setComision(float porcentaje) { this.porcentajeComision = porcentaje; }
    public float getPorcentajeComision() { return porcentajeComision; }
}
