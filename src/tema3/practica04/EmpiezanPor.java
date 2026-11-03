package tema3.practica04;

/** Práctica 04.3: Strings que empiezan por un carácter. */
public class EmpiezanPor {

    static void mostrarEmpiezanPor(String[] palabras, char letra) {
        for (String p : palabras) {
            if (!p.isEmpty() && p.charAt(0) == letra) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Alba", "Marta", "Andrés"};
        mostrarEmpiezanPor(nombres, 'A');   // Ana, Alba, Andrés
    }
}
