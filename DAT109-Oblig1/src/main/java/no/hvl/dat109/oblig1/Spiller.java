package no.hvl.dat109.oblig1;

/**
 * Lager en spiller
 */
public class Spiller {

    private final String navn;
    private final Brikke brikke;
    private final Brett brett;

    /**
     * Lager en spiller instans
     * @param spillerNavn Hvilke navn denne spilleren skal ha
     * @param farge Hvilke farge denne spillern skal ha
     * @param brett Brettet som spilleren skal være knyttet til.
     */
    public Spiller(String spillerNavn, String farge, Brett brett) {
        this.navn = spillerNavn;
        this.brikke = new Brikke(farge, brett.getStartposisjon());
        this.brett = brett;
    }

    /**
     * Kaster terning, sjekker om du er ferdig eller ikke, sjekker om du står på stige
     * og så flytter til stige slutt posisjon
     * @param terning Objekt av terning som blir brukt for å finne neste steg
     */
    public void spillTrekk(Terning terning) {
        int nyPos = terning.trill() + brikke.hentRutePosisjon();
        if (nyPos <= 100) {
            Rute nyRute = brett.finnRute(nyPos);
            brikke.setPosisjon(nyRute);
            System.out.println("Ny posisjon: " + nyPos);
            Rute stigeSlutt = brett.harStige(nyRute);

            if (stigeSlutt != null) {
                brikke.setPosisjon(stigeSlutt);
            }
        } else {
            System.out.println("Du trilte mer enn hundre. Du må treffe hundre presist for å vinna spelet");
        }
    }

    public String getNavn() {
        return navn;
    }

    public Brikke getBrikke() {
        return brikke;
    }

}
