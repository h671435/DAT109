package no.hvl.dat109.oblig1;

import java.util.Random;

/**
 * Lager en seks sidet terning
 */
public class Terning {
    Random random = new Random();

    /**
     * Lager en seks sidet terning<br>
     *
     * Konstruktør lager en terning instans
     */
    public Terning() {
    }

    /**
     * Returnerer et tilfeldig tall mellom 1 og 6 (som en terning)
     * @return heltall 1-6
     */
    public int trill() {
        int terningkast = random.nextInt(1, 7); // Ikkje inklusiv sju
        System.out.println("Du trilte: " + terningkast);
        return terningkast;
    }
}
