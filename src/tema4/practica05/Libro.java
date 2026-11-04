package tema4.practica05;

/** Práctica 05: un libro que se puede abrir, cerrar y leer. */
public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean abierto;
    private int paginaActual;   // 0 = aún no se ha leído ninguna

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = Math.max(numPaginas, 1);
    }

    public int getNumPaginas() { return numPaginas; }
    public int getPaginaActual() { return paginaActual; }

    public void abrir() {
        if (abierto) {
            System.out.println("El libro '" + titulo + "' ya está abierto");
        } else {
            abierto = true;
            System.out.println("El libro '" + titulo + "' está ahora abierto");
        }
    }

    public void cerrar() {
        if (!abierto) {
            System.out.println("El libro '" + titulo + "' ya está cerrado");
        } else {
            abierto = false;
            System.out.println("El libro '" + titulo + "' está ahora cerrado");
        }
    }

    public void pasarPagina() {
        if (!abierto) {
            System.out.println("No se puede pasar página: el libro está cerrado");
        } else if (paginaActual == numPaginas) {
            System.out.println("Ya estás en la última página de '" + titulo + "'");
        } else {
            paginaActual++;
            System.out.println("Leída la página " + paginaActual);
        }
    }

    public void mostrarDatos() {
        System.out.println("**** LIBRO ****");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Abierto: " + (abierto ? "sí" : "no"));
        System.out.println("Página actual: " + paginaActual);
    }
}
