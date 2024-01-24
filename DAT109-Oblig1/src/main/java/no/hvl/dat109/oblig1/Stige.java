package no.hvl.dat109.oblig1;

/**
 * Lager en stige / slange
 */
public class Stige {
    private Rute startposisjon;
    private Rute sluttposisjon;

    private StigeEnum retning;

    /**
     * Lager en stige / slange instans
     * @param startposisjon Hvor stigen starter
     * @param sluttposisjon Hvor stigen slutter
     * @param retning Hvilke retning stigen går(OPP / NED)
     */
    public Stige(Rute startposisjon, Rute sluttposisjon, StigeEnum retning) {
        this.startposisjon = startposisjon;
        this.sluttposisjon = sluttposisjon;
        this.retning = retning;
    }

    public StigeEnum getRetning() {
        return retning;
    }

    public Rute getSluttposisjon() {
        return sluttposisjon;
    }

    public Rute getStartposisjon() {
        return startposisjon;
    }
}