package no.hvl.dat109.oblig1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerningTest {

    @Test
    public void trill() {
        Terning terning = new Terning();
        int resultat = terning.trill();

        assertTrue(resultat >=1 && resultat <= 6);
    }
}