package tema2;


import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes " + mes + " tiene 31 días");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes " + mes + " tiene 30 días");
                break;
            case 2:
                System.out.println("El mes " + mes + " tiene 28 días");
                break;
            default:
                System.out.println("Mes no válido");
        }

        sc.close();
    }
}

