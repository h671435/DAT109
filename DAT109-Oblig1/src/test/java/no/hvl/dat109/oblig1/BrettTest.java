package no.hvl.dat109.oblig1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrettTest {

    @Test
    void getStartposisjon() {
       Brett brett = new Brett();

        assertEquals(0, brett.getStartposisjon().getRutePosisjon());
    }

    @Test
    void finnRute() {
        Brett brett = new Brett();
        Rute rute = brett.finnRute(5);
        assertNotNull(rute);
        assertEquals(5, rute.getRutePosisjon());
    }
}