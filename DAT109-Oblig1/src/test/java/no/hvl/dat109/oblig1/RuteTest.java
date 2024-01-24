package no.hvl.dat109.oblig1;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RuteTest {

    @Test
    void getRutePosisjon() {
        Random random = new Random();
        int tilfeldigRutePosisjon = random.nextInt(101);

        Rute rute = new Rute(tilfeldigRutePosisjon);

        int faktiskRutePosisjon = rute.getRutePosisjon();

        assertTrue(faktiskRutePosisjon >= 0 && faktiskRutePosisjon <=100);

    }
}