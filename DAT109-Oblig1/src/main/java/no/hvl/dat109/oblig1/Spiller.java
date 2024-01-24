package no.hvl.dat109.oblig1;

public class Spiller {

    private final String navn;
    private final Brikke brikke;
    private final Brett brett;

    public Spiller(String spillerNavn, String farge, Brett brett) {
        this.navn = spillerNavn;
        this.brikke = new Brikke(farge, brett.getStartposisjon());
        this.brett = brett;
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
