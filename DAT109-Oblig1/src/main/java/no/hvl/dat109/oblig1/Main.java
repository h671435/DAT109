package no.hvl.dat109.oblig1;

/**
 * Hovedklassen som inneholder metoden for å starte stigespillet.
 */
public class Main {
    /**
     * Hovedmetode for å starte stigespillet. Oppretter et Stigespill-objekt, initialiserer spillet
     * og starter deretter spillet ved å kalle på spill-metoden.
     *
     * @param args Bruker ikke denne :)
     */
    public static void main(String[] args) {
        Stigespill stige = new Stigespill();
        stige.initSpill();
        stige.spill();
    }
}
