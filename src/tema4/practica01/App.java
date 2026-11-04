package tema4.practica01;

/** Práctica 01: crea los objetos y muestra los resultados. */
public class App {

    public static void main(String[] args) {
        System.out.println("*** CÍRCULO ***");
        Circulo miCirculo = new Circulo(5);
        System.out.printf("Radio: %.2f%n", miCirculo.getRadio());
        System.out.printf("Circunferencia: %.2f%n", miCirculo.calcularCircunferencia());
        System.out.printf("Área: %.2f%n", miCirculo.calcularArea());
        System.out.printf("Diámetro: %.2f%n", miCirculo.calcularDiametro());

        System.out.println("\n*** RECTÁNGULOS ***");
        Rectangulo r1 = new Rectangulo(2, 4);
        Rectangulo r2 = new Rectangulo(3, 4);
        Rectangulo[] rectangulos = { r1, r2 };
        for (Rectangulo r : rectangulos) {
            System.out.printf("%.1f x %.1f -> perímetro %.2f, área %.2f, diagonal %.2f%n",
                    r.getBase(), r.getAltura(), r.calcularPerimetro(), r.calcularArea(), r.calcularDiagonal());
        }

        System.out.println("\n*** COCHES ***");
        Coche coche1 = new Coche("1234ABC");
        Coche coche2 = new Coche("5678DEF");

        coche1.acelerar(50);
        coche1.acelerar(20);
        coche1.frenar(10);
        coche2.acelerar(80);
        coche2.frenar(30);
        coche2.frenar(100);          // no baja de 0

        coche1.mostrarVelocidad();   // 60 km/h
        coche2.mostrarVelocidad();   // 0 km/h: cada coche tiene su propia velocidad
    }
}
