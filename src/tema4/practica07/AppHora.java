package tema4.practica07;

/** Práctica 07: prueba de la clase Hora. */
public class AppHora {

    public static void main(String[] args) {
        Hora h1 = new Hora(23, 59, 58);
        Hora h2 = new Hora(8, 30, 0);

        System.out.println("h1 = " + h1 + " (" + h1.aSegundos() + " s desde las 00:00:00)");
        h1.avanzarSegundo();
        System.out.println("h1 + 1 s = " + h1);
        h1.avanzarSegundo();
        System.out.println("h1 + 1 s = " + h1);      // 00:00:00

        h2.setMinutos(75);                             // no válido: no cambia
        System.out.println("h2 = " + h2);
        System.out.println("¿h1 es anterior a h2? " + h1.esAnterior(h2));
    }
}
