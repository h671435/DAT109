package no.hvl.dat109.oblig1;

import java.util.ArrayList;
import java.util.List;

public class Brett {
    private final List<Rute> ruter;
    private final Rute startposisjon;
    public Brett() {
        this.startposisjon = new Rute(0);
        ruter = new ArrayList<>(106);
        for(int i = 0;i <= 106; i++) {
            ruter.add(new Rute(i+1));
        }
    }

    public Rute getStartposisjon() {
        return startposisjon;
    }

    public Rute finnRute(int n) {
        return ruter.get(n - 1);
    }
}
