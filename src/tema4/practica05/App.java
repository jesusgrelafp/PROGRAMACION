package tema4.practica05;

import java.util.Random;

/** Práctica 05: prueba de Libro y Persona. */
public class App {

    public static void main(String[] args) {
        // Libro 1: probamos todos los métodos
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 3);
        libro1.pasarPagina();   // cerrado
        libro1.abrir();
        libro1.abrir();         // ya abierto
        libro1.pasarPagina();
        libro1.pasarPagina();
        libro1.pasarPagina();
        libro1.pasarPagina();   // ya en la última
        libro1.cerrar();
        libro1.cerrar();        // ya cerrado
        libro1.mostrarDatos();

        // Libro 2: llegamos a una página aleatoria
        Libro libro2 = new Libro("La Regenta", "Leopoldo Alas \"Clarín\"", 20);
        int destino = new Random().nextInt(libro2.getNumPaginas()) + 1;   // entre 1 y la última
        System.out.println("\nVamos a la página " + destino);
        libro2.abrir();
        while (libro2.getPaginaActual() < destino) {
            libro2.pasarPagina();
        }
        libro2.mostrarDatos();

        // Personas
        System.out.println();
        Persona ana = new Persona("Ana", 19);
        Persona luis = new Persona("Luis", 22);
        ana.hablar(luis);
    }
}
