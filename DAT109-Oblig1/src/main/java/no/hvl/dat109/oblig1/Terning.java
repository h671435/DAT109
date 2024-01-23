package no.hvl.dat109.oblig1;

import java.util.Random;

public class Terning {
    Random random = new Random();

    public Terning() {
    }

    public int trill() {
        int terningkast = random.nextInt(1, 7); // Ikkje inklusiv sju
        System.out.println("Du trilte: " + terningkast);
        return terningkast;
    }
}
