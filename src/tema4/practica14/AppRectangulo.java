package tema4.practica14;

/** Práctica 14: prueba de la clase Rectangulo. */
public class AppRectangulo {

    public static void main(String[] args) {
        Punto origen = new Punto();
        Rectangulo r1 = new Rectangulo(origen, new Punto(4, 3));
        Rectangulo r2 = new Rectangulo(new Punto(3, 2), 5, 5);

        System.out.println(r1 + " área " + r1.area() + ", perímetro " + r1.perimetro());
        System.out.println(r2 + " área " + r2.area() + ", perímetro " + r2.perimetro());

        System.out.println("¿r1 contiene (2,2)? " + r1.contiene(new Punto(2, 2)));
        System.out.println("¿r1 y r2 se solapan? " + Rectangulo.seSolapan(r1, r2));

        r1.desplazar(-10, 0);
        System.out.println("r1 desplazado: " + r1);
        System.out.println("¿r1 y r2 se solapan? " + Rectangulo.seSolapan(r1, r2));

        origen.setX(100);   // r1 guardó una copia: no le afecta
        System.out.println("Tras cambiar el punto original: " + r1);
    }
}
