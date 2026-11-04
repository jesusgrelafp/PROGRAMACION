package tema4.practica01;

/** Práctica 01.3: clase Coche. */
public class Coche {

    private String matricula;
    private int velocidad;   // km/h, empieza en 0

    /*
     * En el constructor van los atributos que identifican al objeto o que
     * necesita para existir (la matrícula). La velocidad cambia con el uso.
     */
    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() { return matricula; }
    public int getVelocidad() { return velocidad; }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }

    public void frenar(int decremento) {
        if (decremento > 0) {
            velocidad = Math.max(velocidad - decremento, 0);   // nunca baja de 0
        }
    }

    public void mostrarVelocidad() {
        System.out.println("Coche " + matricula + ": " + velocidad + " km/h");
    }
}
