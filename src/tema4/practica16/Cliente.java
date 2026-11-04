package tema4.practica16;

import java.time.LocalDate;

/** Práctica 16: cliente de la sucursal. */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;
    private LocalDate fNacimiento;

    public Cliente(String nombre, String apellidos, String direccion, String localidad, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public LocalDate getFNacimiento() { return fNacimiento; }

    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String direccionCompleta() {
        return direccion + ", " + localidad;
    }

    public boolean esLlamado(String nombre, String apellidos) {
        return this.nombre.equalsIgnoreCase(nombre) && this.apellidos.equalsIgnoreCase(apellidos);
    }

    @Override
    public String toString() {
        return nombreCompleto() + " - " + direccionCompleta() + " - nacido el " + fNacimiento;
    }
}
