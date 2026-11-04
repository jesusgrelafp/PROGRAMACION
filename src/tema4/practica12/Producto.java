package tema4.practica12;

/** Práctica 12: la clase Producto de las cuestiones (tal cual el enunciado). */
public class Producto {
    public String nombre;
    public double precio;
    public double IVA;
    private double descuento;

    public Producto(String nom, double p, double IVA) {
        this.nombre = nom;
        this.precio = p;
        this.IVA = IVA;
        this.descuento = 0;
    }

    public double calcularPrecioFinal() {
        double prFin = precio + precio * IVA;
        return prFin - prFin * descuento;
    }

    public void setDescuento(double desc) {
        this.descuento = desc;
    }
}
