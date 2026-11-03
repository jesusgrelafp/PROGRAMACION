package tema3.practica10;

/** Práctica 10.3: búsqueda binaria sin recursividad. */
public class BusquedaBinariaIterativa {

    /** Devuelve la posición de buscado en v (ordenado) o -1. */
    static int buscar(int[] v, int buscado) {
        int inf = 0, sup = v.length - 1;
        while (inf <= sup) {
            int mitad = (inf + sup) / 2;
            if (v[mitad] == buscado) {
                return mitad;
            } else if (v[mitad] < buscado) {
                inf = mitad + 1;
            } else {
                sup = mitad - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] v = {1, 3, 5, 7, 9, 11, 13};
        System.out.println(buscar(v, 9));   // 4
        System.out.println(buscar(v, 4));   // -1
    }
}
