package no.hvl.dat109.oblig1;

public class Stige {
    private Rute startposisjon;
    private Rute sluttposisjon;

    private StigeEnum retning;

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