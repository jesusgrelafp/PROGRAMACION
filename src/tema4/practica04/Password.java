package tema4.practica04;

import java.util.Random;

/** Práctica 04: contraseña encapsulada (no se puede modificar desde fuera). */
public class Password {

    private static final int LONGITUD_POR_DEFECTO = 8;
    private static final String CARACTERES =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private int longitud;
    private String contrasena;

    public Password() {
        this(LONGITUD_POR_DEFECTO);
    }

    public Password(int longitud) {
        setLongitud(longitud);
    }

    public int getLongitud() { return longitud; }
    public String getContrasena() { return contrasena; }

    // No hay setContrasena(): la contraseña solo se genera dentro de la clase
    public void setLongitud(int longitud) {
        this.longitud = longitud > 0 ? longitud : LONGITUD_POR_DEFECTO;
        this.contrasena = generarPassword();
    }

    /** Método auxiliar privado: solo lo usa la propia clase. */
    private String generarPassword() {
        Random r = new Random();
        String resultado = "";
        for (int i = 0; i < longitud; i++) {
            resultado += CARACTERES.charAt(r.nextInt(CARACTERES.length()));
        }
        return resultado;
    }

    /** Fuerte: más de 2 mayúsculas, más de 1 minúscula y más de 5 números. */
    public boolean esFuerte() {
        int mayusculas = 0, minusculas = 0, numeros = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }
}
