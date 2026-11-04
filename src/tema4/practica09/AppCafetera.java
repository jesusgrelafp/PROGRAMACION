package tema4.practica09;

/** Práctica 09: una cafetera con cada constructor. */
public class AppCafetera {

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();            // 0/1000
        Cafetera c2 = new Cafetera(500);         // 500/500
        Cafetera c3 = new Cafetera(300, 800);    // se ajusta: 300/300

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Servido: " + c2.servirTaza(200) + " c.c. -> " + c2);
        System.out.println("Servido: " + c2.servirTaza(200) + " c.c. -> " + c2);
        System.out.println("Servido: " + c2.servirTaza(200) + " c.c. -> " + c2);   // solo quedan 100

        c1.agregarCafe(1500);                    // no supera la capacidad
        System.out.println("Tras agregar 1500 c.c.: " + c1);
        c1.vaciar();
        System.out.println("Tras vaciar: " + c1);
    }
}
