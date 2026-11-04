package tema4.practica06;

/** Práctica 06.3: 10 000 apuestas de 1 € a par. */
public class AppRuleta {

    public static void main(String[] args) {
        Ruleta ruleta = new Ruleta();
        int dinero = 10000;
        for (int i = 0; i < 10000 && dinero > 0; i++) {
            dinero += ruleta.apostarPar(1);
        }
        System.out.println("Dinero final: " + dinero + " €");
        // Conclusión: la probabilidad de ganar es 18/37 (< 1/2) por culpa del 0.
        // De media se pierden unos 10000 * 1/37 ≈ 270 €: a la larga siempre gana la banca.
    }
}
