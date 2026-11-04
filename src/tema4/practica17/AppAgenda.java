package tema4.practica17;

/** Práctica 17: añadir citas a la agenda y mostrarlas. */
public class AppAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(2027);

        agenda.abrirPagina(3, 2);
        Pagina p = agenda.leerPagina();
        p.agregarCita(new Cita(11, 30, "Reunión 1", "Qué lenguaje aprender primero"));
        p.agregarCita(new Cita(9, 15, "Tutoría", "Revisión de la práctica 16"));
        p.agregarCita(new Cita(16, 0, "Reunión 2", "El futuro de la IA"));
        p.agregarCita(new Cita(11, 30, "Reunión 3", "Videojuegos con Unity"));   // misma hora: rechazada
        p.verCitas();

        agenda.avanzarPagina();
        agenda.leerPagina().verCitas();   // 4/2, sin citas

        agenda.abrirPagina(31, 12);
        agenda.leerPagina().agregarCita(new Cita(23, 59, "Fin de año", "Uvas"));
        agenda.leerPagina().verCitas();
    }
}
