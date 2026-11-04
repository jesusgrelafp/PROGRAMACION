package tema4.practica03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/** Práctica 03: fechas con LocalDate. */
public class Fechas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Fecha de nacimiento (dd/MM/aaaa): ");
        LocalDate nacimiento = LocalDate.parse(sc.nextLine().trim(), formato);
        LocalDate hoy = LocalDate.now();

        // 1. Edad en años
        long edad = ChronoUnit.YEARS.between(nacimiento, hoy);
        System.out.println("Edad: " + edad + " años");

        // 2. Día de la semana
        String dia = nacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.of("es", "ES"));
        System.out.println("Naciste en " + dia);

        // 3. Año bisiesto
        System.out.println(nacimiento.isLeapYear() ? "Naciste en un año bisiesto" : "No naciste en un año bisiesto");

        // 4. Días hasta el próximo cumpleaños
        LocalDate cumple = nacimiento.withYear(hoy.getYear());   // el 29/02 se ajusta solo al 28/02
        if (cumple.isBefore(hoy)) {
            cumple = cumple.plusYears(1);
        }
        long dias = ChronoUnit.DAYS.between(hoy, cumple);
        System.out.println(dias == 0 ? "¡Hoy es tu cumpleaños!" : "Faltan " + dias + " días para tu cumpleaños");

        // 5. Cuándo cumplirás 10 000 días
        System.out.println("Cumplirás 10 000 días el " + nacimiento.plusDays(10000).format(formato));
        sc.close();
    }
}
