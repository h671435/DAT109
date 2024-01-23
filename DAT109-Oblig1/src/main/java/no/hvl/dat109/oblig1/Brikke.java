package no.hvl.dat109.oblig1;

public class Brikke {
    private final String farge;
    private Rute posisjon;

    public Brikke(String farge, Rute posisjon) {
        this.farge = farge;
        this.posisjon = posisjon;
    }

    public void setPosisjon(Rute posisjon) {
        this.posisjon = posisjon;
    }

    public Rute getPosisjon() {
        return posisjon;
    }
}
