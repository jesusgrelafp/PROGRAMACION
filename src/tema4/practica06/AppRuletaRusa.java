package tema4.practica06;

/** Práctica 06.1: partida de ruleta rusa entre dos jugadores. */
public class AppRuletaRusa {

    public static void main(String[] args) {
        Pistola pistola = new Pistola();
        String[] jugadores = { "Jugador 1", "Jugador 2" };
        int turno = 0;
        boolean fin = false;

        while (!fin) {
            String jugador = jugadores[turno % 2];
            System.out.print(jugador + " dispara... ");
            if (pistola.disparar()) {
                System.out.println("¡PUM! " + jugador + " pierde.");
                fin = true;
            } else {
                System.out.println("clic");
                turno++;
            }
        }
    }
}
