package tema4.practica17;

/** Práctica 17: la agenda CREA sus páginas (composición). */
public class Agenda {

    private static final int[] DIAS_MES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private final int anyo;
    private final Pagina[] paginas;
    private int abierta;              // índice de la página abierta

    public Agenda(int anyo) {
        this.anyo = anyo;
        paginas = new Pagina[365];   // año no bisiesto
        int i = 0;
        for (int mes = 1; mes <= 12; mes++) {
            for (int dia = 1; dia <= DIAS_MES[mes - 1]; dia++) {
                paginas[i++] = new Pagina(dia, mes);
            }
        }
        abierta = 0;
    }

    public int getAnyo() { return anyo; }

    public Pagina leerPagina() {
        return paginas[abierta];
    }

    public void avanzarPagina() {
        if (abierta < paginas.length - 1) {
            abierta++;
        }
    }

    public void retrocederPagina() {
        if (abierta > 0) {
            abierta--;
        }
    }

    /** Abre directamente la página de un día y un mes. */
    public boolean abrirPagina(int dia, int mes) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > DIAS_MES[mes - 1]) {
            System.out.println("Fecha no válida: " + dia + "/" + mes);
            return false;
        }
        int indice = dia - 1;
        for (int m = 0; m < mes - 1; m++) {
            indice += DIAS_MES[m];
        }
        abierta = indice;
        return true;
    }
}
