package tema4.practica17;

/** Práctica 17: una cita a una hora concreta. */
public class Cita {

    private int hora;
    private int minutos;
    private String titulo;
    private String texto;

    public Cita(int hora, int minutos, String titulo, String texto) {
        if (hora < 0 || hora > 23) {
            System.out.println("Hora no válida: se usa 0");
            hora = 0;
        }
        if (minutos < 0 || minutos > 59) {
            System.out.println("Minutos no válidos: se usa 0");
            minutos = 0;
        }
        this.hora = hora;
        this.minutos = minutos;
        this.titulo = titulo;
        this.texto = texto;
    }

    public int getHora() { return hora; }
    public int getMinutos() { return minutos; }
    public String getTitulo() { return titulo; }
    public String getTexto() { return texto; }

    public void modificarTexto(String texto) {
        this.texto = texto;
    }

    /** Minutos desde las 0:00, útil para comparar y ordenar citas. */
    public int minutosDelDia() {
        return hora * 60 + minutos;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d  %s: %s", hora, minutos, titulo, texto);
    }
}
