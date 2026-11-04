package tema4.practica17;

/** Práctica 17: una página de la agenda (un día) con sus citas. */
public class Pagina {

    public static final int MAX_CITAS = 50;

    private int dia;
    private int mes;
    private Cita[] citas;
    private int numCitas;

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.citas = new Cita[MAX_CITAS];
        this.numCitas = 0;
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }

    /** Añade la cita manteniendo el array ordenado por hora. */
    public boolean agregarCita(Cita c) {
        if (numCitas == MAX_CITAS) {
            System.out.println("La página está llena");
            return false;
        }
        int pos = 0;
        while (pos < numCitas && citas[pos].minutosDelDia() < c.minutosDelDia()) {
            pos++;
        }
        if (pos < numCitas && citas[pos].minutosDelDia() == c.minutosDelDia()) {
            System.out.println("Ya hay una cita a esa hora: " + citas[pos].getTitulo());
            return false;
        }
        for (int i = numCitas; i > pos; i--) {   // hacemos hueco
            citas[i] = citas[i - 1];
        }
        citas[pos] = c;
        numCitas++;
        return true;
    }

    public boolean borrarCita(Cita c) {
        for (int i = 0; i < numCitas; i++) {
            if (citas[i] == c) {
                for (int j = i; j < numCitas - 1; j++) {
                    citas[j] = citas[j + 1];
                }
                citas[--numCitas] = null;
                return true;
            }
        }
        return false;
    }

    public Cita buscarCita(String titulo) {
        for (int i = 0; i < numCitas; i++) {
            if (citas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return citas[i];
            }
        }
        return null;
    }

    /** Muestra las citas (ya están ordenadas por hora) y devuelve una copia del array. */
    public Cita[] verCitas() {
        System.out.println("Citas del " + dia + "/" + mes + ":");
        if (numCitas == 0) {
            System.out.println("  (sin citas)");
        }
        Cita[] copia = new Cita[numCitas];
        for (int i = 0; i < numCitas; i++) {
            System.out.println("  " + citas[i]);
            copia[i] = citas[i];
        }
        return copia;
    }
}
