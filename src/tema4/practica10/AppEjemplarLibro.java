package tema4.practica10;

/** Práctica 10: prueba de EjemplarLibro. */
public class AppEjemplarLibro {

    public static void main(String[] args) {
        EjemplarLibro quijote1 = new EjemplarLibro("El Quijote");
        EjemplarLibro quijote2 = new EjemplarLibro(quijote1);    // ejemplar 2
        EjemplarLibro quijote3 = new EjemplarLibro(quijote2);    // ejemplar 3
        EjemplarLibro regenta1 = new EjemplarLibro("La Regenta");

        System.out.println("Prestar quijote2: " + quijote2.prestar());   // true
        System.out.println("Prestar quijote2: " + quijote2.prestar());   // false: ya prestado
        System.out.println("Prestar regenta1: " + regenta1.prestar());   // true
        System.out.println("Devolver regenta1: " + regenta1.devolver()); // true
        System.out.println("Devolver quijote3: " + quijote3.devolver()); // false: no estaba prestado

        EjemplarLibro[] libros = { quijote1, quijote2, quijote3, regenta1 };
        for (EjemplarLibro l : libros) {
            System.out.println(l);
        }
    }
}
