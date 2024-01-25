package no.hvl.dat109.oblig1;

/**
 * Lager en rute som blir brukt i brett
 */
public class Rute {

    private final int rutePosisjon;

    /**
     * Lager en instans av rute
     * @param rutePosisjon Hvor ruten skal være på brettet
     */
    public Rute(int rutePosisjon) {
        this.rutePosisjon = rutePosisjon;
    }

    @Override
    public String toString() {
        return "" + rutePosisjon;
    }

    public int getRutePosisjon() {
        return rutePosisjon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Rute rute = (Rute) o;

	    return rutePosisjon == rute.rutePosisjon;
    }

    @Override
    public int hashCode() {
        return rutePosisjon;
    }
}
