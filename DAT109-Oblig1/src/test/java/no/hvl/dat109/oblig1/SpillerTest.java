package no.hvl.dat109.oblig1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpillerTest {

    static Brett brett;
    @BeforeAll
    static void setupBrett(){
        brett = new Brett();
    }

    @Test
    void getNavn() {
        Spiller spiller = new Spiller("Player1", "red", brett);

        assertEquals("Player1", spiller.getNavn());
    }

    @Test
    void getBrikke() {
        Spiller spiller = new Spiller("Player1", "red", brett);

        assertNotNull(spiller.getBrikke());
        assertEquals(brett.getStartposisjon(), spiller.getBrikke().getPosisjon());
    }

    @Test
    void testFlyttBrikkeTilRiktigPos() {
        int verdi = 2;
        Spiller spiller = new Spiller("noe", "noe", brett);
        int posisjon = spiller.getBrikke()
                              .hentRutePosisjon();
        spiller.spillTrekk(new Terning() {
            @Override
            public int trill() {
                return verdi;
            }
        });

        assertEquals(posisjon + verdi,
                     spiller.getBrikke()
                            .hentRutePosisjon());
    }

    @Test
    void testStiger() {

        // stige fra 43 -> 62
        int verdi = 43;
        Spiller spiller = new Spiller("noe", "noe", brett);
        spiller.spillTrekk(new Terning() {
            @Override
            public int trill() {
                return verdi;
            }
        });

        assertEquals(
                62,
                spiller.getBrikke()
                       .hentRutePosisjon());

        int posisjon = spiller.getBrikke()
                              .hentRutePosisjon();

        spiller.spillTrekk(new Terning() {
            @Override
            public int trill() {
                return 74 - posisjon;
            }
        });

        assertEquals(
                12,
                spiller.getBrikke()
                       .hentRutePosisjon());
    }
}
