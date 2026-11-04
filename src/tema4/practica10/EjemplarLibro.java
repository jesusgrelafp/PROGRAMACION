package tema4.practica10;

import java.time.LocalDate;

/** Práctica 10: ejemplares de libros con constructor copia. */
public class EjemplarLibro {

    private String titulo;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private boolean prestado;

    /** Constructor 1: primer ejemplar de un título. */
    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        this.fechaAdquisicion = LocalDate.now();
        this.numeroEjemplar = 1;
        this.prestado = false;
    }

    /** Constructor 2 (copia): un ejemplar más del mismo libro. */
    public EjemplarLibro(EjemplarLibro otro) {
        this.titulo = otro.titulo;                     // dentro de la clase se puede acceder
        this.fechaAdquisicion = otro.fechaAdquisicion; // a los atributos private de otro objeto
        this.numeroEjemplar = otro.numeroEjemplar + 1;
        this.prestado = false;
    }

    public boolean prestar() {
        if (prestado) {
            return false;
        }
        prestado = true;
        return true;
    }

    public boolean devolver() {
        if (!prestado) {
            return false;
        }
        prestado = false;
        return true;
    }

    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return titulo + " (" + fechaAdquisicion + ") [" + numeroEjemplar + "]" + (prestado ? " - prestado" : "");
    }
}
