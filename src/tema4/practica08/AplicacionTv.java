package tema4.practica08;

/** Práctica 08: cada televisor tiene su propio estado. */
public class AplicacionTv {

    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor();

        System.out.println("--- tv1 ---");
        tv1.bajarCanal();      // 0
        tv1.bajarCanal();      // 10 (cíclico)
        tv1.subirCanal();      // 0
        for (int i = 0; i < 12; i++) {
            tv1.subirVolumen(); // se queda en 15
        }

        System.out.println("--- tv2 ---");
        tv2.subirColor();      // se queda en 7
        for (int i = 0; i < 8; i++) {
            tv2.bajarColor();  // se queda en 1
        }

        System.out.println("tv1 -> " + tv1);
        System.out.println("tv2 -> " + tv2);
    }
}
