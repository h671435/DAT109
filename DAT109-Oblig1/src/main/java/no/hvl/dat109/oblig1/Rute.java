package no.hvl.dat109.oblig1;

public class Rute {

    private final int rutePosisjon;

    @Override
    public String toString() {
        return "" + rutePosisjon;
    }

    public int getRutePosisjon() {
        return rutePosisjon;
    }

    public Rute(int rutePosisjon) {
        this.rutePosisjon = rutePosisjon;
    }
}
