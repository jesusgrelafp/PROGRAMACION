package tema4.practica12;

/** Práctica 12: respuestas a las cuestiones sobre la clase Producto. */
public class RespuestasProducto {

    public static void main(String[] args) {
        // a) 4 atributos (nombre, precio, IVA y descuento), 1 constructor
        //    y 2 métodos (calcularPrecioFinal y setDescuento).

        // b) Se crean con descuento 0 (lo fija el constructor).
        Producto p1 = new Producto("ordenador", 800, 0.21);
        Producto p2 = new Producto("barra de pan", 1, 0.04);

        // c)
        System.out.println(p1.nombre + ": " + p1.calcularPrecioFinal());   // 968.0
        System.out.println(p2.nombre + ": " + p2.calcularPrecioFinal());   // 1.04

        // d) 10 % = 0.1
        p1.setDescuento(0.1);
        System.out.println(p1.nombre + " con descuento: " + p1.calcularPrecioFinal());   // 871.2

        // e) nombre es public: se puede cambiar directamente
        p2.nombre = "baguette";

        // f) p1.IVA = p2.IVA; compila (IVA es public): el ordenador pasa a tener un 4 % de IVA.
        //    p1.descuento = p2.descuento;  NO compila: descuento es private.

        // g) p1 = p2; hace que p1 apunte al MISMO objeto que p2 (la barra de pan).
        //    El ordenador se queda sin referencias y el recolector de basura lo eliminará.
        //    A partir de ahí, cualquier cambio hecho con p1 se ve también con p2.

        // h) Hay que crear un objeto NUEVO con los mismos valores:
        Producto copia = new Producto(p2.nombre, p2.precio, p2.IVA);
        //    El descuento es private y no tiene getter: para copiarlo habría que añadir
        //    getDescuento() o un constructor copia Producto(Producto otro).
        copia.precio = 2;
        System.out.println("p2: " + p2.precio + ", copia: " + copia.precio);   // independientes

        // i) Muestra 60.0: p4 = p3 no copia el objeto, copia la referencia.
        //    p3 y p4 apuntan al mismo producto, así que el cambio se ve por las dos.
        Producto p3 = new Producto("impresora", 50, 0.21);
        Producto p4 = p3;
        p3.precio = 60;
        System.out.println(p4.precio);
    }
}
