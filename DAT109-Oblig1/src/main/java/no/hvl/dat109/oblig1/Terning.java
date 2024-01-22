package no.hvl.dat109.oblig1;

import java.util.Random;

public class Terning {
    Random random = new Random();

    public Terning() {
    }

    public int trill() {
        return random.nextInt(1, 7); // Ikkje inklusiv sju
    }
}
