package no.hvl.dat109.oblig1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpillerTest {

    @Test
    void spillTrekk() {

    }

    @Test
    void getNavn() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Player1", "red", brett);

        assertEquals("Player1", spiller.getNavn());
    }

    @Test
    void getBrikke() {
        Brett brett = new Brett();
        Spiller spiller = new Spiller("Player1", "red", brett);

        assertNotNull(spiller.getBrikke());
        assertEquals(brett.getStartposisjon(), spiller.getBrikke().getPosisjon());
    }
}