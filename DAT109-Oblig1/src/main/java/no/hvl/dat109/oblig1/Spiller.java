package no.hvl.dat109.oblig1;

public class Spiller {

    private final String navn;
    private final Brikke brikke;

    public Spiller(String spillerNavn, Brikke brikke) {
        this.navn = spillerNavn;
        this.brikke = brikke;
    }

    public void spillTrekk(Terning terning) {
        int steg = terning.trill();
    }
}
