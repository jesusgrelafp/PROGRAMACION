package tema3.practica08;

/** Práctica 08.2: agenda en dos Arrays paralelos; el nombre llega como argumento. */
public class Agenda {

    static String[] nombres = {"Marta", "Miguel", "Ana", "Daniel"};
    static String[] telefonos = {"666111222", "981981981", "900900900", "+34881000001"};

    static int buscar(String nombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java Agenda <nombre>");
            return;
        }
        int pos = buscar(args[0]);
        System.out.println(pos >= 0 ? "Teléfono de " + nombres[pos] + ": " + telefonos[pos]
                                    : args[0] + " no está en la agenda");
    }
}
