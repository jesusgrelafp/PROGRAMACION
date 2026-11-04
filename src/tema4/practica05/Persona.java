package tema4.practica05;

/** Práctica 05: dos personas que se hablan (un objeto envía mensajes a otro). */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }

    /** Recibe otro objeto Persona como parámetro y le envía un mensaje. */
    public void hablar(Persona otra) {
        this.presentarse();
        otra.presentarse();
    }
}
