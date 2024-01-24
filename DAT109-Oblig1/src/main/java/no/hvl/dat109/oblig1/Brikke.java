package no.hvl.dat109.oblig1;

/**
 * Lager en brikke som kan flyttes rundt på brettet
 */
public class Brikke {
    private final String farge;
    private Rute posisjon;

    /**
     * Lager en brikke objekt
     * @param farge Hvilke farge brikken skal ha
     * @param posisjon Setter hvilke posisjon brikken starter på
     */
    public Brikke(String farge, Rute posisjon) {
        this.farge = farge;
        this.posisjon = posisjon;
    }

    /**
     * Flytter brikke til gitt posisjon
     * @param posisjon Hvilke posisjon brikken skal flyttes til
     */
    public void setPosisjon(Rute posisjon) {
        this.posisjon = posisjon;
    }

    /**
     * Getter for posisjon
     * @return Hvilke posisjon brikken er på
     */
    public Rute getPosisjon() {
        return posisjon;
    }

    /**
     * Finner posisjonen til brikken i heltall
     * @return Heltall posisjon
     */
    public int hentRutePosisjon() {
        return posisjon.getRutePosisjon();
    }
}
