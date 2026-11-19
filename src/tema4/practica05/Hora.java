package tema4.practica07;

/** Práctica 07: hora del día con validación en los setters. */
public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getHoras() { return horas; }
    public int getMinutos() { return minutos; }
    public int getSegundos() { return segundos; }

    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } else {
            System.out.println("Horas no válidas: " + horas);
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos no válidos: " + minutos);
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos no válidos: " + segundos);
        }
    }

    public int aSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public void avanzarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    public boolean esAnterior(Hora otra) {
        return aSegundos() < otra.aSegundos();
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
