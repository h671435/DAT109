package no.hvl.dat109.oblig1;

import java.util.ArrayList;
import java.util.List;

public class Brett {
    private final List<Rute> ruter;
    private final Rute startposisjon;
    public Brett() {
        this.startposisjon = new Rute(0);
        ruter = new ArrayList<>(100);
        for(int i = 1;i <= 100; i++) {
            ruter.set(i, new Rute(i));
        }
    }

    public Rute getStartposisjon() {
        return startposisjon;
    }
}
