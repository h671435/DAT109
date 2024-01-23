package no.hvl.dat109.oblig1;

public class Spiller {

    private final String navn;
    private final Brikke brikke;

    public Spiller(String spillerNavn, Brikke brikke) {
        this.navn = spillerNavn;
        this.brikke = brikke;
    }

    public int spillTrekk(Terning terning) {
        return terning.trill() + brikke.getPosisjon().getRutePosisjon();
    }

    public void flyttBrikke(Rute nyPos) {
        brikke.setPosisjon(nyPos);
    }

    public String getNavn() {
        return navn;
    }

    public Brikke getBrikke() {
        return brikke;
    }

}
