package no.hvl.dat109.oblig1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrettTest {

    static Brett brett;

    @BeforeAll
    static void setupBrett() {
        brett = new Brett();
    }

    @Test
    void getStartposisjon() {
        assertEquals(0, brett.getStartposisjon().getRutePosisjon());
    }

    @Test
    void finnRute() {
        Rute rute = brett.finnRute(5);
        assertNotNull(rute);
        assertEquals(5, rute.getRutePosisjon());
    }

    @Test
    void testHarStige() {
        Rute stigeSlutt = brett.harStige(new Rute(43));
        assertNotNull(stigeSlutt);
        assertEquals(new Rute(62), stigeSlutt);
    }
}
